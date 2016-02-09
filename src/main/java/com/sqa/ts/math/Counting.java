package com.sqa.ts.math;

/**
 * Counting //ADDD (description of class)
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
public class Counting {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		counting();
		System.out.println("Loading next method. Please wait.");
		for (int i = 1; i <= 3; i++) {
			System.out.println("Loading");
		}
		System.out.println("Begin Even Counting");
		evenCounting();
	}

	// TODO Auto-generated method stub
	public static void counting() {
		for (int i = 1; i <= 100; i++) {
			System.out.println("We have " + i);
		}
	}

	public static void evenCounting() {
		for (int i = 0; i <= 100; i++) {
			if (i % 2 == 0) {
				System.out.println(i + " is an even number");
			}
		}
	}

}
