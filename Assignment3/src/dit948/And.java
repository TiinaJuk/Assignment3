package dit948;

/*
 * This is a subclass of Circuit implementing the conjunction of a left Circuit
 * and a right Circuit
 */

//Checking where it saves these
public class And extends Circuit {

	// Private instance variables,
	// left, the left Circuit
	// right, the right Circuit

	// code here

	// Constructor with parameters

	public And(Circuit left, Circuit right) {
		// code here
	}

	/**
	 * String representation of the conjunction of a left circuit and a right
	 * circuit
	 */

	public String toString() {
		// code here
	}

	/**
	 * Returns true if the conjunction of the left circuit and the right circuit
	 * is true in the assignment
	 */

	public boolean isTrueIn(Assignment assignment) {
		// code here
	}

	/**
	 * Returns the array of free Variables in the conjunction of a left circuit
	 * and a right circuit. The order of variables is not important, however, a
	 * variable should appear exactly once in the array (no repetitions)
	 */

	public Variable[] freeVariables() {
		// code here
	}

}