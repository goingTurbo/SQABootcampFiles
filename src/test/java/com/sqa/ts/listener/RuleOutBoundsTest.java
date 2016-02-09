
package com.sqa.ts.listener;

import java.util.ArrayList;
import java.util.Scanner;

import org.testng.annotations.Test;

/**
 * RuleOutBoundsTest //ADDD (description of class)
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
public class RuleOutBoundsTest {

	@Rule
	public ExpectedException thrown = ExpectedException.none();

	/**
	 * This Junit test will only pass if the exception is thrown. If user
	 * chooses a number within bounds of array, the test WILL FAIL
	 */
	@Test
	public void ruleOutTest() {
		// initializing the choice and data int variables
		int choice = 0, data = 0;
		Scanner scan = new Scanner(System.in);

		int[] array5 = { 1, 2, 3, 4, 5, 6 };

		System.out.println("Which index would you like to print?");
		choice = scan.nextInt();
		thrown.expect(IndexOutOfBoundsException.class);
		// The message needs to match what the exception message throws when it
		// fails when it's not be expected.

		// Below will match whatever the user chooses, making it dynamic. If the
		// String was 10, the test would only pass if the user selects 10, even
		// though anything beyond that should still pass the test
		thrown.expectMessage(String.valueOf(choice));

		data = array5[choice];
		System.out.println("The value of the index is: " + data);
	}

	/////////////////////////////////// Another way to have a thrown expection
	/////////////////////////////////// at the beginning/////////////////////

	@Test(expected = IndexOutOfBoundsException.class)
	public void testOutOfBoundsException() {
		new ArrayList<Object>().get(0);
	}
}
