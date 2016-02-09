
package com.sqa.ts.math;

/**
 * Math //ADDD (description of class)
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
public class Math {

	public int[] multiplyNumbers(int[] numbers, int multipier) {
		int[] newArray = null;
		int total = 1;
		for (int i = 0; i < numbers.length; i++) {
			newArray[i] = numbers[i] * multipier;
		}
		return newArray;
	}

}
