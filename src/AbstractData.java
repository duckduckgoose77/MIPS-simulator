
import java.util.*;

public abstract class AbstractData {
	
	private int[] dataArray;
	
	@SuppressWarnings("rawtypes")
	private List update;

	@SuppressWarnings("rawtypes")
	public AbstractData(int dataSize) {
		
		dataArray = new int[dataSize];
		
		update = new LinkedList();
		
		clear();
	}
	
	/**
	 * clone data array. 
	 * @return cloned data array.
	 */
	public int[] dataClone() {
		
		return dataArray.clone();
		
	}

	/**
	 * Get updated data.
	 * @return updated data. 
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public List update() {
		
		return new LinkedList(update);
		
	}
	
	public void clear() {
		
		for(int i = 0; i < dataArray.length; i++) {
			
			dataArray[i] = 0;
			
		}
		
	}

	/**
	 * clear update list at index. 
	 * @param index
	 */
	@SuppressWarnings("unchecked")
	private void delete(int index) {
		
		if(update.contains(index)) 
			
				update.remove(update.indexOf(index));	
		
				update.add(0, index);
				
	}
	
	/**
	 * Get data
	 * @param index at this index
	 * @return the data at index
	 */
	int getData(int ind) {
		
		return dataArray[ind];
		
	}
	
	/**
	 * Sets data.
	 * @param index of data.
	 * @param value of data.
	 */
	 void setData(int ind, int val) {
		
		delete(ind);
		
		dataArray[ind] = val;
		
	}
	

}
