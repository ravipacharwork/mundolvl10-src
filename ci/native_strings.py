#!/usr/bin/env python3
"""Best-effort string/constant recovery from an ARM64 Android .so that uses
OLLVM string encryption (goron/Arkari `cse`).

Two passes:
  1. Raw extraction (ASCII/UTF-16LE) from the file and the deobfuscated file.
  2. Lightweight Unicorn emulation of small/leaf functions and of the two
     exported entry points (JNI_OnLoad, Mundo_Activate_SDK) with a permissive
     stub environment, then scan memory for strings that were materialised at
     runtime (stack-based string decryption).

This is heuristic and cannot recover strings that are only decrypted deep in
call chains; it is a best-effort supplement to the decompiled sources.

Usage: native_strings.py <orig.so> <deobf.so> <outdir>
"""
import os
import re
import sys

PRINTABLE = re.compile(rb"[\x20-\x7e]{4,}")
PRINTABLE_W = re.compile(rb"(?:[\x20-\x7e]\x00){4,}")


def raw_strings(path, minlen=4):
    if not os.path.isfile(path):
        return []
    data = open(path, "rb").read()
    out = set()
    for m in re.finditer(rb"[\x20-\x7e]{%d,}" % minlen, data):
        out.add(m.group().decode("latin-1"))
    for m in re.finditer(b"(?:[\x20-\x7e]\x00){%d,}" % minlen, data):
        out.add(m.group().decode("utf-16-le", "ignore"))
    return sorted(out)


def parse_load_segments(path):
    data = open(path, "rb").read()
    if data[:4] != b"\x7fELF" or data[4] != 2:
        raise ValueError("not ELF64")
    e_phoff = int.from_bytes(data[0x20:0x28], "little")
    e_phentsize = int.from_bytes(data[0x36:0x38], "little")
    e_phnum = int.from_bytes(data[0x38:0x3a], "little")
    segs = []
    for i in range(e_phnum):
        off = e_phoff + i * e_phentsize
        p_type = int.from_bytes(data[off:off + 4], "little")
        if p_type != 1:  # PT_LOAD
            continue
        p_flags = int.from_bytes(data[off + 4:off + 8], "little")
        p_offset = int.from_bytes(data[off + 8:off + 16], "little")
        p_vaddr = int.from_bytes(data[off + 16:off + 24], "little")
        p_filesz = int.from_bytes(data[off + 32:off + 40], "little")
        p_memsz = int.from_bytes(data[off + 40:off + 48], "little")
        segs.append((p_vaddr, p_offset, p_filesz, p_memsz, p_flags))
    return data, segs


def dyn_symbol_addr(path, name):
    data, segs = parse_load_segments(path)
    # parse section headers to find .dynsym/.dynstr (SHT_DYNSYM=11)
    e_shoff = int.from_bytes(data[0x28:0x30], "little")
    e_shentsize = int.from_bytes(data[0x3a:0x3c], "little")
    e_shnum = int.from_bytes(data[0x3c:0x3e], "little")
    e_shstrndx = int.from_bytes(data[0x3e:0x40], "little")

    def sh(i):
        o = e_shoff + i * e_shentsize
        return {
            "name": int.from_bytes(data[o:o + 4], "little"),
            "type": int.from_bytes(data[o + 4:o + 8], "little"),
            "off": int.from_bytes(data[o + 24:o + 32], "little"),
            "size": int.from_bytes(data[o + 32:o + 40], "little"),
            "link": int.from_bytes(data[o + 40:o + 44], "little"),
            "entsize": int.from_bytes(data[o + 56:o + 64], "little"),
        }

    sections = [sh(i) for i in range(e_shnum)]
    dynsym = next((s for s in sections if s["type"] == 11), None)
    if not dynsym:
        return None
    strtab = sections[dynsym["link"]]
    n = dynsym["size"] // dynsym["entsize"] if dynsym["entsize"] else 0
    for i in range(n):
        o = dynsym["off"] + i * dynsym["entsize"]
        st_name = int.from_bytes(data[o:o + 4], "little")
        st_value = int.from_bytes(data[o + 8:o + 16], "little")
        st_info = data[o + 4]
        if st_info & 0xF != 2:  # STT_FUNC
            continue
        no = strtab["off"] + st_name
        end = data.find(b"\x00", no)
        nm = data[no:end].decode("latin-1")
        if nm == name:
            return st_value
    return None


