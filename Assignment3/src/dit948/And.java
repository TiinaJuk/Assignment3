package dit948;

/*
 * This is a subclass of Circuit implementing the conjunction of a left Circuit
 * and a right Circuit
 */

//testing
//Checking where it saves these
public class And extends Circuit {
		
	// Private instance variables,
	// left, the left Circuit
	// right, the right Circuit
	Variable variable;
	Circuit circuit = new Circuit();
	
	private Circuit left = new Circuit();
	private Circuit right = new Circuit();
	
	// Constructor with parameters
	public And(Circuit left, Circuit right) {	
		this.left = left;
		this.right = right;
	}

	/**
	 * String representation of the conjunction of a left circuit and a right
	 * circuit
	 */
	
	public String toString() {
		String circuit = "(" + left + "AND" + right + ")";
		return circuit;
	}

	/*
	 * Returns true if the conjunction of the left circuit and the right circuit
	 * is true in the assignment
	 */

	public boolean isTrueIn(Assignment assignment) {
		boolean leftBo = left.isTrueIn(assignment);
		boolean rightBo = right.isTrueIn(assignment);
		
		boolean result = true;
		
		if ((leftBo == true) && (rightBo == true)){
			result = true;	
		}
		
		else if ((leftBo == false) && (rightBo == false)){
			result = true;	
		}
		
		else {
			result = false;	
		}
		
		return result;		
			
	}

	/**
	 * Returns the array of free Variables in the conjunction of a left circuit
	 * and a right circuit. The order of variables is not important, however, a
	 * variable should appear exactly once in the array (no repetitions)
	 */

	public Variable[] freeVariables() {
		
		return circuit.freeVariables();		
	}

}