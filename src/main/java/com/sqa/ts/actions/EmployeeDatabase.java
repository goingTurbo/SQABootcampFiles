package com.sqa.ts.actions;

import java.util.Scanner;

public class EmployeeDatabase {

	public static String names[];
	public static String addresses[];
	public static int ages[];
	public static String jobTitles[];

	public static String namesNew[];
	public static String addressesNew[];
	public static int agesNew[];
	public static String jobTitlesNew[];

	public static String combinedNames[];
	public static String combinedAddresses[];
	public static int combinedAges[];
	public static String combinedJobTitles[];

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// while (true) {
		// TODO create a while loop for the main question below

		System.out.println("How many employees would you like to enter now?");
		Scanner scanner1 = new Scanner(System.in);
		String size = scanner1.nextLine();

		int arraySize = Integer.parseInt(size);

		String[] names = new String[arraySize];
		String[] addresses = new String[arraySize];
		int[] ages = new int[arraySize];
		String[] jobTitles = new String[arraySize];

		for (int i = 0; i < names.length; i++) {
			System.out.println("Please enter the name of the employee.");
			Scanner nameInput = new Scanner(System.in);
			String name = nameInput.nextLine();
			names[i] = name;

			System.out.println("Please enter the street address of employee.");
			Scanner addressInput = new Scanner(System.in);
			String address = addressInput.nextLine();
			addresses[i] = address;

			System.out.println("Please enter the age of the employee.");
			Scanner ageInput = new Scanner(System.in);
			String age = ageInput.nextLine();
			int employeeAge;
			try {
				employeeAge = Integer.parseInt(age);
			} catch (NumberFormatException e) {
				System.out.println("It needs to be a number for the age, let's try this from the beginning.");
				i--; // this makes sure that the loop starts over on the same
						// placement in the array
				continue; // this begins the restart of the loop
			}
			ages[i] = employeeAge;

			System.out.println("Please enter the job title of the employee.");
			Scanner jobInput = new Scanner(System.in);
			String job = jobInput.nextLine();
			jobTitles[i] = job;
		}
		while (true) {
			System.out.println(
					"What would you like to do next? ADD MORE employees, SEE LIST of current employees or EXIT out of the program?");
			Scanner choiceInput = new Scanner(System.in);
			String choice = choiceInput.nextLine();

			if ("SEE LIST".equals(choice.toUpperCase())) {
				for (int i = 0; i < names.length; i++) {
					System.out.println(names[i]);
					System.out.println(addresses[i]);
					System.out.println(ages[i]);
					System.out.println(jobTitles[i]);
					System.out.println(" ");
				}
				return;
			} else if ("ADD MORE".equals(choice.toUpperCase())) {
				System.out.println("How many employees would you like to enter now?");
				Scanner scanner2 = new Scanner(System.in);
				String size2 = scanner2.nextLine();

				int arraySize2 = Integer.parseInt(size2);

				String[] namesNew = new String[arraySize2];
				String[] addressesNew = new String[arraySize2];
				int[] agesNew = new int[arraySize2];
				String[] jobTitlesNew = new String[arraySize2];

				for (int i = 0; i < namesNew.length; i++) {
					System.out.println("Please enter the name of the employee.");
					Scanner nameInput = new Scanner(System.in);
					String name = nameInput.nextLine();
					namesNew[i] = name;

					System.out.println("Please enter the street address of employee.");
					Scanner addressInput = new Scanner(System.in);
					String address = addressInput.nextLine();
					addressesNew[i] = address;

					System.out.println("Please enter the age of the employee.");
					Scanner ageInput = new Scanner(System.in);
					String age = ageInput.nextLine();
					int employeeAge;
					try {
						employeeAge = Integer.parseInt(age);
					} catch (NumberFormatException e) {
						System.out.println("It needs to be a number for the age, let's try this from the beginning.");
						i--; // this makes sure that the loop starts over on the
								// same placement in the array
						continue; // this begins the restart of the loop
					}
					agesNew[i] = employeeAge;

					System.out.println("Please enter the job title of the employee.");
					Scanner jobInput = new Scanner(System.in);
					String job = jobInput.nextLine();
					jobTitlesNew[i] = job;
				}
				// TODO Change program to add and print list here
				String[] combinedNames = new String[(names.length + namesNew.length)];
				String[] combinedAddresses = new String[(names.length + namesNew.length)];
				int[] combinedAges = new int[(names.length + namesNew.length)];
				String[] combinedJobTitles = new String[(names.length + namesNew.length)];

				for (int i = 0; i < combinedNames.length; i++) {
					combinedNames[i] = names[i];
					combinedAddresses[i] = addresses[i];
					combinedAges[i] = ages[i];
					combinedJobTitles[i] = jobTitles[i];

					// combinedNames[(i + names.length)] = names[i];
					// combinedAddresses[(i + names.length)] = addresses[i];
					// combinedAges[(i + names.length)] = ages[i];
					// combinedJobTitles[(i + names.length)] = jobTitles[i];
				}
				System.out.println("Here is the updated list with the new Employees:");
				for (int i = 0; i < combinedNames.length; i++) {
					System.out.println(combinedNames);
					System.out.println(combinedAddresses);
					System.out.println(combinedAges);
					System.out.println(combinedJobTitles);
					System.out.println(" ");
				}
				System.out.println("Thank you for using the program.  Good Bye!");
				System.exit(0);

			} else if ("EXIT".equals(choice.toUpperCase())) {
				System.out.println("Thank you for using the Employee DB System.  Good Bye!");
				System.exit(0);
			} else {
				System.out.println("You didn't enter a valid option");
				return;
			}
		}
		// }
	}

}
