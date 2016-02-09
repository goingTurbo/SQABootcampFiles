
package com.sqa.ts.math;

/**
 * EvenOdd //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 * 
 * @author LastName, FirstName
 * @version 1.0.0
 * @since 1.0
 *
 */
public class EvenOdd {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static boolean numberIsEven(int number) {
		if (number % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean numberIsOdd(int number) {
		if (number % 2 == 0) {
			return false;
		} else {
			return true;
		}
	}

}
