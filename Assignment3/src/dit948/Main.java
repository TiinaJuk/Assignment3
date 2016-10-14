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
		Circuit circuit1 =null;
		Circuit circuit2 = null;
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
		
		//////////////////////////
		//CHECK IF GIVEN CIRCUIT IS TRUE OR NOT
		
		//	First left side: !(a /\ b)
		//	a = allVariables[5] in our String[]
		//	b = allVariables[6]
		
		Variable variable;

		//Checking if the value of one character is true or not
		variable = new Variable(allVariables[5]);
		boolean a = assignment.valueOf(variable);
			
		variable = new Variable(allVariables[6]);
		boolean b = assignment.valueOf(variable);
		
		// ALL OPTIONS OF RESULT "AND"
		boolean resultLeft;
		
		if ((a == true) && (b == true)){
				resultLeft = true;	
			}
			
			else if ((a == false) && (b == false)){
				resultLeft = true;	
			}
			
			else {
				resultLeft = false;	
			}
		
		// "IS NOT" BECAUSE ! EXISTS IN GIVEN CIRCUIT
		resultLeft =! resultLeft;
		
		// Then right side
		//	!(a) \/ !(b) 
		//	a = !(allVariables[5]) 
		//	b = !(allVariables[6]);	
		variable = new Variable(allVariables[5]);
		a = !(assignment.valueOf(variable));
			
		variable = new Variable(allVariables[6]);
		b = !(assignment.valueOf(variable));
		
		//CHECKING ALL OPTIONS IN _OR_
		boolean resultRight;
		
		if ((a == true) || (b == true)){
				resultRight = true;	
			}
			
			else if ((a == false) && (b == false)){
				resultRight = false;	
			}
			
			else {
				resultRight = true;	
			}
		
		// COMPARING THE WHOLE CIRCUIT AND GETTING THE RESULT
		boolean result;
		if (resultRight == resultLeft){
			result = true;
		}
		
		else{
			result = false;
		}

		
		circuitString[0] = " " + result;
		
		//PRINTING THAT TO THE CONSOLE
		System.out.println("I will now check the equivalence for the following circuits: ");
		System.out.println("Circuit 1: !(a /and b)");
		System.out.println("Circuit 2: !(a) or/ !(b)");
		System.out.println("The result is: " + result);
		
		
		// Print out n random circuits and their truth values using the 
		// assignment above (for a user-provided input n).

		// ASKING THE USER INPUT THE NUMBER OF RANDOM CIRCUITS
		System.out.println("Number of random circuits: ");
		int number = readInt();
		
		
		
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