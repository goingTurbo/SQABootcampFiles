
package com.sqa.ts.sports;

/**
 * Person //ADDD (description of class)
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
public class Person {

	private String name;
	private int age;
	private boolean hasHair;
	private String birthDate;
	// /**
	// * @param args
	// */
	// public static void main(String[] args) {
	// // TODO Auto-generated method stub
	//

	/**
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() { // without this, it out puts "p1" as
								// package.className@objectID. WITH IT, it will
								// OVERRIDE print it out as seen below (which is
								// the default given)
		return "Person [name=" + name + ", age=" + age + ", hasHair=" + hasHair + ", birthDate=" + birthDate + "]";
	}

	/**
	 * @param name
	 * @param age
	 * @param hasHair
	 * @param birthDate
	 */
	public Person(String name, int age, boolean hasHair, String birthDate) {
		super();
		this.name = name;
		this.age = age;
		this.hasHair = hasHair;
		this.birthDate = birthDate;
	}

	Person() { // default constructor
		this.name = "No Name";
		birthDate = "000000";
		hasHair = true;
		age = 0;
	}

	Person(String name) { // parameterized constructor
		this.name = name;
		birthDate = "000000";
		hasHair = true;
		age = 0;
	}

	public void walk() {
		System.out.println(name + " walking down the street.");
	}

	public void speak() {
		System.out.println(name + "speaks loudly.");
	}

	public void sleep() {
		System.out.println(name + " goes to sleep.");
	}

	public int calcAgeInDogYears() {
		int dAge = age * 7;
		return dAge;
	}

}
