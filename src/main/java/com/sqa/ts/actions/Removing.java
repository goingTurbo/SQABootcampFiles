
package com.sqa.ts.actions;

/**
 * Removing //ADDD (description of class)
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
public class Removing {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "kangaroo";
		String output = removeVowelCharacters(input);
		System.out.println("Out:" + output);

	}

	public static String removeVowelCharacters(String input) {
		String result = input.replaceAll("[AEIOUaeiou]", "");
		return result;
	}

}
