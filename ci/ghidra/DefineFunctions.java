// Force-disassemble executable blocks and create functions at BTI/PAC prologues
// that Ghidra's recursive (indirect-branch-unaware) analysis missed.
// Prints diagnostics so we can see why coverage is low.
import ghidra.app.script.GhidraScript;
import ghidra.program.model.address.Address;
import ghidra.program.model.address.AddressSet;
import ghidra.program.model.listing.Function;
import ghidra.program.model.listing.FunctionManager;
import ghidra.program.model.listing.Instruction;
import ghidra.program.model.listing.Listing;
import ghidra.program.model.mem.Memory;
import ghidra.program.model.mem.MemoryBlock;
import ghidra.program.model.symbol.SourceType;

public class DefineFunctions extends GhidraScript {
    @Override
    public void run() throws Exception {
        Memory mem = currentProgram.getMemory();
        Listing listing = currentProgram.getListing();
        FunctionManager fm = currentProgram.getFunctionManager();

        long total = 0, missing = 0, attempts = 0, created = 0, fails = 0, diss = 0;
        for (MemoryBlock b : mem.getBlocks()) {
            if (!b.isExecute() || !b.isInitialized()) {
                continue;
            }
            Address a = b.getStart();
            Address end = b.getEnd();
            while (a != null && a.compareTo(end) <= 0 && !monitor.isCancelled()) {
                Instruction ins = listing.getInstructionAt(a);
                if (ins == null) {
                    try {
                        if (disassemble(a)) {
                            diss++;
                        }
                    } catch (Exception e) {
                        // skip
                    }
                    ins = listing.getInstructionAt(a);
                    if (ins == null) {
                        a = a.add(2);
                        continue;
                    }
                }
                total++;
                if (fm.getFunctionContaining(a) == null) {
                    missing++;
                    String m = ins.getMnemonicString();
                    if (m.equals("bti") || m.equals("paciasp")) {
                        attempts++;
                        Function f = null;
                        try {
                            f = createFunction(a, null);
                        } catch (Exception e) {
                            if (fails < 15) {
                                println("createFunction threw at " + a + ": " + e);
                            }
                        }
                        if (f == null) {
                            try {
                                f = fm.createFunction(null, a, new AddressSet(a, a),
                                        SourceType.USER_DEFINED);
                            } catch (Exception e) {
                                if (fails < 15) {
                                    println("fm.createFunction threw at " + a + ": " + e);
                                }
                            }
                        }
                        if (f == null) {
                            fails++;
                        } else {
                            created++;
                        }
                    }
                }
                a = a.add(ins.getLength());
            }
        }
        println("DefineFunctions: disassembled=" + diss
                + " total_instr=" + total + " not_in_function=" + missing
                + " prologue_attempts=" + attempts + " created=" + created
                + " failed=" + fails
                + " total_functions=" + fm.getFunctionCount());
    }
}
