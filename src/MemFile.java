
/**mips memory (subset for now and extend later)*/
public class MemFile extends AbstractData {
	
	public MemFile() {
		// memory size
		super(2000);
	}
	
	/**
	 * Read and write to memory
	 * @param address of mem location
	 * @param data for memory
	 * @param readMem read to mem loc. true = write
	 * @param writeMem write to mem loc. true = write
	 * @return 0
	 */
	public int memoryWrite(int address, int data, boolean readMem,
			boolean writeMem) {
		
		if(writeMem) {
			setData(address, data);
		}

		if(readMem) {
			return getData(address);
		}

		return 0;
	}
}
