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
 *
 */
public class GUI_Generator extends JFrame implements ActionListener {



		
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
		public GUI_Generator() {
			
			setLayout(new FlowLayout());
			
			createMenu();
			prepareGUI();
		}

		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			
		};
}
