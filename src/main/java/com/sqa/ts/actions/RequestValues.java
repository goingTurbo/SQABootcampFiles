
package com.sqa.ts.actions;

import java.util.Scanner;

/**
 * RequestValues //ADDD (description of class)
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
public class RequestValues {

	private static Scanner scanner = new Scanner(System.in);

	public static boolean requestBooleanValue(String question) {
		boolean endValue = true;
		while (true) {
			// how to work with booleans in a question
			System.out.print(question);
			String input = scanner.nextLine();
			if (input.equalsIgnoreCase("yes") || input.equalsIgnoreCase("y")) {
				endValue = true;
				break;
			} else if (input.equalsIgnoreCase("no") || input.equalsIgnoreCase("n")) {
				endValue = false;
				break;
			} else {
				System.out.println("Wrong input");
				continue;
			}
		}
		return endValue;
	}

	public static double requestDoubleValue(String question) {
		double doubleValue = 0;
		String input;
		while (true) {
			try {
				System.out.println(question);
				input = scanner.nextLine();
				doubleValue = Double.parseDouble(input);
				return doubleValue;
			} catch (NumberFormatException e) {
				question = "Please select a valid double number";
				continue;
			}
		}
	}

	public static int requestIntValue(String question) {
		int intValue = 0;
		String input;
		while (true) {
			try {
				System.out.println(question);
				input = scanner.nextLine();
				intValue = Integer.parseInt(input);
				return intValue;
			} catch (NumberFormatException e) {
				question = "Please select a valid Integer number";
				continue;
			}
		}
	}

	// delimiter something that you identify as something that seperates
	// user input
	public static String[] requestStringValues(String question, String delimiter) {
		String[] values;
		System.out.print(question + "\n(Please provide one response seperating elements by a '" + delimiter + "'):");
		String input = scanner.nextLine();
		values = input.split(delimiter);
		for (int i = 0; i < values.length; i++) {
			values[i] = values[i].trim();
			values[i] = values[i].replace(" ", "-"); // this gets rid of the
														// space between words
			// for a single string. e.g.'Mountain-Biking'
		}
		// //substring method cuts of strings based on the beginning index
		// //and ending index
		// values[i].substring(beginIndex, endIndex);
		// //"Hamburger".substring(4,8) returns "urge"
		// //"smiles".substring(1,5) returns "mile"
		return values;
	}

	// this is an overloaded version of the above one. What this does
	// is that if the delimiter is not put in, this will make it be
	// the delimiter as a safe guard
	public static String[] requestStringValues(String question) {

		return requestStringValues(question, ",");
	}

	public static float requestFloatValue(String question) {
		float floatValue = 0;
		String input;
		while (true) {
			try {
				System.out.println(question);
				input = scanner.nextLine();
				floatValue = Float.parseFloat(input);
				return floatValue;
			} catch (NumberFormatException e) {
				question = "Please select a valid float number";
				continue;
			}
		}
	}
}
