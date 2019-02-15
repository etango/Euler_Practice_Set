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
@SuppressWarnings("serial")
public class Euler_Calculator_GUI extends JFrame implements ActionListener {


	
	JFrame mainFrame;
	JPanel p = new JPanel();
	Object columnNames [] = {"Multiply of 3 and 5"};
	DefaultTableModel tableModel = new DefaultTableModel(columnNames,0);
	JTable table = new JTable(tableModel);
	JScrollPane scrollPane = new JScrollPane(table);
	
	private JMenu file = new JMenu ("File");
	private JMenu edit = new JMenu("Tickets");
	JScrollPane sp = null;
	
	JMenuItem ItemNew;
	JMenuItem ItemExit;
	
	JButton Multiplyof3and5;
	
	
	/*
	 * Menu options for GUI.
	 */
	private void createMenu(){
		
		file.setMnemonic('F');
		
		ItemNew = new JMenuItem("New");
		ItemNew.setMnemonic('N');
		file.add(ItemNew);
		
		ItemExit = new JMenuItem("Exit");
		ItemExit.setMnemonic('X');
		file.add(ItemExit);
		
		Multiplyof3and5 = new JButton("Multiply of 3 and 5");
		Multiplyof3and5.addActionListener(this);
		
	}
	
	/*
	 * Draft of GUI layout
	 * Next step need to detect resolution size of the computer and have it auto scale in the future.
	 */
	private void prepareGUI() {
		
		mainFrame = new JFrame("Euler Calculator");
		JMenuBar bar = new JMenuBar();
		bar.add(file);
		bar.add(edit);
		mainFrame.setJMenuBar(bar);
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainFrame.setSize(1000, 1000);
		mainFrame.setVisible(true);
		
		
	}
	
	
	/*
	 * Declaring a constructor to run the GUI interface.
	 */
	public Euler_Calculator_GUI() {
		
		setLayout(new FlowLayout());
		
		createMenu();
		prepareGUI();
	};
	
	
	/*
	 * Currently the main method is running test for my other class before I implement them to GUI.
	 */
	
	public static void main(String[] args) {

		new Euler_Calculator_GUI();
		Scanner sc = new Scanner(System.in);
		Multiply_of_3_and_5 m35 = new Multiply_of_3_and_5();
		
		System.out.println("Enter a value");
		int x = sc.nextInt();
		
		m35.setSum(x);
		System.out.println(m35.getSum());
		
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
