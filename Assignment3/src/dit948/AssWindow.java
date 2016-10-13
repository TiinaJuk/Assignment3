package dit948;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextPane;
import java.awt.BorderLayout;
import javax.swing.BoxLayout;
import java.awt.Color;
import javax.swing.JButton;

public class AssWindow {

	static String result;
	Main main = new Main();
	private JFrame frmTitleee;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		result = args[0];
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AssWindow window = new AssWindow();
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
	public AssWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmTitleee = new JFrame();
		frmTitleee.setTitle("DIT948 circit oracle");
		frmTitleee.setForeground(Color.GREEN);
		frmTitleee.setBounds(100, 100, 450, 300);
		frmTitleee.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmTitleee.getContentPane().setLayout(new BoxLayout(frmTitleee.getContentPane(), BoxLayout.Y_AXIS));
		
		JTextPane txtpnHej = new JTextPane();
		txtpnHej.setBackground(Color.MAGENTA);
		txtpnHej.setForeground(Color.BLUE);
		txtpnHej.setText("I will now check the equivalence for the following circuits : \n Circuit 1: !(a /and b) \n Circuit 2: !(a) or/ !(b) \n The result is: " + result);
		frmTitleee.getContentPane().add(txtpnHej);
		
		JButton btnGenerte = new JButton("Generte");
		frmTitleee.getContentPane().add(btnGenerte);
		
		JTextPane textPane = new JTextPane();
		frmTitleee.getContentPane().add(textPane);
		


}
}
