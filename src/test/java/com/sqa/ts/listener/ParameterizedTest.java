
package com.sqa.ts.listener;

import java.util.Arrays;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameterized;

/**
 * ParameterizedTest //ADDD (description of class)
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
@RunWith(Parameterized.class)
public class ParameterizedTest {

	// 'Input' is in all caps because it is FINAL
	private final int BASE;
	private final int POWER;

	@Parameters
	public static Iterable<Object[]> createData() {
		return Arrays.asList(new Object[][] { { 2, 4 }, { 4, 1 }, { 6, 2 } });
	}

	/**
	 * @param iNPUT
	 */
	public ParameterizedTest(final int base, final int power) {
		this.BASE = base;
		this.POWER = power;
	}

	// Math.pow is a 'double' data type, thus thats the reason this method uses
	// double
	private double calculatePowerOfNumberX(int b, int p) {
		double result = 1;
		for (int i = 0; i < p; i++) {
			result *= b;
		}
		return result;
	}

	@Test
	public void testPower() {
		double result = Math.pow(BASE, POWER);
		double actual = calculatePowerOfNumberX(BASE, POWER);
		Assert.assertEquals(result, actual, 0);
		System.out.println("Result: " + result + "\t   Actual: " + actual);
	}

}
