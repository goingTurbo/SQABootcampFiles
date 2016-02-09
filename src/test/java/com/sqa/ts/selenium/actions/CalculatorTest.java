
package com.sqa.ts.selenium.actions;

import java.util.Arrays;
import java.util.Properties;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sqa.ts.math.Calculator;

/**
 * CalculatorTest //ADDD (description of class)
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
public class CalculatorTest {

	private static double[][] data;
	private static double[] test;
	private static int currentTestIndex;
	private static int columnsCount = 5;

	@BeforeClass
	public static void setupClass() {
		System.out.println("Before class method is executing");
		// The 'Helper' part of the code is from another project. You connect
		// it by adding the existing project to the current projects build path
		Properties props = Helper.loadProperties("calculate.properties");
		String[] operands1 = props.getProperty("operand1").split(",");
		// the ' .split(",") ' is telling the code where to dissect in the
		// string
		String[] operands2 = props.getProperty("operand2").split(",");
		String[] expAddResults = props.getProperty("expAddResult").split(",");
		String[] expSubResults = props.getProperty("expSubResult").split(",");
		String[] expMultResults = props.getProperty("expMultResult").split(",");
		double[] operands1D = new double[operands1.length];
		double[] operands2D = new double[operands2.length];
		double[] expAddResultsD = new double[expAddResults.length];
		double[] expSubResultsD = new double[expSubResults.length];
		double[] expMultResultsD = new double[expMultResults.length];

		// System.out.println("Strings: \n" + Arrays.toString(operands1) + "\n"
		// + Arrays.toString(operands2) + "\n"
		// + Arrays.toString(expAddResults) + "\n" +
		// Arrays.toString(expSubResults) + "\n"
		// + Arrays.toString(expMultResults));

		for (int i = 0; i < operands1.length; i++) {
			operands1D[i] = Double.parseDouble(operands1[i]);
		}
		for (int i = 0; i < operands2.length; i++) {
			operands2D[i] = Double.parseDouble(operands2[i]);
		}
		for (int i = 0; i < expAddResults.length; i++) {
			expAddResultsD[i] = Double.parseDouble(expAddResults[i]);
		}
		for (int i = 0; i < expSubResults.length; i++) {
			expSubResultsD[i] = Double.parseDouble(expSubResults[i]);
		}
		for (int i = 0; i < expMultResults.length; i++) {
			expMultResultsD[i] = Double.parseDouble(expMultResults[i]);
		}

		// System.out.println("Doubles: \n" + Arrays.toString(operands1D) + "\n"
		// + Arrays.toString(operands2D) + "\n"
		// + Arrays.toString(expAddResultsD) + "\n" +
		// Arrays.toString(expSubResultsD) + "\n"
		// + Arrays.toString(expMultResultsD));

		data = new double[operands1.length][];
		// the 'data.length' is looking at the first outer array ->data[*][]
		for (int row = 0; row < data.length; row++) {
			data[row] = new double[] { operands1D[row], operands2D[row], expAddResultsD[row], expSubResultsD[row],
					expMultResultsD[row] };
			// the above for loop sorts the data into a new 2d array so that the
			// tests can execute the data correctly
		}

		System.out.println("Data: " + Arrays.deepToString(data) + "\n");
	}

	@Test
	public void display2DMatrix() {
		Calculator.display2DMatrix(data, "The Calculate Matrix:");
	}

	@Ignore
	@Test
	public void test1() {
		// because the method is static, it doesn't need to make a new object
		// instance of 'Calculator'
		System.out.println("Test1");
		double operand1 = data[0][0];
		double operand2 = data[0][1];
		double actualResultA = Calculator.addNumbers(operand1, operand2);
		double expAddResult = data[0][2];
		System.out.print(
				operand1 + " + " + operand2 + " = " + actualResultA + "?..\t Expected result was: " + expAddResult);
		if (actualResultA == expAddResult) {
			System.out.println("\tCorrect!");
		} else {
			System.out.println("\tWrong, the expected value was incorrect.");
		}

		double actualResultS = Calculator.subtractNumbers(operand1, operand2);
		double expSubResult = data[0][3];
		System.out.print(
				operand1 + " - " + operand2 + " = " + actualResultS + "?..\t Expected result was: " + expSubResult);
		if (actualResultS == expSubResult) {
			System.out.println("\tCorrect!");
		} else {
			System.out.println("\tWrong, the expected value was incorrect.");
		}

		double actualResultM = Calculator.multiplyNumbers(operand1, operand2);
		double expMultResult = data[0][4];
		System.out.print(
				operand1 + " * " + operand2 + " = " + actualResultM + "?..\t Expected result was: " + expMultResult);
		if (actualResultM == expMultResult) {
			System.out.println("\tCorrect!");
		} else {
			System.out.println("\tWrong, the expected value was incorrect.");
		}
		// delta is the deviation from the results. 0 means exact, 10 would be
		// +10 or -10 from actual to expected
		Assert.assertEquals(expAddResult, actualResultA, 0);
		Assert.assertEquals(expSubResult, actualResultS, 0);
		Assert.assertEquals(expMultResult, actualResultM, 0);

		System.out.println("--------------------------------------------------------------");
	}

	@Ignore
	@Test
	public void test2() {
		System.out.println("Test2");
		double operand1 = data[1][0];
		double operand2 = data[1][1];
		double actualResultA = Calculator.addNumbers(operand1, operand2);
		double expAddResult = data[1][2];
		System.out.print(
				operand1 + " + " + operand2 + " = " + actualResultA + "?..\t Expected result was: " + expAddResult);
		if (actualResultA == expAddResult) {
			System.out.println("\tCorrect!");
		} else {
			System.out.println("\tWrong, the expected value was incorrect.");
		}
		// delta is the deviation from the results. 0 means exact, 10 would be
		// +10 or -10 from actual to expected
		double actualResultS = Calculator.subtractNumbers(operand1, operand2);
		double expSubResult = data[1][3];
		System.out.print(
				operand1 + " - " + operand2 + " = " + actualResultS + "?..\t Expected result was: " + expSubResult);
		if (actualResultS == expSubResult) {
			System.out.println("\tCorrect!");
		} else {
			System.out.println("\tWrong, the expected value was incorrect.");
		}
		double actualResultM = Calculator.multiplyNumbers(operand1, operand2);
		double expMultResult = data[1][4];
		System.out.print(
				operand1 + " * " + operand2 + " = " + actualResultM + "?..\t Expected result was: " + expMultResult);
		if (actualResultM == expMultResult) {
			System.out.println("\tCorrect!");
		} else {
			System.out.println("\tWrong, the expected value was incorrect.");
		}
		System.out.println("--------------------------------------------------------------");

		Assert.assertEquals(expAddResult, actualResultA, 0);
		Assert.assertEquals(expSubResult, actualResultS, 0);
		Assert.assertEquals(expMultResult, actualResultM, 0);
		// if the above assert gets the wrong answer, it will stop executing
		// code and will go on to the next test so the below line will not
		// execute
		System.out.println("--------------------------------------------------------------");
	}

	@Ignore
	@Test
	public void test3() {
		System.out.println("Test3");
		double operand1 = data[2][0];
		double operand2 = data[2][1];
		double actualResultA = Calculator.addNumbers(operand1, operand2);
		double expAddResult = data[2][2];
		System.out.print(
				operand1 + " + " + operand2 + " = " + actualResultA + "?..\t Expected result was: " + expAddResult);
		if (actualResultA == expAddResult) {
			System.out.println("\tCorrect!");
		} else {
			System.out.println("\tWrong, the expected value was incorrect.");
		}
		// delta is the deviation from the results. 0 means exact, 10 would be
		// +10 or -10 from actual to expected
		double actualResultS = Calculator.subtractNumbers(operand1, operand2);
		double expSubResult = data[2][3];
		System.out.print(
				operand1 + " - " + operand2 + " = " + actualResultS + "?..\t Expected result was: " + expSubResult);
		if (actualResultS == expSubResult) {
			System.out.println("\tCorrect!");
		} else {
			System.out.println("\tWrong, the expected value was incorrect.");
		}
		double actualResultM = Calculator.multiplyNumbers(operand1, operand2);
		double expMultResult = data[2][4];
		System.out.print(
				operand1 + " * " + operand2 + " = " + actualResultM + "?..\t Expected result was: " + expMultResult);
		if (actualResultM == expMultResult) {
			System.out.println("\tCorrect!");
		} else {
			System.out.println("\tWrong, the expected value was incorrect.");
		}
		System.out.println("--------------------------------------------------------------");

		Assert.assertEquals(expAddResult, actualResultA, 0);
		Assert.assertEquals(expSubResult, actualResultS, 0);
		Assert.assertEquals(expMultResult, actualResultM, 0);
	}

	@Ignore
	@Test
	public void test4() {
		System.out.println("Test4");
		double operand1 = data[3][0];
		double operand2 = data[3][1];
		double actualResultA = Calculator.addNumbers(operand1, operand2);
		double expAddResult = data[3][2];
		System.out.print(
				operand1 + " + " + operand2 + " = " + actualResultA + "?..\t Expected result was: " + expAddResult);
		if (actualResultA == expAddResult) {
			System.out.println("\tCorrect!");
		} else {
			System.out.println("\tWrong, the expected value was incorrect.");
		}
		// delta is the deviation from the results. 0 means exact, 10 would be
		// +10 or -10 from actual to expected
		double actualResultS = Calculator.subtractNumbers(operand1, operand2);
		double expSubResult = data[3][3];
		System.out.print(
				operand1 + " - " + operand2 + " = " + actualResultS + "?..\t Expected result was: " + expSubResult);
		if (actualResultS == expSubResult) {
			System.out.println("\tCorrect!");
		} else {
			System.out.println("\tWrong, the expected value was incorrect.");
		}
		double actualResultM = Calculator.multiplyNumbers(operand1, operand2);
		double expMultResult = data[3][4];
		System.out.print(
				operand1 + " * " + operand2 + " = " + actualResultM + "?..\t Expected result was: " + expMultResult);
		if (actualResultM == expMultResult) {
			System.out.println("\tCorrect!");
		} else {
			System.out.println("\tWrong, the expected value was incorrect.");
		}
		System.out.println("--------------------------------------------------------------");

		Assert.assertEquals(expAddResult, actualResultA, 0);
		Assert.assertEquals(expSubResult, actualResultS, 0);
		Assert.assertEquals(expMultResult, actualResultM, 0);
	}

	@Ignore
	@Test
	public void test5() {
		System.out.println("Test5");
		double operand1 = data[4][0];
		double operand2 = data[4][1];
		double actualResultA = Calculator.addNumbers(operand1, operand2);
		double expAddResult = data[4][2];
		System.out.print(
				operand1 + " + " + operand2 + " = " + actualResultA + "?..\t Expected result was: " + expAddResult);
		if (actualResultA == expAddResult) {
			System.out.println("\tCorrect!");
		} else {
			System.out.println("\tWrong, the expected value was incorrect.");
		}
		// delta is the deviation from the results. 0 means exact, 10 would be
		// +10 or -10 from actual to expected
		double actualResultS = Calculator.subtractNumbers(operand1, operand2);
		double expSubResult = data[4][3];
		System.out.print(
				operand1 + " - " + operand2 + " = " + actualResultS + "?..\t Expected result was: " + expSubResult);
		if (actualResultS == expSubResult) {
			System.out.println("\tCorrect!");
		} else {
			System.out.println("\tWrong, the expected value was incorrect.");
		}
		double actualResultM = Calculator.multiplyNumbers(operand1, operand2);
		double expMultResult = data[4][4];
		System.out.print(
				operand1 + " * " + operand2 + " = " + actualResultM + "?..\t Expected result was: " + expMultResult);
		if (actualResultM == expMultResult) {
			System.out.println("\tCorrect!");
		} else {
			System.out.println("\tWrong, the expected value was incorrect.");
		}
		System.out.println("--------------------------------------------------------------");

		Assert.assertEquals(expAddResult, actualResultA, 0);
		Assert.assertEquals(expSubResult, actualResultS, 0);
		Assert.assertEquals(expMultResult, actualResultM, 0);
	}

	@Ignore
	@Test
	public void test6() {
		System.out.println("Test6");
		double operand1 = data[5][0];
		double operand2 = data[5][1];
		double actualResultA = Calculator.addNumbers(operand1, operand2);
		double expAddResult = data[5][2];
		System.out.print(
				operand1 + " + " + operand2 + " = " + actualResultA + "?..\t Expected result was: " + expAddResult);
		if (actualResultA == expAddResult) {
			System.out.println("\tCorrect!");
		} else {
			System.out.println("\tWrong, the expected value was incorrect.");
		}
		// delta is the deviation from the results. 0 means exact, 10 would be
		// +10 or -10 from actual to expected
		double actualResultS = Calculator.subtractNumbers(operand1, operand2);
		double expSubResult = data[5][3];
		System.out.print(
				operand1 + " - " + operand2 + " = " + actualResultS + "?..\t Expected result was: " + expSubResult);
		if (actualResultS == expSubResult) {
			System.out.println("\tCorrect!");
		} else {
			System.out.println("\tWrong, the expected value was incorrect.");
		}
		double actualResultM = Calculator.multiplyNumbers(operand1, operand2);
		double expMultResult = data[5][4];
		System.out.print(
				operand1 + " * " + operand2 + " = " + actualResultM + "?..\t Expected result was: " + expMultResult);
		if (actualResultM == expMultResult) {
			System.out.println("\tCorrect!");
		} else {
			System.out.println("\tWrong, the expected value was incorrect.");
		}
		System.out.println("--------------------------------------------------------------");

		Assert.assertEquals(expAddResult, actualResultA, 0);
		Assert.assertEquals(expSubResult, actualResultS, 0);
		Assert.assertEquals(expMultResult, actualResultM, 0);
	}

	@Ignore
	@Test
	public void test7() {
		System.out.println("Test7");
		double operand1 = data[6][0];
		double operand2 = data[6][1];
		double actualResultA = Calculator.addNumbers(operand1, operand2);
		double expAddResult = data[6][2];
		System.out.print(
				operand1 + " + " + operand2 + " = " + actualResultA + "?..\t Expected result was: " + expAddResult);
		if (actualResultA == expAddResult) {
			System.out.println("\tCorrect!");
		} else {
			System.out.println("\tWrong, the expected value was incorrect.");
		}
		// delta is the deviation from the results. 0 means exact, 10 would be
		// +10 or -10 from actual to expected
		double actualResultS = Calculator.subtractNumbers(operand1, operand2);
		double expSubResult = data[6][3];
		System.out.print(
				operand1 + " - " + operand2 + " = " + actualResultS + "?..\t Expected result was: " + expSubResult);
		if (actualResultS == expSubResult) {
			System.out.println("\tCorrect!");
		} else {
			System.out.println("\tWrong, the expected value was incorrect.");
		}
		double actualResultM = Calculator.multiplyNumbers(operand1, operand2);
		double expMultResult = data[6][4];
		System.out.print(
				operand1 + " * " + operand2 + " = " + actualResultM + "?..\t Expected result was: " + expMultResult);
		if (actualResultM == expMultResult) {
			System.out.println("\tCorrect!");
		} else {
			System.out.println("\tWrong, the expected value was incorrect");
		}
		System.out.println("--------------------------------------------------------------");
		Assert.assertEquals(expAddResult, actualResultA, 0);
		Assert.assertEquals(expSubResult, actualResultS, 0);
		Assert.assertEquals(expMultResult, actualResultM, 0);
	}

	@Ignore
	@Test
	public void test8() {
		System.out.println("Test8");
		double operand1 = data[7][0];
		double operand2 = data[7][1];
		double actualResultA = Calculator.addNumbers(operand1, operand2);
		double expAddResult = data[7][2];
		System.out.print(
				operand1 + " + " + operand2 + " = " + actualResultA + "?..\t Expected result was: " + expAddResult);
		if (actualResultA == expAddResult) {
			System.out.println("\tCorrect!");
		} else {
			System.out.println("\tWrong, the expected value was incorrect.");
		}
		// delta is the deviation from the results. 0 means exact, 10 would be
		// +10 or -10 from actual to expected
		double actualResultS = Calculator.subtractNumbers(operand1, operand2);
		double expSubResult = data[7][3];
		System.out.print(
				operand1 + " - " + operand2 + " = " + actualResultS + "?..\t Expected result was: " + expSubResult);
		if (actualResultS == expSubResult) {
			System.out.println("\tCorrect!");
		} else {
			System.out.println("\tWrong, the expected value was incorrect");
		}
		double actualResultM = Calculator.multiplyNumbers(operand1, operand2);
		double expMultResult = data[7][4];
		System.out.print(
				operand1 + " * " + operand2 + " = " + actualResultM + "?..\t Expected result was: " + expMultResult);
		if (actualResultM == expMultResult) {
			System.out.println("\tCorrect!");
		} else {
			System.out.println("\tWrong, the expected value was incorrect");
		}

		Assert.assertEquals(expAddResult, actualResultA, 0);
		Assert.assertEquals(expSubResult, actualResultS, 0);
		Assert.assertEquals(expMultResult, actualResultM, 0);

	}
}