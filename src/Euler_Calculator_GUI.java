import java.util.*;
import java.security.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.FlowLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableModel;
import javax.swing.JRadioButton;
import javax.swing.JRadioButton;


/*
 * Version 1.0.0.0
 * Start Date: 2/15/2019 by Elton Tang
 * Main objective of this project. It's to build a GUI Euler Calculator by doing problem sets from Euler as I go on.
 * I have plans to improve the GUI. Currently I am just building a template and testing features here and there.
 * 
 */
public class Euler_Calculator_GUI {

	/*
	 * Currently the main method is running test for my other class before I implement them to GUI.
	 */
	
	public static void main(String[] args) {
		
		GUI_Generator GUI = new GUI_Generator();
		

		Scanner sc = new Scanner(System.in);
		Multiply_of_3_and_5 m35 = new Multiply_of_3_and_5();
		
		System.out.println("Enter a value");
		int x = sc.nextInt();
		
		m35.setSum(x);
		System.out.println(m35.getSum());
		
		
	}



}
