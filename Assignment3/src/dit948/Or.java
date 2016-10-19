package dit948;

/**
 * This is a subclass of Circuit implementing the disjunction of a left Circuit
 * and a right Circuit
 * 
 */

public class Or extends Circuit {

	
	// Private instance variables,
	// left, the left Circuit
	// right, the right Circuit
	Circuit circuit = new Circuit();

	private Circuit left;
	private Circuit right;

	// Constructor with parameters

	public Or(Circuit left, Circuit right) {
		this.left = left;
		this.right = right;
	}

	/**
	 * String representation of the disjunction of a left circuit and a right
	 * circuit
	 */

	public String toString() {
		return left + "\\/" + right;
	}

	/**
	 * Returns true if the disjunction of the left circuit and the right circuit
	 * is true in the assignment
	 */

	public boolean isTrueIn(Assignment assignment) {
		boolean leftBo = left.isTrueIn(assignment);
		boolean rightBo = right.isTrueIn(assignment);
		
		boolean result = true;
		
		if ((leftBo == false) && (rightBo == false)){
			result = false;	
		}
		
		else {
			result = true;	
		}
		
		return result;					
	}

	/**
	 * Returns the array of free Variables in the disjunction of a left circuit
	 * and a right circuit. The order of variables is not important, however, a
	 * variable should appear exactly once in the array (no repetitions)
	 */

	public Variable[] freeVariables() {
		return circuit.freeVariables();
	}

}