
package com.sqa.ts.actions;

import java.util.Scanner;

/**
 * OutOfBoundsTest //ADDD This class will throw
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
public class OutOfBoundsTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choice = 0, data = 0;
		Scanner scan = new Scanner(System.in);

		int[] array5 = { 1, 2, 3, 4, 5, 6 };

		try {
			System.out.println("Which index would you like to print?");
			choice = scan.nextInt();
			data = array5[choice];
			System.out.println("The value of the index is: " + data);
		} catch (IndexOutOfBoundsException e) {
			// TODO Auto-generated catch block
			System.out.println("You chose a number that was out of bounds: ");
			e.printStackTrace();
		}

	}
}
