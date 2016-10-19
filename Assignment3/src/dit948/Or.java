package dit948;

import java.util.ArrayList;

/**
 * This is a subclass of Circuit implementing the disjunction of a left Circuit
 * and a right Circuit
 * 
 */

public class Or extends Circuit {

	
	// Private instance variables,
	// left, the left Circuit
	// right, the right Circuit
//	Circuit circuit = new Circuit();

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
		
		return (left.isTrueIn(assignment) || right.isTrueIn(assignment));

							
	}

	/**
	 * Returns the array of free Variables in the disjunction of a left circuit
	 * and a right circuit. The order of variables is not important, however, a
	 * variable should appear exactly once in the array (no repetitions)
	 */

	public Variable[] freeVariables() {
		Variable[] array1st = left.freeVariables();

		Variable[] array2st = left.freeVariables();

		ArrayList<Variable> arrayListArray = new ArrayList<Variable>();

		//lägg in första arrayen in i Arraylist
		for (int i = 0; i < array1st.length; i++) {
			arrayListArray.add(array1st[i]);
		}

		for (int i = 0; i < array2st.length; i++) {
			boolean Double = false;
			for (int j = 0; j < arrayListArray.size(); j++) {

				if (arrayListArray.get(j).getName().equals(array2st[i].getName())) {
					Double = true;
				}

			} 
			if (Double == false) {
				arrayListArray.add(array2st[i]);
			}


		}

		Variable[] allNonRepet =  arrayListArray.toArray(new Variable[arrayListArray.size()]);

		return allNonRepet;	}

}