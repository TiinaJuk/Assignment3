package dit948;

import static dit948.SimpleIO.*;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextPane;

import static dit948.Random.*;

/**
 * This is the main class. It first creates two circuits, checks their
 * equivalence and prints the result to the console. It also prompts the user to
 * enter the number of random circuits to create (say n). It then creates n
 * random circuits of maximal depth 5, and prints the circuits and their truth
 * values to the console.
 * 
 * @author musard
 * 
 */

public class Main {

	public static void main(String[] args) {
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
		String[] a = new String[]{"a"};
		String[] b = new String[]{"b"};
		
		Circuit circuitA = Circuit.mkRandom(1,a);
		Circuit circuitB = Circuit.mkRandom(1,b);
	
		Circuit circLeft = new Not(new And(circuitA,circuitB));
		Circuit circRight = new Or (new Not(circuitA), new Not (circuitB));
		
		boolean result = circLeft.equals(circRight);
			
		circuitString[0] = " " + result;
		
		//PRINTING THAT TO THE CONSOLE
		System.out.println("I will now check the equivalence for the following circuits: ");
		System.out.println("Circuit 1: !(a /and b)");
		System.out.println("Circuit 2: !(a) or/ !(b)");
		System.out.println("The result is: " + result);
		
		
		// Print out n random circuits and their truth values using the 
		// assignment above (for a user-provided input n).

		
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
		AssignWindow.main(circuitString);
		
	}

}