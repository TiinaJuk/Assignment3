package dit948;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextPane;
import java.awt.BorderLayout;
import javax.swing.BoxLayout;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AssignWindow{

	static String result;
	static String list;
	private JFrame frmTitleee;

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
		frmTitleee.setBounds(100, 100, 500, 570);
		frmTitleee.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmTitleee.getContentPane().setLayout(new BoxLayout(frmTitleee.getContentPane(), BoxLayout.Y_AXIS));
		
		JTextPane txtpnHej = new JTextPane();
		txtpnHej.setFont(new Font("Tahoma", Font.BOLD, 13));
		txtpnHej.setBackground(Color.LIGHT_GRAY);
		txtpnHej.setForeground(Color.BLACK);
		txtpnHej.setText("I will now check the equivalence for the following circuits : \n Circuit 1: !(a /\\ b) \n Circuit 2: !(a) \\/ !(b) \n The result is: " + result);
		frmTitleee.getContentPane().add(txtpnHej);
		
		JButton btnGenerte = new JButton("Generte");
		frmTitleee.getContentPane().add(btnGenerte);
		
		JTextPane txtpnIHavewCreated = new JTextPane();
		txtpnIHavewCreated.setFont(new Font("Tahoma", Font.BOLD, 13));
		txtpnIHavewCreated.setBackground(Color.LIGHT_GRAY);
		frmTitleee.getContentPane().add(txtpnIHavewCreated);
		
		
		btnGenerte.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {		
				txtpnIHavewCreated.setText("I have created the following random circuits:" + "\n" + list );		
			}
		});
		
	
	
		


}
}
