import java.util.*;
import java.security.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.Window;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.plaf.FontUIResource;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableModel;
import javax.swing.JRadioButton;
import javax.swing.JRadioButton;

/*
 *Changes and update as of 2/17/2019
 *Changes contain frame size scaling base on user current resolution on the operating machine.
 *Action listener was added to react when the button are clicked and it will perform a certain action. 
 *In today update, learn how to adjust the size properly for the frame and font size for buttons. Fail to make menu font size bigger.
 *Added Panel page to frame and have panel switch base on the button clicked, by drawing a new panel on the next panel unit.
 *
 *GUI template is almost completed. 
 *
 */
public class GUI_Generator extends JFrame implements ActionListener {



		/*
		 * Setting up an estimate frame size base on the resolution of the uesr screen.
		 * toolkit was use to acquire the current system resolution size.
		 */
		Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
		int y = (int) (d.getHeight()/2);
		int x = (int) (d.getWidth()/2);

		public static final Font MY_FONT = new Font("Arial", Font.BOLD, 30);
		public static final Font font = new Font("sans-serif",Font.PLAIN,15);
		
		JFrame mainFrame;
		JMenuBar bar = new JMenuBar();
		JPanel panel = new JPanel();
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
		JButton Back;
		JButton Basic;
		JButton Multiplyof3and5;
		JButton EvenFibonacciNumber;
		JButton Sum_Square_Difference;
		JButton PrimeNumber;
		JButton Intermediate;
		JButton Expert;
		
		
		/*
		 * Menu options for GUI.
		 */
		private void createMenu(){
			
			file.setMnemonic('F');
			
			ItemNew = new JMenuItem("New");
			ItemNew.setMnemonic('N');
			ItemNew.setFont(font);
			file.add(ItemNew);
			
			ItemExit = new JMenuItem("Exit");
			ItemExit.setMnemonic('X');
			ItemNew.setFont(font);
			file.add(ItemExit);
			
			Basic = new JButton("Basic Math");
			Intermediate = new JButton("Intermediate Math");
			Expert = new JButton("Expert Math");
			
			Basic.setFont(MY_FONT);
			Intermediate.setFont(MY_FONT);
			Expert.setFont(MY_FONT);
			Basic.addActionListener(this);
			Intermediate.addActionListener(this);
			Expert.addActionListener(this);
			

			
		}
		
		/*
		 * Draft of GUI layout
		 * Next step need to detect resolution size of the computer and have it auto scale in the future.
		 */
		
		
		private void prepareGUI(boolean argument) {
			
			
			Dimension sz = Toolkit.getDefaultToolkit().getScreenSize();
			mainFrame = new JFrame("Euler Calculator");
				
			bar.setFont(font);
			bar.add(file);
			bar.add(edit);
			
			
			p.add(Basic);
			p.add(Intermediate);
			p.add(Expert);
		
			panel.setLayout(new GridLayout(5,3));
			panel.add(bar);
			panel.add(p);
			panel.setVisible(argument);
			
			mainFrame.setJMenuBar(bar);
			mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			mainFrame.setVisible(argument);
			mainFrame.add(panel, BorderLayout.NORTH);
			mainFrame.pack();
			mainFrame.setLocationRelativeTo(null);
			

			
			
		}
		
		private void mainbutton() {
			p.setLayout(new GridLayout(1,3));
			p.add(Basic);
			p.add(Intermediate);
			p.add(Expert);
			panel.add(p);
			panel.repaint();
			panel.revalidate();
		}
		
		/*
		 * Purpose of this, as we expand our feature of the calculator it will become a clutter in the original page. Instead we will isolate each set of function
		 * into sub section making it easier to locate the feature. 
		 */
		private void basicbuttonGUI(boolean argument) {
			
			
			file.setMnemonic('F');
			
			ItemNew = new JMenuItem("New");
			ItemNew.setMnemonic('N');
			file.add(ItemNew);
			
			ItemExit = new JMenuItem("Exit");
			ItemExit.setMnemonic('X');
			file.add(ItemExit);
			
			Back = new JButton("Back");
			Back.addActionListener(this);
			Multiplyof3and5 = new JButton("Multiply of 3 and 5");
			Multiplyof3and5.addActionListener(this);
			EvenFibonacciNumber = new JButton("Even_Fibonacci_Number");
			EvenFibonacciNumber.addActionListener(this);
			PrimeNumber = new JButton("Largest prime");
			PrimeNumber.addActionListener(this);
			Sum_Square_Difference = new JButton("Sum SQR Differences");
			Sum_Square_Difference.addActionListener(this);
			
			EvenFibonacciNumber.setFont(MY_FONT);
			Multiplyof3and5.setFont(MY_FONT);
			PrimeNumber.setFont(MY_FONT);
			Sum_Square_Difference.setFont(MY_FONT);
			Back.setFont(MY_FONT);
			p.removeAll();
			p.revalidate();
			p.repaint();
			p.setLayout(new GridLayout(2,2));
			
			p.add(Multiplyof3and5);
			p.add(EvenFibonacciNumber);
			p.add(PrimeNumber);
			p.add(Sum_Square_Difference);
			p.add(Back);
			
			
			panel.removeAll();
			panel.add(p);
	
			
			
		}
		
		/*
		 * Declaring a constructor to run the GUI interface.
		 */
		public GUI_Generator() {
			
			
			createMenu();
			prepareGUI(true);
		}

		@Override
		public void actionPerformed(ActionEvent e) {
		
			if(e.getSource() == Basic) {
				basicbuttonGUI(true);				
				}else if(e.getSource() == Intermediate) {
				
		
			}else if(e.getSource() == Expert) {
				
			}

			if(e.getSource() == Multiplyof3and5) {
				Multiply_of_3_and_5 m35 = new Multiply_of_3_and_5();
				m35.setSum();
				m35.getSum();
			}else if(e.getSource() == EvenFibonacciNumber) {
				Even_Fibonacci_number efn = new Even_Fibonacci_number();
				efn.getEven_Fibonacci_number();
			}else if(e.getSource() == PrimeNumber) {
				Prime_Factor_Number PN = new Prime_Factor_Number();
				PN.setPrime_Factor_Number();
				PN.getPrime_Factor_Number();
			}else if(e.getSource() == Sum_Square_Difference) {
				Sum_Square_Difference  SQD = new Sum_Square_Difference();
				SQD.setSum_Square_Difference();
				SQD.getSum_Square_Difference();
			}
			if(e.getSource() == Back){
				
				p.removeAll();
				p.repaint();
				panel.removeAll();
				panel.repaint();
				mainbutton();
				
			
		
			}
		}
}
