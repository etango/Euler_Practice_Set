import java.util.*;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
public class Sum_Square_Difference extends GUI_Generator{
	
	private String natural;
	private float natural_number;
	private float sumsqr = 0;
	private float sum1 = 0;
	private float sum2 = 0;
	JLabel label1 = new JLabel("Please enter a number you wish to sum square: ");

	
	Sum_Square_Difference(){
		
	}
	
	public void setSum_Square_Difference() {
		
		label1.setFont(MY_FONT);
		UIManager.put("OptionPane.buttonFont",font);
		natural = JOptionPane.showInputDialog(null,label1);
		natural_number = Integer.parseInt(natural);
		
		
	}
	
	public void getSum_Square_Difference(){
	
		for (int i=0; i<=natural_number;i++){
			sum1 += Math.pow(i,2);
			sum2 += i;
		}
		
		
		sum2 = (float) Math.pow(sum2, 2);
		
		
		sumsqr = Math.round(sum2-sum1);
		JLabel label2 = new JLabel("The differences in sum square is: " + sumsqr);
		label2.setFont(MY_FONT);
		JOptionPane.showMessageDialog(null, label2);
		
	}
	
}
