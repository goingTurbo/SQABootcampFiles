
package com.sqa.ts.selenium.actions;

import org.testng.annotations.Test;

/**
 * ArraysTest //ADDD (description of class)
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
public class ArraysTest {

	// These are 2 dimensional arrays
	// 4 is rows and the 2nd one is columns. look what would happen if
	// it was [4][3] when declaring
	String[][] multiDimArray1 = new String[4][];

	// this is doing the same thing that test "create2DArray" method is doing
	String[][] multiDimArray2 = { { "2", "4", "A", "6" }, { "13", "6", "S", "7" }, { "7", "4", "M", "28" },
			{ "33", "3", "D", "11" } };

	@Test
	public void create2DArray() {
		String[] test1 = new String[] { "2", "4", "A", "6" };
		String[] test2 = new String[] { "13", "6", "S", "7" };
		String[] test3 = new String[] { "7", "4", "M", "28" };
		String[] test4 = new String[] { "33", "3", "D", "11" };

		multiDimArray1[0] = test1;
		multiDimArray1[1] = test2;
		multiDimArray1[2] = test3;
		multiDimArray1[3] = test4;

		display(multiDimArray1);
	}

	private void display(String[][] multiDimArray) {

		// // i++ is incremented after the variable is selected
		// // ++i is incremented before we use the variable
		// int i = 0;
		// int j = 0;
		// // This is the long and hard way to print out everything
		// System.out.println("[" + multiDimArray[i][j++] + "] [" +
		// multiDimArray[i][j++] + "] [" + multiDimArray[i][j++]
		// + "] [" + multiDimArray[i][j++] + "]");
		// System.out.println("[" + multiDimArray[++i][0] + "] [" +
		// multiDimArray[i][1] + "] [" + multiDimArray[i][2]
		// + "] [" + multiDimArray[i][3] + "]");
		// System.out.println("[" + multiDimArray[++i][0] + "] [" +
		// multiDimArray[i][1] + "] [" + multiDimArray[i][2]
		// + "] [" + multiDimArray[i][3] + "]");
		// System.out.println("[" + multiDimArray[++i][0] + "] [" +
		// multiDimArray[i][1] + "] [" + multiDimArray[i][2]
		// + "] [" + multiDimArray[i][3] + "]");

		// you are going to loop thru a spread sheet type matrix
		// starting on the first row
		for (int row = 0; row < multiDimArray.length; row++) {
			// Go thru and display each column
			System.out.print("Test " + (row + 1) + ":\t");
			for (int columns = 0; columns < multiDimArray[row].length; columns++) {
				System.out.print("[" + multiDimArray[row][columns] + "]\t");
			}
			System.out.print("\n");
		}
	}
}
