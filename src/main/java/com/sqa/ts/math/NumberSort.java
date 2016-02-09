
package com.sqa.ts.math;

import java.util.Arrays;

/**
 * NumberSort //ADDD (description of class)
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
public class NumberSort {

	public static void main(String[] args) {
		int[] arr = { 3, 98, 1, 24 };
		Arrays.sort(arr);
		for (int num : arr) {
			System.out.println(num);
		}
		System.out.println(arr.length);
	}
}
