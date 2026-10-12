# Native library analysis — `libxdfw8yegr.so`

Path: `artifacts/aar-extracted/jni/arm64-v8a/libxdfw8yegr.so`
SHA-256: `d0ccfcfc3c584cb2b8a035a1950d8979295b9e972f9d0437e6ef1028623c8836`

## ELF facts (`readelf`, `rabin2`)
| Property | Value |
|---|---|
| Class / machine | ELF64, AArch64 |
| Type | DYN (PIE shared object) |
| Subsystem / OS | Android (bionic) |
| Compiler | Android clang 19.0.0 (NDK **r28**), +pgo +bolt +lto +mlgo |
| Stripped | yes (no static symtab, no line info) |
| GNU build-id | `c17adfd2b39aaeffe362a9b73b4882ed0835cceb` |
| NEEDED | `libm.so`, `libdl.so`, `libc.so` |
| SONAME | `libxdfw8yegr.so` |
| Mitigations | PIE, NX, stack canary, **full RELRO + BIND_NOW** |
| `.text` size | 0x6f4dc (~456 KB) |
| `.data` size | 0x18de0 (~101 KB) |
| Relocations | 10,921 RELA (`.rela.dyn`) |

## Exported dynamic symbols (only 4)
```
JNI_OnLoad              (FUNC, 96 bytes)   @ 0x553b0
Mundo_Activate_SDK      (FUNC, 132 bytes)  @ 0x55410
__start___lcxx_override (NOTYPE)           @ 0xbb48c
__stop___lcxx_override  (NOTYPE)           @ 0xbb4e8
```
There is **no `Java_*` exported symbol**. The Java native method
`top.bienvenido.mundo.common.initialize.MNative.ioctl` is therefore bound at
runtime (dynamic registration / JNI_OnLoad), not via name mangling.

## Imports (49) — selected notable ones
`dlopen`, `dlsym`, `dlclose`, **`syscall`**, `__system_property_get`,
`pthread_key_create/getspecific/setspecific/once`, `getauxval`, `getpid`,
`getuid`, `openlog`/`syslog`/`closelog`, `android_set_abort_message`,
`__memcpy_chk`/`__memset_chk`/`__vsprintf_chk`/`__open_2`/`__read_chk`
(fortified), plus standard libc/alloc.

`syscall` + `dlopen`/`dlsym` + `__system_property_get` are consistent with a
hardened/anti-hook native core that resolves things at runtime and can issue
raw syscalls to bypass libc-level interception.

## Obfuscation / packing indicators
- Both exported entry points (`JNI_OnLoad`, `Mundo_Activate_SDK`) are
  **trampolines**: they compute an index and offset from constants and `blr`
  into a function pointer loaded from a table:
  ```
  adrp x20, 0xc5000 ; ldr x8,[x20,#0xca8]   ; table base pointer
  mov  x9, #0x95c810edac68d2f6          ; opaque "index"
  ldr  x8, [x8, x9]                      ; load target
  add  x8, x8, x21                       ; add offset
  blr  x8
  ```
  This is a classic control-flow / constant-indirection obfuscation.
- `strings` yields only **762** strings, almost all of them mangled artifacts of
  `.text` bytes (garbage). There are **no readable** class names, method
  signatures, URLs, or `RegisterNatives` name strings in the binary — the real
  strings are encrypted and decrypted at runtime.
- Result: static string/hash recovery is not possible without unpacking or
  dynamic instrumentation.

## JNI interface — `ioctl(int code, Object)`
The single native method is a multiplexed dispatcher. Call sites in the
decompiled Java pass these `code` values:

| code | Argument type | Observed meaning / context |
|---|---|---|
| `1001` | `Object[]{IBinder, String}` | Bind native binder from Bundle key `https://www.62v.net/jnative/binder`; linkToDeath; **activation** path (`i4.java`) |
| `1003` | `Object[]{Context, AttributionSource, callback}` | Process/attribution setup (`h6.java`) |
| `62426` | `String` | Feed a key/token string to native (`p3.java` `m417`) |
| `62427` | `null` | Query a boolean state (returns `"true"/"false"`) — used as "activated" gate |
| `62429` | `String` | Transform/derive a string (`m413`) |
| `62431` | `String` (32 hex) | Resolve/return a `Class` object (`r5.java`) |
| `62432` | `null` | Return a value stringified (`n6.java`) |
| `62434` | `String` (64–96 hex) | Resolve keyed blob → returns `String`/`Object`/`Class`; most used |

Hex arguments to `62434` / `62431` look like digests/encrypted key material
(e.g. `2379a0fb1cc59a8a...`, `b80f5549d3fb49cb...`). The native side maps these
opaque keys to values, so the Java layer never contains plaintext.

`Mundo_Activate_SDK` is an exported C entry (not a JNI symbol) with the same
trampoline shape as `JNI_OnLoad`; it is the SDK activation handle.

## Domain indicator
```
https://www.62v.net/jnative/binder
```
`62v.net` is the vendor domain; `net_62v.external` is the public SDK package.

## What was NOT obtained (limitations)
- Real native decompilation (stripped + obfuscated indirection). No Ghidra/Hopper
  on this host (REA reports `android arm64` as `unsupported_host`).
- Decrypted strings / the `RegisterNatives` table → would require dynamic
  analysis (Frida/emulator) or an unpacking step.
