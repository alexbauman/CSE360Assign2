/**	Author: Alexander Bauman
 *  Class ID: 324
 *  Assignment: 2
 *  Description: This class creates	a simple calculator without an interface.
 *  It has addition, subtraction, multiplication, and division functions,
 *  as well as the ability to track the history of operations performed.
 * 
 */

package cse360assign2;

public class Calculator {

	private int total;
	private String history;

	/**
	 * This constructor initializes the total variable to 0 and the history
	 * variable to the initial total
	 */

	public Calculator() {
		total = 0; // not needed - included for clarity
		history = "0";
	}

	/**
	 * This method returns the current total, as modified by the other methods.
	 * 
	 * @return total	current total after all operations have been performed
	 */

	public int getTotal() {
		return total;
	}

	/**
	 * This method adds a user-inputted number to the current total.
	 * 
	 * @param value		number inputted by the user
	 */

	public void add(int value) {
		total += value;
		history += " + " + value;
	}

	/**
	 * This method subtracts a user-inputted number from the current total.
	 * 
	 * @param value		number inputted by the user
	 */

	public void subtract(int value) {
		total -= value;
		history += " - " + value;
	}

	/**
	 * This method multiplies the current total by a user-inputted number.
	 * 
	 * @param value		number inputted by the user
	 */

	public void multiply(int value) {
		total = total * value;
		history += " * " + value;
	}

	/**
	 * This method divides the current total by a user-inputted number. It will
	 * include a check to make the total 0 if the user enters a 0 to prevent
	 * an illegal division operation from being performed.
	 * 
	 * @param value		number inputted by the user
	 */

	public void divide(int value) {

		if (value == 0) {
			total = 0;
		}

		else {
			total = total / value;
		}
		
		history += " / " + value;
	}

	/**
	 * This method returns the history of operations performed on the total, in the
	 * form of a string
	 * 
	 * @return history	record of all operations performed
	 */

	public String getHistory() {
		return history;
	}
}