# Memory — mundolvl10 reverse engineering

> Managed by opencode. This is your project's memory — edit it freely.

## Project
- **Goal:** Fully reverse engineer `mundolvl10.aar` and reconstruct readable source (Java/Kotlin + native `.so` best-effort), using REA CLI + JADX + radare2/binutils.
- **Last worked:** 2026-10-12

## Progress Log
- 2026-10-12: Created project. Copied AAR to `artifacts/`. AAR SHA-256 `2a5870792f4674c64fc8aa6c5bccdfb1aa2694fec07843fb64c40837b356adc2`. Extracted to `artifacts/aar-extracted/` (AndroidManifest.xml binary, classes.jar 872KB, jni/arm64-v8a/libxdfw8yegr.so 874KB, proguard.txt, R.txt empty). Host has Node 24.17, OpenJDK 21, binutils, radare2; JADX missing.
- 2026-10-12: Installed JADX 1.5.6 to `~/tools/jadx`. Decompiled classes.jar → `src-java/sources/` (504 Java files, 902 classes). Decoded manifest+resources via `jadx --no-src` → `src-res/` and `artifacts/AndroidManifest.decoded.xml`.
- 2026-10-12: Native analysis with binutils/rabin2 → `src-native/notes.md`. Identified framework = "Mundo" app-virtualization/parallel-app SDK (vendor 62v.net). Wrote `findings.md`, `README.md`, `.gitignore`. Native is stripped+obfuscated (trampolines, encrypted strings); JNI surface = single `ioctl(int, Object)` dispatcher.

## Identified
- Target = Android app-cloning / multi-open framework ("Mundo"), package `top.bienvenido.mundo`, SDK `net_62v.external`.
- Manifest clones/hooks PUBG Mobile (cct.com.tencent.ig, cct.com.pubg.imobile) + Facebook login interception (FBLoginAbility).
- JNI bridge: `MNative.ioctl(code, obj)`; activation via `MUNDO_APP_KEY` meta-data and `https://www.62v.net/jnative/binder`.

## Decisions
- CLI-only use of REA (no MCP registration) — simpler on Termux.
- Phone-only host → native `.so` analysis limited to r2/binutils; no Ghidra/Hopper.

## Next Steps
- Java recovered; native `.so` needs unpacking/dynamic analysis for full recovery.
- To deepen Java: re-run JADX with `--deobf` and map ioctl codes to behaviour.

## Open Questions
- Does REA accept `.aar` for android tools, or only `.apk`? → Only `.apk`; use JADX directly.
- Does JADX run cleanly under Termux JDK 21 on aarch64? → Yes (1.5.6, 3 class errors tolerated).

## 2026-10-12 — Full Source Reconstruction pipeline DONE (all green)
- New `.github/workflows/full-re.yml`: ProGuard ASCII rename → 4 decompilers (Vineflower 519, CFR ~339, JADX, Procyon 446 files all on renamed.jar) + Ghidra headless native decompile. Jython dep removed — script rewritten in Java (`ci/ghidra/DecompileAll.java`); project dir must be `mkdir -p` before analyzeHeadless.
- Procyon 0.6.0 jar URL fix: use GitHub release `procyon-decompiler-0.6.0.jar` (shaded, has Main-Class) — Maven `compilertools` lacks DecompilerDriver.
- Ghidra 12.1.4 decompiled **838 functions** → 839 .c files (32 KB .so fully pseudo-C'd).
- CI runs all success; artifacts: java-decompiled-sources (2MB), native-decompiled-c (307KB).
- Delivered to `/storage/emulated/0/Download/mundolvl10/`: `native-c/` (839 .c), `decompiled/` (vine/cfr/procyon/jadx zips + deobf-mapping.txt), AAR, `source/`.
- Deobfuscate.yml removed (superseded). Jar renames: top/bienvenido/a.* preserved (attempted too).
- NEXT if user wants: generate `SOURCES.md` index; try more builds (build-aar still green separately).
