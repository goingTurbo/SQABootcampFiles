package com.sqa.ts.actions;

import java.util.Scanner;

/**
 * MyFunctions Includes functions to signal an application, take passed
 * arguments, and invoke a method to check for month name based on supplied
 * number
 * 
 * @author Nepton, Jean-francois
 * @version 1.0.0
 * @since 1.0
 *
 */
// Program that has a function to print out whether the number
// is greater than 10
public class MyFunctions {

	/**
	 * Core method for an application, must match the signature exactly
	 * 
	 * @param args
	 *            supplied terminal arguments
	 */
	public static void main(String[] args) {
		/*
		// Create a variable and set it to first passed argument
		int passedValue = Integer.parseInt(args[0]);

		// Code to check if the number is greater than 10
		if (passedValue > 10) {
			// Print out relevant message
			System.out.println(passedValue + " - Number is greater than 10");
			// Code to check if the number is less than 10
		} else if (passedValue < 10) {
			// Print out relevant message
			System.out.println(passedValue + " - Number is greater than 10");
			// Or else the number must be equal to 10
		} else {
			// Print out relevant message
			System.out.println(passedValue + " - Number is 10");
		}

		// Code to invoke method that checks for runtime user supplied month
		requestMonthNumber();

	}
*/
		requestAge();

	private static void requestAge() {
		System.out.print("Please state your age:");
		Scanner scanner = new Scanner(System.in);
		String age = scanner.nextLine();
		System.out.println("You are the ripe age of " + age);
	}

	/**
	 * Method which request month number from user and displays month name
	 */
	public static void requestMonthNumber() {
		// Declare variables that will be used in method
		String month;
		String input;
		int number;

		// Create a Scanner object and set it to the variable scanner
		Scanner scanner = new Scanner(System.in);
		// Request that the user supply a number which represents a month
		System.out.print("Please provide a number for a month:");
		// Store the user response in a variable named input
		input = scanner.nextLine();
		// Convert the user provided String into an int type variable
		number = Integer.parseInt(input);
		// Use a switch statement to convert number to a valid month
		switch (number) {
		// Provide a case clause for every supported month option
		case 1:
			// Set month to January
			month = "January";
			// Break out of case selection process to not allow multiple case
			// scenarios
			break;
		case 2:
			month = "February";
			break;
		case 3:
			month = "March";
			break;
		case 4:
			month = "April";
			break;
		case 5:
			month = "May";
			break;
		case 6:
			month = "June";
			break;
		case 7:
			month = "July";
			break;
		case 8:
			month = "August";
			break;
		case 9:
			month = "September";
			break;
		case 10:
			month = "October";
			break;
		case 11:
			month = "November";
			break;
		case 12:
			month = "December";
			break;
		// The default case allows a default option if no case matches
		default:
			// Print error message
			System.out.println("You did not enter a valid month.");
			// Close the scanner object
			scanner.close();
			// Exit the method
			return;
		}
		// Print out standard system output for selected month
		System.out.println("You have entered the number " + number + " which represents the month " + month + ".");
		// Close the scanner object
		scanner.close();
	}
}
