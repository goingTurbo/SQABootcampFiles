
package com.sqa.ts.requesting;

import java.util.Arrays;

import org.testng.annotations.Test;

import com.sqa.ts.actions.RequestValues;

/**
 * RequestTesting //ADDD (description of class)
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
public class RequestTesting {

	@Test
	@Ignore
	public void test() {
		boolean isHungry = RequestValues.requestBooleanValue("Are you hungry?");
		if (isHungry) { // this is false by default
			System.out.println("Lets go eat!");
		} else {
			System.out.println("Good, I do not want to eat with you!");
		}
	}

	@Test
	@Ignore
	public void test2() {
		int number = RequestValues.requestIntValue("Please pick a number?");
		System.out.println("You have supplied the number: " + number + " ");
	}

	@Test
	@Ignore
	public void test3() {
		double number = RequestValues.requestDoubleValue("Please pick a double style number?");
		System.out.println("You have supplied the number: " + number + " ");
	}

	@Test
	@Ignore
	public void test4() {
		float number = RequestValues.requestFloatValue("Please pick a float number?");
		System.out.println("You have supplied the number: " + number + " ");
	}

	@Test
	public void test5() {
		// The comma in the quotes at the end signifies what the delimiter is
		String[] words = RequestValues.requestStringValues("Please provide a list of words?", ",");
		System.out.println("You have supplied the number: " + Arrays.deepToString(words) + " ");
		// the 'deepToString' will print out the string array. If its not there,
		// the system will on print out the object ID of the String Array
		// this is output -> 'You have supplied the number: [bask, goto, hash]'
	}

}
