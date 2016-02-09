package com.sqa.ts.selenium.actions;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * Testing the functionality of using DataProvider
 */
public class DataProviderTest {

	/**
	 * This is the data that is accessed by the test
	 */
	@DataProvider(name = "power")
	public static Object[][] dataSetNum() {
		return new Object[][] { { 5, 1 }, { 2, 5 }, { 3, 4 }, { 3, 4 }, { 3, 5 }, { 2, 6 } };
	}

	/**
	 * This runs the test. Data from DataProvider is being passed into the
	 * variable declared.
	 */
	@Test(dataProvider = "power")
	public void powerMath(int base, int power) {
		// Math.pow uses double data type, no other primitive data type
		Assert.assertEquals(Math.pow(base, power), calculatePowerOfNumberX(base, power));
	}

	// Math.pow is a 'double' data type, thus thats the reason this method uses
	// double
	private double calculatePowerOfNumberX(int b, int p) {
		// this deals with whenever the power is a negative number
		if (p < 0)
			// recursion is needed
			return 1 / calculatePowerOfNumberX(b, p * (-1));

		double result = 1;
		for (int i = 0; i < p; i++) {
			result *= b;
		}
		return result;

	}

	///////////////////// *********Below is my code before
	///////////////////// REFACTORING*******////////////////////////////

	// /**
	// * This is the data that is accessed by the test
	// */
	// @DataProvider(name = "power")
	// public static Object[][] dataSetNum() {
	// Object[][] data = new Object[][] { { 5, 1 }, { 2, 5 }, { 3, 4 }, { 3, 4
	// }, { 3, 5 }, { 2, 6 } };
	// return data;
	// }
	//
	// /**
	// * This runs the test. Data from DataProvider is being passed into the
	// * variable declared.
	// */
	// @Test(dataProvider = "power")
	// public void powerMath(int base, int power) {
	// // Math.pow uses double data type, no other primitive datatype
	// Assert.assertEquals(Math.pow(base, power), calculatePowerOfNumberX(base,
	// power));
	// }
	//
	// // Math.pow is a 'double' data type, thus thats the reason this method
	// uses
	// // double
	// private double calculatePowerOfNumberX(int b, int p) {
	// double result = 1;
	// for (int i = 0; i < p; i++) {
	// result = result * b;
	// }
	// return result;
	//
	// }
}
