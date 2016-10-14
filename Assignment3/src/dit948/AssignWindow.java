package dit948;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextPane;
import java.awt.BorderLayout;
import javax.swing.BoxLayout;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class AssignWindow{

	static String result;
	static String list;
	Main main = new Main();
	private JFrame frmTitleee;
	private JTextField txtNumberOf;
	private JTextField txtNumberRandom;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		result = args[0];
		list = args[1];
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AssignWindow window = new AssignWindow();
					window.frmTitleee.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public AssignWindow() {
		initialize();
	}

	
	
	
	
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmTitleee = new JFrame();
		frmTitleee.setTitle("DIT948 circuit oracle");
		frmTitleee.setForeground(Color.GREEN);
		frmTitleee.setBounds(100, 100, 450, 300);
		frmTitleee.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmTitleee.getContentPane().setLayout(null);
		
		JTextPane txtpnHej = new JTextPane();
		txtpnHej.setBounds(0, 0, 432, 82);
		txtpnHej.setFont(new Font("Tahoma", Font.BOLD, 13));
		txtpnHej.setBackground(Color.LIGHT_GRAY);
		txtpnHej.setForeground(Color.BLACK);
		txtpnHej.setText("I will now check the equivalence for the following circuits : \n Circuit 1: !(a /and b) \n Circuit 2: !(a) or/ !(b) \n The result is: " + result);
		frmTitleee.getContentPane().add(txtpnHej);
		
		
		
		//int n = readInt();
		
	
		JTextPane txtpnIHavewCreated = new JTextPane();
		txtpnIHavewCreated.setBounds(0, 121, 432, 131);
		txtpnIHavewCreated.setFont(new Font("Tahoma", Font.BOLD, 13));
		txtpnIHavewCreated.setBackground(Color.LIGHT_GRAY);
		txtpnIHavewCreated.setText("I have created the following random circuits:" + "\n" + list );
		frmTitleee.getContentPane().add(txtpnIHavewCreated);
		
		txtNumberOf = new JTextField();
		txtNumberOf.setBackground(Color.LIGHT_GRAY);
		txtNumberOf.setText("Number of random circuits:");
		txtNumberOf.setBounds(10, 90, 179, 22);
		frmTitleee.getContentPane().add(txtNumberOf);
		txtNumberOf.setColumns(10);
		
		txtNumberRandom = new JTextField();
		txtNumberRandom.setBounds(203, 90, 116, 22);
		frmTitleee.getContentPane().add(txtNumberRandom);
		txtNumberRandom.setColumns(10);
	
		
		JButton btnGenerte = new JButton("Generte");
		btnGenerte.setBounds(343, 89, 77, 25);
		frmTitleee.getContentPane().add(btnGenerte);
		btnGenerte.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String nrOfRandom = txtNumberRandom.getText();
				System.out.println(nrOfRandom);
			}
		});
	

}
}
