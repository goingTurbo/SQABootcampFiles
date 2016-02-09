package com.sqa.employees;

import java.util.Scanner;

/**
 *   File Name: EmployeeEntry.java<br>
 *
 *   LastName, FirstName<br>
 *   Java Boot Camp Exercise<br>
 *   Instructor: Jean-francois Nepton<br>
 *   Created: Sep 23, 2015
 *   
 */

/**
 * EmployeeEntry
 * 
 * Create an application which enters employees into the system. You will need
 * to enter them in sets. The program should ask how many employees they want to
 * enter and than insert them into arrays (String[] names, String[] addresses,
 * String[]/ int[] ages, String[] jobTitles[]). You should use the Scanner
 * class, the method nextLine. Review any of the old applications for help as
 * well as the notes on arrays. The program should ask the user if they would
 * like to exit the system or add a new set of employees (while loop). It than
 * does the same process to create additional employees (The tricky part here is
 * to remember that arrays have a downside of requiring that the size be
 * specified, it will be challenging to add an additional set of employees to
 * the array *You must create a new array that contains all elements from both
 * previous execution and past execution). If the user decides to exit the
 * system, you should display all employees in the system and than exit.
 * 
 * *****************************************************************************
 * 
 * Modify the EmployeeEntry class which can be found on dropbox. You should
 * handle when user enters a letter instead of a number. You should also change
 * the code to use an ArrayList<Employee> employees collection type instead of
 * String[ ] names, ages, addresses, and jobTitles. Also create subclasses of
 * Person>Employee>*>* based on when the user asks their jobTitle, create the
 * correct subclass and store it in the collection. Try to do two levels deeper
 * than Employee, such as Person>Employee>Janitor>BathroomJanitor,
 * OutdoorJanitor. Good Luck and let me know if you have any questions!
 * 
 * 
 * @author Nepton, Jean-francois
 * @version 1.0.0
 * @since 1.0
 *
 */
public class EmployeeEntry {

	// Create member variables to store data which persists for duration of
	// application (default initialization to default values)
	private static String[] addresses;
	private static String[] ages;
	private static String[] jobTitles;
	private static String[] names;

	// Create variables to hold new values
	private static String[] newAddresses;
	private static String[] newAges;
	private static String[] newJobTitles;
	private static String[] newNames;

	// Use the Scanner to get user input
	private static Scanner scanner;

	/**
	 * Main method which creates an application type and is main execution point
	 * of program
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// Variable to hold value of running
		boolean running = true;

		// Initialize the scanner object to get input from console window from
		// user
		scanner = new Scanner(System.in);

		// While the application is set to running, ask user to enter employees
		while (running) {
			// Set the variable numOfEmployees to the return value of the
			// function
			// that requests employee count number
			int numOfEmployees = requestEmployeeSetCount();
			// Initialize fields based on the local variable numOfEmployee
			initializeFields(numOfEmployees);
			// Populate fields to store employee information
			populateFields();
			// Create a method with a signature that returns a boolean value, to
			// set running to false if user is finished entering employees into
			// the system

			// Combine old and new arrays based on if the program has any old
			// values stored already
			mergeArrays();

			running = requestToContinue();
		}

		// Display employee info
		displayEmployeeInfo();

		// Clear open resources
		clearOpenResources();

		// Send a message to exit the system
		System.out.println("Thank you for using the employee entry application. Have a nice day!");

	}

	/**
	 * Method to clear system resources of any opened during application
	 * execution
	 */
	private static void clearOpenResources() {
		// Close resources of the Scanner object to avoid memory leakage
		scanner.close();

	}

	/**
	 * Display employee information stored in all arrays
	 */
	private static void displayEmployeeInfo() {
		// Use a for loop to iterate through all elements of the arrays and
		// output all saved employee information
		for (int i = 0; i < names.length; i++) {
			// Output a message containing all details for an employee
			System.out.println("Employee number " + (i + 1) + "'s details are: ");
			System.out.println("\tName:" + names[i]);
			System.out.println("\tAge:" + ages[i]);
			System.out.println("\tAddress:" + addresses[i]);
			System.out.println("\tJob Title:" + jobTitles[i]);
		}
	}

	/**
	 * Initialize fields based on user input for numOfEmployees
	 */
	private static void initializeFields(int numOfEmployees) {
		// Initialize all arrays based on passed value
		newNames = new String[numOfEmployees];
		newAddresses = new String[numOfEmployees];
		newAges = new String[numOfEmployees];
		newJobTitles = new String[numOfEmployees];
	}

