//// DecompileAll.py
//// Ghidra headless post-script: decompile every function to C.
//// usage (via analyzeHeadless): -postScript DecompileAll.py <outdir>
// @category Mundo

import os
from ghidra.app.decompiler import DecompInterface
from ghidra.util.task import ConsoleTaskMonitor

args = getScriptArgs()
outdir = args[0] if len(args) > 0 else "/tmp/native-c"
if not os.path.exists(outdir):
    os.makedirs(outdir)

decomp = DecompInterface()
decomp.openProgram(currentProgram)
fm = currentProgram.getFunctionManager()
monitor = ConsoleTaskMonitor()

count = 0
combined = open(os.path.join(outdir, "ALL_FUNCTIONS.c"), "w")
for f in fm.getFunctions(True):
    try:
        res = decomp.decompileFunction(f, 120, monitor)
        if res and res.decompileCompleted():
            c = res.getDecompiledFunction().getC()
            name = f.getName()
            addr = f.getEntryPoint().toString()
            header = "// %s @ %s\n" % (name, addr)
            with open(os.path.join(outdir, "%s_%s.c" % (addr, name)), "w") as fh:
                fh.write(header)
                fh.write(c)
            combined.write("\n// ===== %s @ %s =====\n" % (name, addr))
            combined.write(c)
            count += 1
    except Exception as e:
        print("skip %s: %s" % (f.getName(), e))
combined.close()
print("decompiled functions: %d" % count)
