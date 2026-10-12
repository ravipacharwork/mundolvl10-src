# mundolvl10 — reverse-engineered source tree

Reconstruction of `mundolvl10.aar` (Android AAR, "Mundo" app-virtualization
framework). See **[findings.md](findings.md)** for the analysis report and
**[src-native/notes.md](src-native/notes.md)** for the native library.

## Layout
```
artifacts/                     original AAR + extracted members + REA evidence JSON
  mundolvl10.aar               original input (SHA-256 in findings.md)
  aar-extracted/               unzip: classes.jar, jni/.../libxdfw8yegr.so, ...
  AndroidManifest.decoded.xml  human-readable manifest
  proguard.txt                 keep rules
  rea-*.json                   REA inspect-artifact evidence
src-java/sources/              decompiled Java (504 files), package tree
src-res/resources/             JADX-decoded resources (manifest, META-INF)
src-native/                    ELF notes, strings, interface map
```

## Java packages
- `net_62v/external` — public SDK.
- `top/bienvenido/mundo/common` — JNI init (`MNative`), ext shims, reflection.
- `top/bienvenido/mundo/manifest` — 24 stub components + entries.
- `top/bienvenido/mundo/supervisor` — provider entry point.
- `top.bienvenido.mundo.blockade` — hook layer.
- `top/bienvenido.date_24323` — 381-class obfuscated engine.

## How it was reconstructed (reproducible)
```sh
# 1. extract
unzip mundolvl10.aar -d artifacts/aar-extracted

# 2. Java source (JADX, pure Java)
#    JADX 1.5.6 from https://github.com/skylot/jadx/releases
jadx -j 2 --show-bad-code -d src-java artifacts/aar-extracted/classes.jar

# 3. resources/manifest
jadx --no-src -d src-res artifacts/mundolvl10.aar

# 4. native static analysis (binutils + radare2)
readelf -h -d -n --dyn-syms -W artifacts/aar-extracted/jni/arm64-v8a/libxdfw8yegr.so
rabin2 -I artifacts/aar-extracted/jni/arm64-v8a/libxdfw8yegr.so
objdump -d --start-address=0x553b0 --stop-address=0x55494 \
  artifacts/aar-extracted/jni/arm64-v8a/libxdfw8yegr.so
```

## Rebuild (optional)
This is a decompiled snapshot, not a buildable Gradle module. To make it
buildable, create a Gradle library module and re-add the JNI sources; the
decompiled Java is not guaranteed to compile as-is (JADX artifacts, R8 names).
