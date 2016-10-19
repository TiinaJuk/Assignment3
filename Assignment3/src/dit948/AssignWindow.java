package dit948;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextPane;

import static dit948.Random.randomInt;
import static dit948.SimpleIO.print;
import static dit948.SimpleIO.println;

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
		//result = args[0];
		//list = args[1];
		
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
		//CREATING THE OBJECT OF CLASSES
				Circuit circuit = new Circuit();
				//Circuit circuit1 =null;
				//Circuit circuit2 = null;
				String[] circuitString = new String [2];
				
			
				// Use the set of variables "v", "w", "x", "y", "z", "a", "b"  
				String [] allVariables = new String[] {"v", "w", "x", "y", "z", "a", "b"};
				
				// Use an assignment where  the true variables are "v", "y", "a"
				// for all circuits you create
				String [] trueVariables = new String[] {"v", "y", "a"};		
				
				//SEND TRUE VARIABLES TO ASSIGNMENT, so that it will afterwards check weather or not given value is true
				Assignment assignment = new Assignment(trueVariables);
				
				
				// Create two circuits for !(a /\ b) and !(a) \/ !(b) and check whether or
				// not they are equivalent
				//String[] a = new String[]{"a"};
				//String[] b = new String[]{"b"};
				
				//Circuit circuitA = Circuit.mkRandom(1,a);
				//Circuit circuitB = Circuit.mkRandom(1,b);
			
				Circuit circLeft = new Not(new And(new Variable("a"),new Variable("b")));
				Circuit circRight = new Or (new Not(new Variable("a")), new Not (new Variable("b")));
				
				boolean result = circLeft.equals(circRight);
					
				//circuitString[0] = " " + result;
				
				//PRINTING THAT TO THE CONSOLE
				//System.out.println("I will now check the equivalence for the following circuits: ");
				//System.out.println("Circuit 1: !(a /and b)");
				//System.out.println("Circuit 2: !(a) or/ !(b)");
				//System.out.println("The result is: " + result);
				
				
				// Print out n random circuits and their truth values using the 
				// assignment above (for a user-provided input n).
		/*		println(circLeft + " " + circRight +" : " +circLeft.equals(circRight));
				
				int number = 20;
				
				
				String circuitList = "";
				
				int inc =1;
				
				for(int i = 0; i < number; i++){
				int depht = 1 + (randomInt(5)); 
				circuit = Circuit.mkRandom(depht, allVariables);
				print(circuit); // why does it not print an adress if we are prining an object?
				print(":");
				boolean results = circuit.isTrueIn(assignment);
				println(results);
				circuitList = circuitList + inc + ". " + circuit+ ":" + results + "\n";
				inc++;
				}
				circuitString[1] = circuitList;
				AssignWindow.main(circuitString);*/
				
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
		txtpnHej.setText("I will now check the equivalence for the following circuits :"+"\n"+	circLeft + "    " + circRight +" : " +circLeft.equals(circRight) );
		frmTitleee.getContentPane().add(txtpnHej);
		
		JButton btnGenerte = new JButton("Generate");
		frmTitleee.getContentPane().add(btnGenerte);
		
		JTextArea txtpnIHavewCreated = new JTextArea();
		txtpnIHavewCreated.setFont(new Font("Tahoma", Font.BOLD, 13));
		txtpnIHavewCreated.setBackground(Color.LIGHT_GRAY);
		frmTitleee.getContentPane().add(txtpnIHavewCreated);
		
		
		btnGenerte.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {	
				txtpnIHavewCreated.setText("");
				for (int i = 0; i < 20; i++){
					Circuit circut = Circuit.mkRandom(5, allVariables);
				txtpnIHavewCreated.append(circut + " : " +circut.isTrueIn(assignment) +"\n");
				}
						
			}
		});
		
	
	
		


}
}
