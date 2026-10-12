// Decompile every function in the current program to C.
// Ghidra headless post-script.  Usage: -postScript DecompileAll.java <outdir>
import ghidra.app.script.GhidraScript;
import ghidra.app.decompiler.DecompInterface;
import ghidra.app.decompiler.DecompileResults;
import ghidra.program.model.listing.Function;
import ghidra.program.model.listing.FunctionIterator;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

public class DecompileAll extends GhidraScript {
    @Override
    public void run() throws Exception {
        String[] args = getScriptArgs();
        String outdir = (args != null && args.length > 0) ? args[0] : "/tmp/native-c";
        File dir = new File(outdir);
        if (!dir.exists()) {
            dir.mkdirs();
        }

        DecompInterface decomp = new DecompInterface();
        decomp.openProgram(currentProgram);

        FunctionIterator it = currentProgram.getFunctionManager().getFunctions(true);
        PrintWriter all = new PrintWriter(new FileWriter(new File(dir, "ALL_FUNCTIONS.c")));
        int count = 0;
        while (it.hasNext() && !monitor.isCancelled()) {
            Function f = it.next();
            try {
                DecompileResults res = decomp.decompileFunction(f, 120, monitor);
                if (res != null && res.decompileCompleted()) {
                    String c = res.getDecompiledFunction().getC();
                    String name = f.getName();
                    String addr = f.getEntryPoint().toString();
                    FileWriter fw = new FileWriter(new File(dir, addr + "_" + name + ".c"));
                    fw.write("// " + name + " @ " + addr + "\n");
                    fw.write(c);
                    fw.close();
                    all.println("\n// ===== " + name + " @ " + addr + " =====");
                    all.println(c);
                    count++;
                }
            } catch (Exception e) {
                println("skip " + f.getName() + ": " + e);
            }
        }
        all.close();
        println("decompiled functions: " + count);
    }
}
