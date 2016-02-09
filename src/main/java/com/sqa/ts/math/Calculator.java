
package com.sqa.ts.math;

import java.util.Arrays;

/**
 * Calculator //ADDD (description of class)
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
public class Calculator {

	public static double addNumbers(double operand1, double operand2) {
		double result = operand1 + operand2;
		return result;
	}

	public static double multiplyNumbers(double operand1, double operand2) {
		double result = operand1 * operand2;
		return result;
	}

	public static double subtractNumbers(double operand1, double operand2) {
		double result = operand1 - operand2;
		return result;
	}

	/**
	 * @param data
	 */
	public static void display2DMatrix(Object[][] matrix, String title) {
		System.out.println("Data: " + Arrays.deepToString(matrix) + "\n");
	}

	/**
	 * @param data
	 */
	public static void display2DMatrix(double[][] data, String title) {
		// System.out.println("Data: " + Arrays.deepToString(data));
		System.out.println(title);
		System.out.println("-----------------------------------------");
		for (int i = 0; i < data.length; i++) {
			System.out.println("| " + data[i][0] + " \t| " + data[i][1] + " \t| " + data[i][2] + " \t| " + data[i][3]
					+ " \t| " + data[i][4] + " \t| ");
			System.out.println("-----------------------------------------");
		}

	}

}
