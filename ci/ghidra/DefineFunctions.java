// Force-disassemble executable blocks and create functions at every BTI/PAC
// prologue that Ghidra's recursive analysis missed (common with OLLVM-flattened
// code that is only reached through indirect branches).
// Ghidra headless post-script (no args).
import ghidra.app.script.GhidraScript;
import ghidra.program.model.address.Address;
import ghidra.program.model.listing.Function;
import ghidra.program.model.listing.FunctionManager;
import ghidra.program.model.listing.Instruction;
import ghidra.program.model.listing.Listing;
import ghidra.program.model.mem.Memory;
import ghidra.program.model.mem.MemoryBlock;

public class DefineFunctions extends GhidraScript {
    @Override
    public void run() throws Exception {
        Memory mem = currentProgram.getMemory();
        Listing listing = currentProgram.getListing();
        FunctionManager fm = currentProgram.getFunctionManager();

        int disassembled = 0;
        int created = 0;
        for (MemoryBlock b : mem.getBlocks()) {
            if (!b.isExecute() || !b.isInitialized()) {
                continue;
            }
            Address start = b.getStart();
            Address end = b.getEnd();
            Address a = start;
            while (a != null && a.compareTo(end) <= 0) {
                if (monitor.isCancelled()) {
                    break;
                }
                Instruction ins = listing.getInstructionAt(a);
                if (ins == null) {
                    try {
                        if (disassemble(a)) {
                            disassembled++;
                        }
                    } catch (Exception e) {
                        // ignore undecodable bytes
                    }
                } else {
                    String m = ins.getMnemonicString();
                    if ((m.equals("bti") || m.equals("paciasp"))
                            && fm.getFunctionContaining(a) == null) {
                        try {
                            Function f = createFunction(a, null);
                            if (f != null) {
                                created++;
                            }
                        } catch (Exception e) {
                            // ignore
                        }
                    }
                }
                a = a.add(4);
            }
        }
        println("DefineFunctions: disassembled=" + disassembled
                + " functions_created=" + created
                + " total_functions=" + fm.getFunctionCount());
    }
}
