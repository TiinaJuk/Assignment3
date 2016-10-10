/**
 * This is a subclass of Circuit implementing the negation of a Circuit
 */

public class Not extends Circuit {

	// Private instance variable,
	// negated, a Circuit to be negated

	// code here

	// Constructor with parameters

	public Not(Circuit negated) {
		// code here
	}

	/**
	 * String representation of the negation of a circuit
	 */

	public String toString() {
		// Code here
	}

	/**
	 * Returns true if the negation of the circuit is true in the assignment
	 */

	public boolean isTrueIn(Assignment assignment) {
		// code here
	}

	/**
	 * Returns the array of free Variables in the negated circuit The order of
	 * variables is not important, however, a variable should appear exactly
	 * once in the array (no repetitions)
	 */

	public Variable[] freeVariables() {
		// code here
	}
}