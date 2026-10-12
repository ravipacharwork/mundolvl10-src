#!/usr/bin/env python3
"""Drive the xiaojianbang8888 OLLVM deobfuscator over every function of an
ARM64 ELF, applying all patches cumulatively into a single output .so.

Usage:
    python ollvm_deobf_driver.py <input.so> <functions.txt> <output.so> \
        [--tool DIR] [--min-size N] [--max-size N] [--timeout S] [--log FILE]

<functions.txt> is the Ghidra export: lines "0xADDR SIZE NAME".
"""
import argparse
import importlib.util
import os
import signal
import sys
import time


class Timeout(Exception):
    pass


def _alarm(signum, frame):
    raise Timeout()


def load_tool(tool_dir):
    path = os.path.join(tool_dir, "ollvm_deobfuscator.py")
    if not os.path.isfile(path):
        sys.exit(f"[driver] tool not found: {path}")
    spec = importlib.util.spec_from_file_location("od", path)
    mod = importlib.util.module_from_spec(spec)
    spec.loader.exec_module(mod)
    return mod


def read_functions(path):
    funcs = []
    with open(path) as f:
        for line in f:
            line = line.strip()
            if not line or line.startswith("#"):
                continue
            parts = line.split()
            if len(parts) < 2 or not parts[0].startswith("0x"):
                continue
            try:
                addr = int(parts[0], 16)
                size = int(parts[1])
            except ValueError:
                continue
            name = parts[2] if len(parts) > 2 else ""
            funcs.append((addr, size, name))
    funcs.sort()
    return funcs


def main():
    ap = argparse.ArgumentParser()
    ap.add_argument("input")
    ap.add_argument("functions")
    ap.add_argument("output")
    ap.add_argument("--tool", default="OLLVM_Deobfuscator")
    ap.add_argument("--min-size", type=int, default=24)
    ap.add_argument("--max-size", type=int, default=2000000)
    ap.add_argument("--timeout", type=int, default=120)
    ap.add_argument("--log", default="ollvm_deobf.log")
    args = ap.parse_args()

    od = load_tool(args.tool)

    print(f"[driver] loading {args.input}")
    elf = od.ELFLoader(args.input)
    patcher = od.PatchGenerator(elf.data)

    funcs = read_functions(args.functions)
    print(f"[driver] {len(funcs)} functions from {args.functions}")

    signal.signal(signal.SIGALRM, _alarm)

    n_done = 0
    n_skipped = 0
    n_failed = 0
    n_cff = 0
    n_ind = 0
    patches_total = 0

    log = open(args.log, "w")
    log.write("# addr size patches type status name\n")

    for addr, size, name in funcs:
        if size < args.min_size:
            n_skipped += 1
            continue
        if size > args.max_size:
            n_skipped += 1
            continue
        end = addr + size
        before = patcher.patches_applied
        status = "ok"
        ob = "?"
        try:
            code = elf.read_at_vaddr(addr, size)
            blocks = od.extract_basic_blocks(code, addr)
            ob = od.detect_obfuscation_type(blocks)
            signal.alarm(args.timeout)
            try:
                if ob == "cff":
                    od.process_cff(elf, blocks, addr, end, patcher)
                    n_cff += 1
                elif ob in ("indirect", "indirect_branch"):
                    od.process_indirect_branch(elf, blocks, addr, end, patcher)
                    n_ind += 1
            finally:
                signal.alarm(0)
            if patcher.patches_applied == before:
                status = "nochange"
        except Timeout:
            status = "timeout"
            n_failed += 1
        except Exception as e:  # noqa: BLE001
            status = "error:%s" % type(e).__name__
            n_failed += 1
        delta = patcher.patches_applied - before
        patches_total += delta
        if status == "ok":
            n_done += 1
        log.write("%#x %d %d %s %s %s\n" % (addr, size, delta, ob, status, name))
        log.flush()
        if (n_done + n_failed) % 50 == 0:
            print("[driver] %d processes, %d patches, %d skipped" % (
                n_done + n_failed, patches_total, n_skipped))

    log.close()
    patcher.save(args.output)
    print("[driver] functions processed: %d (cff=%d indirect=%d)" %
          (n_done, n_cff, n_ind))
    print("[driver] skipped: %d  failed: %d  patches applied: %d" %
          (n_skipped, n_failed, patches_total))
    print("[driver] wrote %s" % args.output)


if __name__ == "__main__":
    main()
