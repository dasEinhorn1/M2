package edu.gatech.oad.antlab.person;

/**
 *  A simple class for person 5
 *  returns their name and a
 *  modified string
 *
 *  @author Bob (and Adam Hayward)
 *  @version 1.1
 */
public class Person5 {
  /** Holds the persons real name */
  private String name;
  	/**
	 * The constructor, takes in the persons
	 * name
	 * @param pname the person's real name
	 */
  public Person5(String pname) {
    name = pname;
  }
  	/**
	 * This method should take the string
	 * input and return its characters rotated
	 * 2 positions.
	 * given "gtg123b" it should return
	 * "g123bgt".
	 // iterate through and add to the new string starting from the 3rd position
	 *
	 * @param input the string to be modified
	 * @return the modified string
	 */
	private String calc(String input) {
		// declare the string to return
    String s = "";
		for (int i = 2; i < input.length() + 2; i++) {
			// add to the string at the index % length to loop back for the last two
			s += input.charAt(i % input.length());
		}
		// return the new shifted string
	  return s;
	}

	/**
	 * Return a string rep of this object
	 * that varies with an input string
	 *
	 * @param input the varying string
	 * @return the string representing the
	 *         object
	 */
	public String toString(String input) {
	  return name + calc(input);
	}
}
