
package com.sqa.employees;

import java.util.Scanner;

/**
 * AbstractPerson //ADDD (description of class)
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
public abstract class AbstractPerson {

	protected static Scanner scanner = new Scanner(System.in); // to let any
																// child
	// class or other
	// packages to use this
	// use the 'protected'
	// access modifier.
	// If scanner was private here, the child class would not be able to see the
	// variable 'scanner'.
	private String name;
	private int age;
	private String address;

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

	// default constructor - the usual default values we would put in for
	// the class variables aren't being put in because we want the method
	// inside to call the method when it's at a lower subclass level.
	public AbstractPerson() {
		requestValues();
	}

	/**
	 * @param name
	 * @param age
	 * @param address
	 */
	// parameterized constructor - this is created via the 'Source' submenu
	public AbstractPerson(String name, int age, String address) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
	}

	public abstract void requestValues(); // this will be overridden in the
											// subclass Employee

	/**
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "name=" + name + ", age=" + age + ", address=" + address + " ";
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age
	 *            the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address
	 *            the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

}
