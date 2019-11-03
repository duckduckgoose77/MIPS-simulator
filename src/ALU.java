
public class ALU {

	private boolean zeroOutput;
	private int aluOutput;

	public int getOut() {
		return aluOutput;
	}

	public boolean isZero() {
		return zeroOutput;
	}

	public void setOperation(short ctr, int val1, int val2) {
		zeroOutput = false;
		aluOutput = 0;
		
		switch(ctr) {
		
		case 0: // AND
			aluOutput = val2 & val1;
			break;
			
		case 1: // OR
			aluOutput = val2 | val1;
			break;
			
		case 2: // ADD
			aluOutput =  val2 + val1;
			break;
			
		case 6: // SUBTRACT
			aluOutput = val2 - val1;
			if(aluOutput == 0) 
				zeroOutput = true;
			break;
			
		case 7: // SLT
			aluOutput = val2 < val1 ? 1 : 0;
			break;

		case 12: // NOR
			aluOutput = ~(val2 | val1);
			break;
		}
	}
	public static short controller(boolean ALUOp1, boolean ALUOp0, short funct){
		if(!ALUOp1 && !ALUOp0) {
			return 2;
		}
		if(ALUOp0) {
			return 0;
		}
		switch(funct & 15) {
		case 0:
			return 2;
		case 2:
			return 6;
		case 3:
			return 0;
		case 4:
			return 1;
		case 7:
			return 12;
		case 10:
			return 7;
		}
		assert false;
		return 0;
	}
}