def emulate_and_scan(path, func_addr, max_insns=200000):
    from unicorn import Uc, UC_ARCH_ARM64, UC_MODE_ARM, UC_HOOK_MEM_UNMAPPED
    from unicorn import UC_PROT_ALL
    from unicorn.arm64_const import UC_ARM64_REG_LR, UC_ARM64_REG_PC, \
        UC_ARM64_REG_X0, UC_ARM64_REG_SP

    data, segs = parse_load_segments(path)
    uc = Uc(UC_ARCH_ARM64, UC_MODE_ARM)
    mapped = []
    for vaddr, off, filesz, memsz, flags in segs:
        base = vaddr & ~0xFFF
        size = ((vaddr + memsz) - base + 0xFFF) & ~0xFFF
        uc.mem_map(base, max(size, 0x1000), UC_PROT_ALL)
        uc.mem_write(vaddr, data[off:off + filesz])
        mapped.append((base, base + max(size, 0x1000)))
    # stack + scratch
    stack = 0x7F00000000
    uc.mem_map(stack, 0x100000, UC_PROT_ALL)
    heap = 0x6000000000
    uc.mem_map(heap, 0x800000, UC_PROT_ALL)
    scratch = 0x5000000000
    uc.mem_map(scratch, 0x10000, UC_PROT_ALL)

    def in_mapped(addr):
        return any(lo <= addr < hi for lo, hi in mapped)

    def hook_unmapped(uc_, access, address, size, value, user):
        try:
            # permissive: emulate unknown calls as returning 0
            uc_.reg_write(UC_ARM64_REG_PC, uc_.reg_read(UC_ARM64_REG_LR))
            return True
        except Exception:
            return False

    def hook_fetch(uc_, address, size, user):
        try:
            lr = uc_.reg_read(UC_ARM64_REG_LR)
            if not in_mapped(address):
                if in_mapped(lr):
                    uc_.reg_write(UC_ARM64_REG_PC, lr)
                else:
                    uc_.emu_stop()
            return True
        except Exception:
            return False

    from unicorn import UC_HOOK_MEM_UNMAPPED as HMU
    uc.hook_add(HMU, hook_unmapped)
    try:
        from unicorn import UC_HOOK_BLOCK
        # fetch hook requires code hook registration; use mem fetch hook
        from unicorn import UC_HOOK_MEM_FETCH_UNMAPPED
        uc.hook_add(UC_HOOK_MEM_FETCH_UNMAPPED, hook_fetch)
    except Exception:
        pass

    uc.reg_write(UC_ARM64_REG_SP, stack + 0x80000)
    uc.reg_write(UC_ARM64_REG_LR, 0xDEAD00000000)  # sentinel -> fetch unmapped -> stop
    uc.reg_write(UC_ARM64_REG_X0, 0x7000000000)    # fake JavaVM
    try:
        uc.emu_start(func_addr, 0xDEAD00000000, count=max_insns)
    except Exception as e:
        sys.stderr.write("emu %#x: %s\n" % (func_addr, e))

    found = set()
    for base, size in mapped + [(stack, 0x100000), (heap, 0x800000)]:
        try:
            buf = uc.mem_read(base, size)
        except Exception:
            continue
        b = bytes(buf)
        for m in re.finditer(rb"[\x20-\x7e]{5,}", b):
            found.add(m.group().decode("latin-1"))
    return found


def main():
    if len(sys.argv) < 4:
        sys.exit("usage: native_strings.py <orig.so> <deobf.so> <outdir>")
    orig, deobf, outdir = sys.argv[1], sys.argv[2], sys.argv[3]
    os.makedirs(outdir, exist_ok=True)

    raw = set(raw_strings(orig)) | set(raw_strings(deobf))
    with open(os.path.join(outdir, "raw_strings.txt"), "w") as f:
        f.write("\n".join(sorted(raw)))
    print("raw strings: %d" % len(raw))

    runtime = set()
    for target in ("JNI_OnLoad", "Mundo_Activate_SDK"):
        for so in (deobf, orig):
            if not os.path.isfile(so):
                continue
            try:
                addr = dyn_symbol_addr(so, target)
                if addr:
                    s = emulate_and_scan(so, addr)
                    runtime |= s
                    print("emulated %s @ %#x in %s -> %d strings" % (
                        target, addr, os.path.basename(so), len(s)))
            except Exception as e:
                sys.stderr.write("skip %s/%s: %s\n" % (so, target, e))

    novel = sorted(runtime - raw)
    with open(os.path.join(outdir, "runtime_strings.txt"), "w") as f:
        f.write("\n".join(sorted(runtime)))
    with open(os.path.join(outdir, "recovered_novel_strings.txt"), "w") as f:
        f.write("\n".join(novel))
    print("runtime strings: %d (novel: %d)" % (len(runtime), len(novel)))


if __name__ == "__main__":
    main()
