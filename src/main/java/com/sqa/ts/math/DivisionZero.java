package com.sqa.ts.math;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DivisionZero {

	private double result;

	/**
	 * This is the data that is accessed by the test
	 */
	@DataProvider(name = "power")
	public static Object[][] dataSetNum() {
		return new Object[][] { { 53 }, { 211 }, { 43 }, { 0 }, { 565 }, { 536 } };
	}

	/**
	 * This runs the test. Data from DataProvider is being passed into the
	 * variable declared.
	 */
	@Test(dataProvider = "power")
	public void divideZero(double number) {
		double divideNum = 1.0;
		try {
			result = divideNum / number;
		} catch (ArithmeticException e) {
			// TODO Auto-generated catch block
			System.out.println("Can't divide with the number Zero");
			// e.printStackTrace();
		}
	}

}
