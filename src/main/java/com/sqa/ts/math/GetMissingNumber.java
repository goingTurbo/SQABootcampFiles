
package com.sqa.ts.math;

/**
 * GetMissingNumber //ADDD (description of class)
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
public class GetMissingNumber {

	public static void main(String[] args) {

		int sum = 0;
		int total = 5050;
		int[] arrayA = new int[100];

		for (int num : arrayA) {
			sum += num;
		}
		int missingNumber = total - sum;

		System.out.println("The missing number was " + missingNumber);
	}

}

// int[] arr = new int[100];
// for (int i = 0; i < 100; i++) {
// int num = (int) (Math.random() * 100 + 1);
// for (int j = 0; j < 100; j++) {
// for (int k = j + 1; k < 100; k++) {
// if (k != j && arr[k] == arr[j]) {
// arr[i] = num;
// }
// }
// }
//
// }
// Arrays.sort(arr);
// System.out.println("***************************************************");
// for (int num : arr) {
// System.out.println(num);
// }
