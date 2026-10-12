# Native library recovery report

Target: `libxdfw8yegr.so` (arm64-v8a, 874200 bytes, SHA-256
`d0ccfcfc3c584cb2b8a035a1950d8979295b9e972f9d0437e6ef1028623c8836`).

## Protection

The ELF `.comment` section leaks the toolchain that built the library:

```
Android clang version 19.0.0 (...)
Linker: LLD 19.1.3 (git@github.com:KomiMoe/Arkari.git 00e8384becbbf868ef65e42f2c2957b4505ce9fc)
clang version 19.1.3 (git@github.com:KomiMoe/Arkari.git ...)
```

Arkari is an LLVM obfuscator in the Goron / Hikari / OLLVM lineage. Passes
inferred from the binary (`r2` finds only ~71 functions, `.rodata` is tiny at
~6 KB while `.data` is ~100 KB):

- `fla` - control-flow flattening
- `indbr` - indirect branches with encrypted targets
- `icall` - indirect calls with encrypted target addresses
- `indgv` - indirect global-variable references with encrypted addresses
- `cse` - C-string encryption
- `cie` / `cfe` - integer / floating-point constant encryption

Only two functions are exported (`JNI_OnLoad` 96 B, `Mundo_Activate_SDK`
132 B); all real logic lives in stripped internal functions.

## What was recovered

- `libxdfw8yegr_deobf.so` - control flow partially un-flattened by the
  Unicorn-based OLLVM deobfuscator. See `ollvm_deobf.log` for the per-function
  patch report.
- `functions.txt` - every function boundary exported from Ghidra
  (`start size name`).
- `ghidra-c/`, `retdec-c/`, `snowman-c/` - three independent C decompilations
  of the deobfuscated binary, kept as separate trees for cross-reading.
- `strings/` - raw ASCII/UTF-16 strings plus best-effort runtime-decrypted
  strings from `JNI_OnLoad` / `Mundo_Activate_SDK`.

## Ceiling (honest)

A compiled, optimized and obfuscated binary does not contain its original
source. Exact reconstruction is information-theoretically impossible: local
variable names, types, comments, macros and code structure are lost during
compilation, and obfuscation additionally scrambles control flow, constants
and strings. This pipeline maximises readability (recovered control flow,
constants and strings) but the result remains reconstructed pseudo-C, not the
upstream source.
