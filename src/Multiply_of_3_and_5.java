import java.util.*;
import java.math.*;


/*
 * I am refreshing my mind set on setter and getter as well practicing using linked list here.
 * Over kill on using linked list here as can be done much simpler.
 */
public class Multiply_of_3_and_5 {

	private int sum;
	
	
	public int getSum() {
		return sum;
	}
	
	public void setSum(int x){
		
		LinkedList<Integer> value = new LinkedList<Integer>();
		for(int i=0;i<x;i++) {
			
			if(i%3 == 0 || i%5 == 0) {
				value.add(i);
			}
		}
		
		for(int i=0;i<value.size();i++) {
			this.sum+=value.get(i);
		}
	}
}
