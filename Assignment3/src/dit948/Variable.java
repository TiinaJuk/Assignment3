package dit948;

import static dit948.Random.randomInt;

/*
 * This is a subclass of Circuit implementing Variable in a Circuit
 * 
 */

public class Variable extends Circuit {
	// Private instance variable,
	// name, a String representing a variable	
	private String name;

	

	// Constructor with parameters
	
	
	public Variable(String name) {
		this.name = name;	
	}



	/**
	 * String representation of a variable of a circuit
	 */

	public String toString() {
		return name;
	}

	/**
	 * Returns the name of the variable
	 */

	public String getName() {
		return name;
	}
	
	/**
	 * Returns true if the variable is true in the assignment
	 */

	public boolean isTrueIn(Assignment assignment) {
		
		if(assignment.valueOf(this)){
		return true;
		}
		
		return false;
	}

	/**
	 * Returns the array of free Variables in this Variable. 
	 */

	public Variable[] freeVariables() {
		
		return new Variable []{this}; 		
	}

}