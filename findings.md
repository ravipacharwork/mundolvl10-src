# Findings — `mundolvl10.aar`

Reverse-engineering report. Target SHA-256:
`2a5870792f4674c64fc8aa6c5bccdfb1aa2694fec07843fb64c40837b356adc2`

> Analysis performed locally on the supplied artifact. Static only — the code
> was never executed.

## 1. What it is

An Android library (AAR) implementing an **app-virtualization / "parallel app"
(multi-open) framework**, internally named **Mundo** (vendor domain `62v.net`,
package root `top.bienvenido.mundo`, SDK surface `net_62v.external`).

It is designed to run a **cloned instance** of a host app inside hidden stub
processes, with native-assisted hooking and an SDK activation/licensing layer.

## 2. Contents

| Member | Size | Notes |
|---|---|---|
| `classes.jar` | 872 KB | 902 classes (504 decompiled to Java) |
| `AndroidManifest.xml` | binary | decoded → `artifacts/AndroidManifest.decoded.xml` |
| `jni/arm64-v8a/libxdfw8yegr.so` | 874 KB | native core, **stripped + obfuscated** |
| `proguard.txt` | — | keep rules (see below) |
| `R.txt` | 0 | no resources |

AAR metadata: minCompileSdk 34, core library desugaring off.

## 3. Java architecture (decompiled → `src-java/sources/`)

```
net_62v/external/                  public SDK facade (9 classes)
  IMundoProcessCallback            host callback: onCreate(name..., pkg),
                                   onInitialized(), shouldInterpretFacebookBrowser()
  MetaCore                         getHostContext, attachMetaBase,
                                   registerCoreCallback, setProcessLifecycleCallback,
                                   addServiceInterpreter, crash-log helpers
  MetaActivityManager / MetaPackageManager / MetaApplicationInstaller /
  MetaStorageManager / MetaActivationManager
  C0000 / C0001                    adapter wrappers

top/bienvenido/mundo/
  common/initialize/MNative        JNI entry: loadLibrary("xdfw8yegr");
                                   static native Object ioctl(int, Object)
  common/ext/                      Binder/IPC shims (account, service, BLE, cache)
  common/reflection/MundoReflectionStub   reflective stub helpers
  manifest/                       24 Activity/Provider/Service "STUB" sets + entries
  supervisor/MundoSupervisorProvider     content provider entry point
  blockade/sm/                     small hook/sm layer
  date_24323/                      381 obfuscated engine classes (a, a0.., b3, n6, ...)
```

The real engine lives in the obfuscated `top.bienvenido.date_24323` package
(381 classes); the rest is the public surface and the manifest scaffolding.

## 4. Manifest highlights (`MundoSupervisorProvider`, stub processes)

- Package `top.bienvenido.mundo`, `installLocation=preferExternal`,
  `allowNativeHeapPointerTagging=false` (required for pointer-level hooking),
  `usesCleartextTraffic=true`.
- Permissions: `INTERNET`, `REORDER_TASKS`, `ACCESS_NETWORK_STATE`.
- **24 stub Activity sets** (`:stub1` … `:stub24`), each with its own
  `taskAffinity` (`…taskN`) and landscape ("H") variants → one slot per cloned
  instance.
- **24 exported stub ContentProviders** (`<appId>.provider.stubN`,
  `grantUriPermissions=true`) and 24 stub `Service`s
  (`foregroundServiceType` abuses many types incl. phoneCall/health).
- `MundoSupervisorProvider` at `<appId>.service.provider`.
- An exported `MundoIntermediary` Activity (CHOOSER) and activity-alias
  **`FBLoginAbility`** ("Facebook Login") registered for `fbconnect` schemes,
  including hosts **`cct.com.tencent.ig`** (PUBG Mobile), **`cct.com.pubg.imobile`**
  (PUBG Mobile Global), and schemes `tencent1106545419`, `imobile1450`.

→ Target use-case evidenced by the manifest: **cloning/hooking PUBG Mobile**,
including **Facebook-login interception**.

## 5. Native core (`libxdfw8yegr.so`) — summary
See `src-native/notes.md`. Key points:
- AArch64, PIE, full RELRO/BIND_NOW, canary, Android NDK r28 clang, **stripped**.
- Only 4 exports: `JNI_OnLoad`, `Mundo_Activate_SDK`, plus `__lcxx_override`
  markers. **No `Java_*` symbol** → the native method is registered at runtime.
- Both entry points are obfuscated **trampolines** into a pointer table
  (constant indirection) — typical of an anti-analysis/hardened core.
- Imports `syscall`, `dlopen`, `dlsym`, `__system_property_get` → runtime
  resolution + raw syscalls (anti-hook intent).
- Only 762 strings, all noise → **real strings are encrypted**.
- Single JNI method `ioctl(code, Object)` is a **multiplexed dispatcher**
  (codes `1001`, `1003`, `62426`, `62427`, `62429`, `62431`, `62432`, `62434`).
  `1001` binds a native binder from Bundle key
  **`https://www.62v.net/jnative/binder`**; `62427` returns the activation gate.

## 6. SDK / activation flow (reconstructed)

1. Host app calls `MetaCore.attachMetaBase(context)` → `MetaActivityManager.initialize`.
2. Public SDK classes delegate into obfuscated `date_24323` engine.
3. Activation (`p3.java`): reads `meta-data` key **`MUNDO_APP_KEY`** from the
   host manifest, pushes it to native via `ioctl(62426, key)`, then polls
   `ioctl(62427)` for a boolean "activated" state (retry ≤ 3).
4. Native binder set up via `ioctl(1001, {IBinder, nonce})` using the
   `62v.net/jnative/binder` bundle key.
5. `ioctl(62434, <hex-key>)` resolves opaque keyed values/classes used by the
   engine; `62431` resolves a class from a 32-hex key.

## 7. Obfuscation facts
- Class/field/method names in `date_24323` are R8-minified (`a`…`z`, `a0`…) and
  some original names are abusive non-printable strings (leftover from the
  vendor's obfuscation).
- `proguard.txt` keeps native methods and the `top.bienvenido.mundo.common.*`
  public API, confirming the intended SDK boundary.
- Native: stripped + constant-indirection trampolines + encrypted strings.

## 8. Reconstruction status
| Layer | Result |
|---|---|
| Manifest / components | ✅ fully decoded |
| Java (SDK + manifest + globals) | ✅ decompiled, 504 files |
| Obfuscated engine (`date_24323`) | ⚠️ decompiled but names/semantics opaque |
| Native `.so` | ⚠️ ELF/symbols/imports + interface map; no clean C |

## 9. Limitations & how to go further
- REA declares `android arm64` an `unsupported_host`; its native providers
  (Hopper/Ghidra/IDA) and pwntools ELF layout are unavailable here.
- To recover native semantics: unpack the trampoline table, or run dynamic
  analysis (Frida on a rooted device/emulator) to dump decrypted strings and
  the `RegisterNatives` table, then feed the dump to Ghidra on a desktop.
- Java side can be improved with JADX deobfuscation (`--deobf`) and by mapping
  the `ioctl` codes to runtime behaviour.

## 10. Responsible use
Analysis of an artifact the operator supplied and is authorized to examine.
No repackaging, no runtime execution of the target was performed.
