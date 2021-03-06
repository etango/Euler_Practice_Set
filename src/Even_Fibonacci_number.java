import java.util.LinkedList;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

/*
 * Sovling problem number 2 on Euler.
 * Each new term in the Fibonacci sequence is generated by adding the previous two terms. By starting with 1 and 2, the first 10 terms will be:
 *
 *								1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
 *	
 *By considering the terms in the Fibonacci sequence whose values do not exceed four million, find the sum of the even-valued terms
 *
 */
public class Even_Fibonacci_number extends GUI_Generator {

	//declaring variables as private so can't be alter outside of this class.
	private int even_sum;
	private int sum;
	
	
	//creating a setter constructor but there no purpose for this.
	public void setEven_Fibonacci_number(){
		
	}
	
	
	/*
	 * Main code is here. By using a datastructure of linkedlist to self grow holding all the sequences sum.
	 * Then using a for loop function with an if condition to check each sequences of number in the linked list if there even or not.
	 * If they were even sum them up.
	 * 
	 * This task also does not need to be divided into two for loop. It can be done in one for loop. by setting two if statement in the first for loop.
	 * The first if statement checks for sum if it's less than 4 million and the second if statement will check for even number.
	 * 
	 * I split to two for easier understanding for other people that happen to look over this code also to just practicing coding for fun.
	 * 
	 */
	public void getEven_Fibonacci_number(){
		
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(1);
		list.add(2);
		
		for(int i=0;i<=4000000;i++) {
			sum = list.get(i)+list.get(i+1);
			if (sum>4000000) {
				break;
			}
			list.add(sum);
			
		}
		for(int i=0;i<list.size();i++) {
			if(list.get(i)%2==0) {
				even_sum+=list.get(i);
			}
		}
		
		JLabel label1 = new JLabel("The sum of the even number in Fibonacci sequence number is: " + even_sum);
		label1.setFont(MY_FONT);
		JOptionPane.showMessageDialog(null,label1);
 
	}
}
