#!/usr/bin/env bash
#
# Hybrid source builder.
#
# Strategy: compile the decompiled Java against the AOSP hidden-api android.jar
# (+ kotlin-stdlib + the ORIGINAL classes.jar on the classpath so that classes
# which fail to reconstruct still resolve).  Files that fail to compile are
# moved to source/library/excluded/ and thereafter satisfied by the original
# bytecode.  A `fallback.jar` is produced containing exactly the original
# classes that were NOT rebuilt from source, so the final AAR packages a
# complete, functionally-equivalent set of classes.
#
# Usage:
#   ci/compile_and_exclude.sh <android.jar> <kotlin-stdlib.jar> <classes.jar>
#
set -uo pipefail

ROOT="$(cd "$(dirname "$0")/.." && pwd)"
SRC="$ROOT/source/library/src/main/java"
EXCL="$ROOT/source/library/excluded"
LIBS="$ROOT/source/library/libs"
ANDROID_JAR="${1:?usage: compile_and_exclude.sh <android.jar> <kotlin-stdlib.jar> <classes.jar>}"
KOTLIN_JAR="${2:?missing kotlin-stdlib.jar}"
CLASSES_JAR="${3:?missing classes.jar}"

mkdir -p "$LIBS"
rm -rf "$EXCL"; mkdir -p "$EXCL"

find "$SRC" -name '*.java' > /tmp/all_sources.txt
cp /tmp/all_sources.txt /tmp/sources.txt
KEEP_BEFORE=$(wc -l < /tmp/sources.txt)

CP="$KOTLIN_JAR:$CLASSES_JAR"
ok=0
MAX=80
for i in $(seq 1 $MAX); do
  rm -rf /tmp/cls; mkdir -p /tmp/cls
  if javac -nowarn -proc:none -source 8 -target 8 \
        -bootclasspath "$ANDROID_JAR" -cp "$CP" \
        -d /tmp/cls @/tmp/sources.txt > /tmp/javac.log 2>&1; then
    ok=1
    echo "== COMPILE OK after $i iteration(s) =="
    break
  fi
  grep -oE '^/[^:]+\.java' /tmp/javac.log | sort -u > /tmp/bad.txt
  n=$(wc -l < /tmp/bad.txt)
  if [ "$n" -eq 0 ]; then
    echo "== javac produced no parseable file errors; tail of log =="
    tail -60 /tmp/javac.log
    exit 1
  fi
  echo "iter $i: excluding $n failing file(s)"
  while IFS= read -r f; do
    [ -f "$f" ] || continue
    rel="${f#$SRC/}"
    mkdir -p "$EXCL/$(dirname "$rel")"
    mv "$f" "$EXCL/$rel"
  done < /tmp/bad.txt
  grep -vFf /tmp/bad.txt /tmp/sources.txt > /tmp/s2.txt
  mv /tmp/s2.txt /tmp/sources.txt
done

if [ "$ok" != 1 ]; then
  echo "== FAILED to converge within $MAX iterations =="
  exit 2
fi

# ---- Build fallback.jar: original classes NOT rebuilt from source ----
python3 - "$SRC" /tmp/sources.txt "$CLASSES_JAR" "$LIBS/fallback.jar" <<'PY'
import sys, os, zipfile
src, srcs, jar, out = sys.argv[1:5]
compiled = set()
for line in open(srcs):
    rel = os.path.relpath(line.strip(), src)[:-5].replace(os.sep, '.')
    compiled.add(rel)
zi = zipfile.ZipFile(jar)
zo = zipfile.ZipFile(out, 'w', zipfile.ZIP_DEFLATED)
kept = 0
for item in zi.infolist():
    if not item.filename.endswith('.class'):
        continue
    fq = item.filename[:-6].replace('/', '.')
    is_source = any(fq == c or fq.startswith(c + '$') for c in compiled)
    if not is_source:
        zo.writestr(item, zi.read(item.filename))
        kept += 1
zo.close()
print("fallback.jar classes:", kept)
PY

KEEP_AFTER=$(grep -c . /tmp/sources.txt || true)
echo "---------------------------------------------"
echo "source files kept    : $KEEP_AFTER / $KEEP_BEFORE"
echo "source files excluded: $(find "$EXCL" -name '*.java' | wc -l)"
echo "fallback jar         : $LIBS/fallback.jar"
ls -la "$LIBS/fallback.jar"