	/**
	 * Combine both old and new values for arrays
	 */
	private static void mergeArrays() {
		// Check if names array is null (If null, this is first set of employees
		// entry)
		if (names == null) {
			System.out.println("There ARE NO names already system");
			// Set the values for arrays to the new values entered into the
			// system
			names = newNames;
			ages = newAges;
			addresses = newAddresses;
			jobTitles = newJobTitles;
		} else {
			// Merge both arrays
			System.out.println("There ARE names already in system");
			// Number of both old array length plus new array length, for merged
			// array length
			int numOfEmployees = names.length + newNames.length;

			// Local variables to hold combined array elements
			String[] mergedNames = new String[numOfEmployees];
			String[] mergedAges = new String[numOfEmployees];
			String[] mergedAddresses = new String[numOfEmployees];
			String[] mergedJobTitles = new String[numOfEmployees];

			// Iterate through a for loop to add previous execution elements
			for (int i = 0; i < names.length; i++) {
				// Copy previous values to merge array
				mergedNames[i] = names[i];
				mergedAges[i] = ages[i];
				mergedAddresses[i] = addresses[i];
				mergedJobTitles[i] = jobTitles[i];
			}

			// Iterate through the new elements and add them to the merged array
			for (int i = names.length, j = 0; i < mergedNames.length; i++, j++) {
				// Copy previous values to merge array
				mergedNames[i] = newNames[j];
				mergedAges[i] = newAges[j];
				mergedAddresses[i] = newAddresses[j];
				mergedJobTitles[i] = newJobTitles[j];
			}

			// Set the current arrays equal to the merged values
			names = mergedNames;
			addresses = mergedAddresses;
			ages = mergedAges;
			jobTitles = mergedJobTitles;

		}
	}

	/**
	 * Method to populate fields for employees
	 */
	private static void populateFields() {
		/* Use of Helper methods for getting input */
		// String name = requestStringInfo("What is the employee's name:");
		// System.out.println("Name is " + name);

		// Use a for loop to get all user information and store in arrays
		for (int i = 0; i < newNames.length; i++) {
			// Output a message to get user name, including a number on the
			// current employee number to input
			System.out.print("What is employee number " + (i + 1) + "'s name:");
			// Set the value for the element in the array
			newNames[i] = scanner.nextLine();
			// Output a message to get user name, including a number on the
			// current employee number to input
			System.out.print("What is employee number " + (i + 1) + "'s address:");
			// Set the value for the element in the array
			newAddresses[i] = scanner.nextLine();
			// Output a message to get user name, including a number on the
			// current employee number to input
			System.out.print("What is employee number " + (i + 1) + "'s age:");
			// Set the value for the element in the array
			newAges[i] = scanner.nextLine();
			// Output a message to get user name, including a number on the
			// current employee number to input
			System.out.print("What is employee number " + (i + 1) + "'s job title:");
			// Set the value for the element in the array
			newJobTitles[i] = scanner.nextLine();
		}
	}

	/**
	 * Request number of employees to enter into system and return that number
	 */
	private static int requestEmployeeSetCount() {
		// variable to store the String type variable from user
		String input;
		// variable to store the number of employees converted from input String
		int numOfEmployees;
		// Request the number of employee to add to the system
		System.out.print("How many employees would you like to enter into the system:");
		// Store the result in a input String
		input = scanner.nextLine();
		// Convert the String into a number with ParseInt
		numOfEmployees = Integer.parseInt(input);
		// Return the number of employee that was collected from user
		return numOfEmployees;
	}

	/**
	 * @return boolean whether the applications should still be running based on
	 *         user input
	 */
	private static boolean requestToContinue() {
		// Variable to hold input from user
		String input;
		// Variable to hold value for running
		boolean running;

		// Create an infinite loop which will terminate if user enters a valid
		// option
		while (true) {
			// Ask user if they want to enter more employees
			System.out.print("Would you like to enter more employees into the system (Yes/No)?");
			// Store inside of input variable
			input = scanner.nextLine();
			// Check whether the input is equal to Yes and return true
			if (input.equalsIgnoreCase("Yes") || input.equalsIgnoreCase("Y")) {
				// Set running to true
				running = true;
				// Break out of infinite while loop and return running as true
				break;
				// Check whether the input is equal to No and return false
			} else if (input.equalsIgnoreCase("No") || input.equalsIgnoreCase("N")) {
				// Set running to false
				running = false;
				// Break out of infinite while loop and return running as false
				break;
				// Default case if not a valid option
			} else {
				// Let the user know they did not enter a valid option
				System.out.println("You did not enter a valid option. [" + input + "]");
				// Continue this loop, the user has not entered a valid option
				continue;
			}
		}
		// Return the valid for running
		return running;

	}

	// Helper methods for getting input
	/*
	 * 
	 * private static int requestIntInfo(String msg) { System.out.print(msg);
	 * String input = scanner.nextLine(); int value = Integer.parseInt(input);
	 * return value; }
	 * 
	 * private static String requestStringInfo(String msg) {
	 * System.out.print(msg); String input = scanner.nextLine(); return input; }
	 */

}
