package com.sqa.ts.math;

import java.util.Scanner;

/**
 * FibonacciNumber //ADDD (description of class)
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
public class FibonacciNumber {

	private static Scanner scanner;
	private static String input;
	private static String input2;
	private static int term;
	private static int term2;
	private static int result;
	private static int[] result2;
	private static int[] resultArray;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		boolean running = true;
		scanner = new Scanner(System.in);

		while (running) {
			System.out.println("Please provide the number to represent the nth term in the Fibonacci Sequence.");
			input = scanner.nextLine();
			term = Integer.parseInt(input);
			result = fibonacci(term);
			System.out.println(result + " is the " + term + "th term.\n");

			while (true) {
				System.out.println("Would you like to do another number?");
				String choice = scanner.nextLine();
				if (choice.equalsIgnoreCase("Yes") || choice.equalsIgnoreCase("Y")) {
					running = true;
					break;
				} else if (choice.equalsIgnoreCase("No") || choice.equalsIgnoreCase("N")) {
					running = false;
					break;
				} else {
					System.out.println("You didn't answer the question.");
					continue;
				}
			}
			System.out.println("What is the second term that you'd like to choose?");
			input2 = scanner.nextLine();
			term2 = Integer.parseInt(input2);
			result2 = fibonacciToEnd(term, term2);
		}
	}

	/**
	 * @param term3
	 * @param term22
	 */
	private static int[] fibonacciToEnd(int begin, int end) {
		int result;

		for (int i = 2; i < end; i++) {
			result = fibonacci(begin);
			int resultArray[] = new int[end];
			resultArray[i - 2] = result;
		}
		return resultArray;
	}

	/**
	 * This will do the fibonacci calculation
	 */
	public static int fibonacci(int number) {
		if (number == 0) { // if the user choices term 1, return 1
			return 0;
		} else if (number == 1) { // if the user choices term 1, return 1
			return 1;
		} else if (number == 2) { // if user choices term 2, return 1
			return 1;
		} else {
			int fibo1 = 1, fibo2 = 1, fibonacci = 1; // this creates the math
														// for calculating
														// Fibonacci sequence
			for (int i = 2; i < number; i++) {
				fibonacci = fibo1 + fibo2; // calcs what the fibonacci starting
											// from the 3rd sequence
				fibo1 = fibo2; // this sets the fibo1 to the latest number that
								// was used to add to the sequence
				fibo2 = fibonacci; // this sets fibo2 to what has been
									// calculated thus far
			}
			return fibonacci;
		}
	}

}
