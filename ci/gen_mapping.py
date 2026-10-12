#!/usr/bin/env python3
"""Generate a ProGuard name-mapping that converts any class whose simple name
contains non-ASCII characters into a stable ASCII alias (C00001, C00002, ...),
leaving already-ASCII names untouched.

Only *classes* are mapped; member names are preserved by ProGuard via
-keepclassmembers, so the resulting renamed jar is byte-for-byte equivalent
apart from class names.

usage: gen_mapping.py <classes.jar> <mapping.txt>
"""
import sys
import zipfile


def is_ascii(s: str) -> bool:
    return all(ord(c) < 128 for c in s)


def main() -> None:
    jar_path, out_path = sys.argv[1], sys.argv[2]

    with zipfile.ZipFile(jar_path) as z:
        names = [n[:-6] for n in z.namelist() if n.endswith(".class")]

    groups: dict[str, list[str]] = {}
    for nm in names:
        outer = nm.split("$", 1)[0]
        groups.setdefault(outer, []).append(nm)

    mapping: dict[str, str] = {}
    counter = 0
    for outer, members in groups.items():
        if "/" in outer:
            pkg, simple = outer.rsplit("/", 1)
        else:
            pkg, simple = "", outer

        if is_ascii(simple):
            for m in members:
                mapping[m] = m
            continue

        counter += 1
        new_simple = "C%05d" % counter
        new_outer = (pkg + "/" + new_simple) if pkg else new_simple
        for m in members:
            suffix = m[len(outer):]
            mapping[m] = new_outer + suffix

    with open(out_path, "w") as f:
        for m in sorted(mapping):
            f.write(m.replace("/", ".") + " -> " + mapping[m].replace("/", ".") + ":\n")

    print("classes:", len(mapping), "renamed groups:", counter)


if __name__ == "__main__":
    main()
