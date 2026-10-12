# mundolvl10.aar — source reconstruction

Total reconstruction of `mundolvl10.aar` (SHA-256
`2a5870792f4674c64fc8aa6c5bccdfb1aa2694fec07843fb64c40837b356adc2`)
into a buildable Android library project, reconstructed with JADX 1.5.6 and
radare2 6.1.8 (Termux/aarch64).

## Layout (1:1 with the AAR)
```
library/src/main/
  AndroidManifest.xml         package="top.bienvenido.mundo" (host app-virt/multi-open)
  java/net_62v/external/...   public SDK facade (MetaCore, MetaActivityManager, ...)
  java/top/bienvenido/mundo/... public framework + 24 stub activity/provider/service sets
  java/top/bienvenido/date_24323/... private (R8-obfuscated) engine, 381 classes
  jniLibs/arm64-v8a/libxdfw8yegr.so  native core (PC-less: see ../src-native/)
consumer-proguard-rules.pro   keep rules shipped with the AAR
```

## Contents of the AAR
- `classes.jar` 872 KB / 902 classes -> 504 `.java` files
- `jni/arm64-v8a/libxdfw8yegr.so` 874 KB (stripped, PAC/BTI, CFG-flattened)
- `proguard.txt` (keep rules), empty `R.txt`, binary `AndroidManifest.xml`

## To build
- **GitHub Actions (no PC needed):** push this repo; the workflow
  `.github/workflows/build-aar.yml` builds `:library:assembleRelease` on an
  `ubuntu-latest` runner (JDK 17 + Android SDK, Gradle 8.7) and uploads the
  resulting AAR + build reports as artifacts. Re-run from the Actions tab.
- **Locally on a PC:** open this folder in Android Studio or run:
  ```
  ./gradlew :library:assembleRelease
  ```
  Requires JDK 17+ and Android SDK `compileSdk 34`. AGP 8.5.1 will download
  the rest.

## Caveats
- All classes come from a decompiler, not original source. R8 stripped names:
  the `date_24323` engine uses machine-generated identifiers and doesn't
  reproduce as readable source by design.
- 2 files contain incomplete method bodies (JADX RegionMaker failure):
  `top/bienvenido/date_24323/w.java`, `top/bienvenido/date_24323/h6.java`.
- The framework was validated against the binary manifest; some classes may
  reference third-party SDKs (Facebook login path etc.) — add them to the
  classpath or stub them before compiling.
- `R.txt` is empty: no resources live in the library itself. UI strings are
  served by the host app.

## Provenance
Identified as the "Mundo"/app-virtualization framework (vendor `62v.net`,
public SDK `net_62v.external`). Rebuilt for analysis; verify legal rights
before redistribution.