# radare2 analysis — what was produced

Tools: radare2 6.1.8 (aarch64), `readelf`, `objdump`.
Target: `artifacts/aar-extracted/jni/arm64-v8a/libxdfw8yegr.so`

## Files
| File | Content |
|---|---|
| `functions.txt` | 311 analyzed functions (274 real + 37 imports) |
| `pdc-all.txt` | pseudo-C for every function (~60k lines) |
| `disasm-all.txt` | full disassembly of every function (~62k lines) |
| `so-strings.txt` | `strings -n 5` (762 strings, all noise) |
| `r2-pdc.md` | targeted pseudo-C of `JNI_OnLoad` + `Mundo_Activate_SDK` |

## How functions were recovered
`aaa` finds only the 37 imports and entry points (stripped binary). The real
code sits behind an obfuscated pointer-table. 299 canonical function prologues
(`paciasp`) were located by byte pattern and turned into functions via an r2
script (`defines.r2c`).

## Key numbers (obfuscation fingerprint)
- Indirect branches (`blr` / `br`): **3,941**
- Direct calls (`bl`): **177**
- Ratio ≈ 22:1 — a control-flow-flattening / constant-indirection obfuscator.
- `paciasp` prologues: 299 → nearly every function is a PAC-protected function.
- Pseudo-C shows `switch xN / bti j` dispatch triads + 64-bit opaque constants
  (`movk` chains) everywhere → classic OLLVM-style flattening.
- 10,921 RELA relocations; `Mundo_Activate_SDK` itself is 1056 bytes of tramp+table.

## What this means
The native core is deliberately hostile to static analysis. The recovered
pseudo-C is a faithful machine view but not readable C:
- calls go through `callreg x8` (indirect, constants + base-table),
- string/name references are not materialized (encrypted at rest).

## Verdict
r2 gives us the **shape** (function map, sizes, call structure, mitigations)
and a complete instruction-level record. Recovering high-level semantics still
requires dynamic analysis (Frida) or an off-phone Ghidra session.