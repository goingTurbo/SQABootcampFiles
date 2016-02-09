
package com.sqa.ts.actions;

import java.util.HashSet;
import java.util.Set;

/**
 * StudentRoster A Student Roster App. This app collects student IDs for a
 * school attendance system.
 * <p>
 * The app contains a String[] array to represent the id names of all the
 * students in a class room. This array should be converted to a valid
 * collection type to satisfy user requirements: > Optimal performance while
 * satisfying requirements > The student roster collection can not have any
 * duplicates as it would not makes sense to allow any two students to share an
 * id. This collection does not have to be kept in any type of order as the main
 * importance is fast access to the elements in the collection.
 * <p>
 * There are methods to add, remove, and display collection
 * 
 * @author LastName, FirstName
 * @version 1.0.0
 * @since 1.0
 *
 */

/************************************************** HashSet **********************************************/

public class StudentRoster {

	// String[] students = { "JOHND9824", "KIML2794", "LUISM3262", "JENP8319",
	// "JEFFN1092", "DIANER9216" };

	private Set<String> studentIds;

	/**
	 * Here is a basic test or application logic that should be performed on the
	 * collection
	 */
	public static void main(String[] gs) {
		// Create Simulation instance
		StudentRoster sr = new StudentRoster();
		// Add few elements to the collection
		sr.addElement("KATL2943");
		// Display Elements
		sr.displayElements();
		// Remove few elements to the collection
		sr.removeElement("KATL2943");
		// Use a staic method version to view elements
		displayElements(sr);
	}

	/**
	 * A static method to display a elements
	 * 
	 * @param sr
	 *            StudentRoaster instance to work with
	 */
	public static void displayElements(StudentRoster sr) {
		// Provide logic to view elements in collection for TrendingTags
		// instance
		sr.displayElements();
	}

	/**
	 * An instance method to display all elements
	 */
	private void displayElements() {
		// Provide logic to view elements for instance
		System.out.println("Here is a list of the following students: ");
		for (String i : studentIds) {
			System.out.println("\t-" + i);
		}
		System.out.println(" ");
	}

	/**
	 * Default constructor
	 */
	public StudentRoster() {
		// Either overload this class or make this default default constructor
		// interactive.
		studentIds = new HashSet<String>();

		String[] students = { "JOHND9824", "KIML2794", "LUISM3262", "JENP8319", "JEFFN1092", "DIANER9216" };

		for (int i = 0; i < students.length; i++) {
			addElement(students[i]);
		}
	}

	/**
	 * Method to add an element
	 */
	public void addElement(String student) {
		// provide logic to add an element
		studentIds.add(student);
	}

	/**
	 * Method to remove an element
	 */
	public void removeElement(String student) {
		// provide logic to remove an element
		studentIds.remove(student);
	}

}
