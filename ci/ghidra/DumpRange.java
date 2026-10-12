// Dump instructions in a vaddr range with function membership.
// args: <startVaddrHex> <stopVaddrHex>
import ghidra.app.script.GhidraScript;
import ghidra.program.model.address.Address;
import ghidra.program.model.listing.Function;
import ghidra.program.model.listing.Instruction;
import ghidra.program.model.listing.Listing;

public class DumpRange extends GhidraScript {
    @Override
    public void run() throws Exception {
        String[] args = getScriptArgs();
        long start = Long.parseLong(args[0].replace("0x", ""), 16);
        long stop = Long.parseLong(args[1].replace("0x", ""), 16);
        Listing listing = currentProgram.getListing();
        Address a = toAddr(start);
        Address end = toAddr(stop);
        while (a.compareTo(end) <= 0) {
            Instruction ins = listing.getInstructionAt(a);
            if (ins == null) {
                println(a + "  <no instruction / data>");
                a = a.add(4);
                continue;
            }
            Function f = listing.getFunctionContaining(a);
            println(a + "  " + ins + "   func=" + (f == null ? "-" : f.getName()));
            a = a.add(ins.getLength());
        }
    }
}
