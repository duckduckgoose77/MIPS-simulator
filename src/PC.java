/** keeps track of program counter.*/
public class PC {
	private int currentPC;
	
	
	public PC() {
		// start at 0
		currentPC = 0;
	}
	
	/**Restarts program counter.*/
	public void restartPC() {
		currentPC = 0;
	}
	
	/**Gets current PC value.*/
	public int getPC() {
		return currentPC;
	}
	
	/**Set program counter, also checks to see if value is divisible by 4.*/
	public void set(int newPC) {
		
		// throws assertion exception if newPC mod 4 != 0
		assert newPC  == 0;
		
		this.currentPC = newPC;
	}
}
