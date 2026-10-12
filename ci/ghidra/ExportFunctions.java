// Export every function boundary (start, size, name) of the current program.
// Ghidra headless post-script.  Usage: -postScript ExportFunctions.java <outfile>
import ghidra.app.script.GhidraScript;
import ghidra.program.model.listing.Function;
import ghidra.program.model.listing.FunctionIterator;
import java.io.FileWriter;
import java.io.PrintWriter;

public class ExportFunctions extends GhidraScript {
    @Override
    public void run() throws Exception {
        String[] args = getScriptArgs();
        String out = (args != null && args.length > 0) ? args[0] : "functions.txt";
        PrintWriter w = new PrintWriter(new FileWriter(out));
        w.println("# start_addr size name");
        FunctionIterator it = currentProgram.getFunctionManager().getFunctions(true);
        int n = 0;
        while (it.hasNext() && !monitor.isCancelled()) {
            Function f = it.next();
            long start = f.getEntryPoint().getOffset();
            long size = f.getBody().getNumAddresses();
            String name = f.getName().replace("\t", "_").replace("\n", "_");
            w.printf("0x%x %d %s%n", start, size, name);
            n++;
        }
        w.close();
        println("exported functions: " + n + " -> " + out);
    }
}
