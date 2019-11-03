
/**
 * Register file to update all registers.
 */
public class RegFile extends AbstractData {
	private int registerInput;
	private int registerInput2;
	private int regWrite;

	public RegFile() {
		super(32);
	}
	
	/**
	 * gets register at specific index. 
	 * @param index of register
	 * @return register at specific index.
	 */
	public static String registerList(int index) {
		
		  String[] registers = { "$zero", "$at", "$v0", "$v1", "$a0", "$a1", "$a2",
		  "$a3", "$t0", "$t1", "$t2", "$t3", "$t4", "$t5", "$t6", "$t7", "$s0", "$s1",
		  "$s2", "$s3", "$s4", "$s5", "$s6", "$s7", "$t8", "$t9", "$k0", "$k1", "$gp",
		  "$sp", "$fp", "$ra" };
		 
		return registers[index];
	}
	
	/**
	 * Set register value
	 * @param in1
	 * @param in2
	 * @param wout
	 */
	public void setRegisters(int in1, int in2, int wout) {
		registerInput = in1;
		registerInput2 = in2;
		regWrite = wout;
	}
	
	/**
	 * get data from register1.
	 * @return data from register.
	 */
	public int readReg() {
		return getData(registerInput);
	}
	
	/**
	 * get data from register2.
	 * @return
	 */
	public int readReg2() {
		return getData(registerInput2);
	}
	
	/** Write to register.
	 * @param RegWrite
	 * @param data
	 */
	public void writeToReg(boolean RegWrite, int data) {
		if(RegWrite) {
			setData(regWrite, data);
		}
	}

	
	@Override
	protected int getData(int index) {
		
		if(index == 0)
			
			return 0; 
		
		else
			
		return super.getData(index);
		
	}

	@Override
	protected void setData(int index, int value) {
		
		if(index == 0)
			
			return;
		
		else
			
		super.setData(index, value);
	}

	
}
