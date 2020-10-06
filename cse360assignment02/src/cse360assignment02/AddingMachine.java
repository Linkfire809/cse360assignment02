package cse360assignment02;

/**
 * The AddingMachine program is an application designed
 * as a simple calculator program that adds or subtracts values
 * then displays the total.
 * 
 * @author Andrew Tran
 * @version 1.1
 * @since 2020-10-05
 *
 */

public class AddingMachine {
	/**
	 * Integer value representing the total value from the calculated equation.
	 */
	private int total;
	/**
	 * String to carry the resulting equation later on in toString().
	 */
	private String text = new String();
	
	/**
	 * AddingMachine class constructor.
	 * 
	 */
	public AddingMachine () {
		total = 0; //not needed - included for clarity
	}
	
	/**
	 * Method getTotal returns the total value from calculations.
	 * @return total
	 */
	public int getTotal () {
		return total;
	}
	
	/**
	 * Method add returns the value made from adding the given integer value to the total.
	 * @param value
	 */
	public void add (int value) {
		total = total + value;
		text = text + " + " + value;
	}
	
	/**
	 * Method subtract returns the value from subtracting the given integer value from the total.
	 * @param value
	 */
	public void subtract (int value) {
		total = total - value;
		text = text + " - " + value;
	}
	
	/**
	 * Method toString prints out the resulting string of elementary equations starting with 0 and ending at the most recent input.
	 */
	public String toString () {
		System.out.println("0" + text);
		return text;
	}
	
	/**
	 * Method clear wipes the results from toString, resetting total to 0 and the text string to null.
	 */
	public void clear() {
		total = 0;
		text = "";
	}
}
