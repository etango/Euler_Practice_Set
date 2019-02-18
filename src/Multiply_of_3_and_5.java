import java.util.*;
import java.math.*;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.UIManager;


/*
 * I am refreshing my mind set on setter and getter as well practicing using linked list here.
 * Over kill on using linked list here as can be done much simpler.
 * 
 * 2/17/2019
 * updated GUI, displaying bigger text by using labels and UIManager.
 */
public class Multiply_of_3_and_5 extends GUI_Generator {

	private int sum;
	JLabel label1 = new JLabel("Please enter a positive value. ");
	

	
	
	public int getSum() {
		JLabel label2 = new JLabel("The sum of all multiples of 3 or 5 below is: " + Integer.toString(sum));
		label2.setFont(MY_FONT);
		JOptionPane.showMessageDialog(null,label2);
		return sum;
	}
	
	public void setSum(){
		
		
		label1.setFont(MY_FONT);
		UIManager.put("OptionPane.buttonFont", font);
		String num = JOptionPane.showInputDialog(null,label1);
		int number = Integer.parseInt(num);
		
		
		LinkedList<Integer> value = new LinkedList<Integer>();
		
		for(int i=0;i<number;i++) {
			
			if(i%3 == 0 || i%5 == 0) {
				value.add(i);
			}
		}
		
		for(int i=0;i<value.size();i++) {
			this.sum+=value.get(i);
		}
	}
}
