
package com.sqa.ts.actions;

import java.util.LinkedList;
import java.util.List;

/**
 * TrendingTags A Twitter type software. This software captures popular tags and
 * collects the top ten most popular words.
 * <p>
 * The application contains a String[] array to represent the top words which
 * should be converted to a valid collection type to satisfy user requirements:
 * > Optimal performance while satisfying requirements > The words are entered
 * in insertion order. There CAN BE duplicate words although other logic in
 * application prevents this from happening. Words will be accessed from within
 * the middle of the collection performing a large amount of additions and
 * removals from within the middle of the collection.
 * <p>
 * There are methods to add, remove, and display collection
 * 
 * @author LastName, FirstName
 * @version 1.0.0
 * @since 1.0
 *
 */

/******************************************
 * Linked List
 ***************************************/

public class TrendingTags {

	// String[] words = { "Money", "SQA", "Solutions", "Java", "Learn",
	// "Collections" };

	private List<String> popTags;

	/**
	 * Here is a basic test or application logic that should be performed on the
	 * collection
	 */
	public static void main(String[] gs) {
		// Create Simulation instance
		TrendingTags tags = new TrendingTags();
		// Add few elements to the collection
		tags.addElement("Testing");
		// Display Elements
		tags.displayElements();
		// Remove few elements to the collection
		tags.removeElement("Testing");
		// Use a static method version to view elements
		displayElements(tags);
	}

	/**
	 * A static method to display a TrendingTags's elements
	 * 
	 * @param tags
	 *            TrendingTags instance to work with
	 */
	public static void displayElements(TrendingTags tags) {
		// Provide logic to view elements in collection for TrendingTags
		// instance
		tags.displayElements();
	}

	/**
	 * An instance method to display elements
	 */
	private void displayElements() {
		// Provide logic to view elements for instance
		int j = 1;
		for (String i : popTags) {
			System.out
					.println("The following are the popular tags on Twitter right now: " + i + " and is in spot #" + j);
			j++;
		}
	}

	/**
	 * Default Constructor
	 */
	public TrendingTags() {
		// Either overload this class or make this default default constructor
		// interactive.
		popTags = new LinkedList<String>();

		String[] words = { "Money", "SQA", "Solutions", "Java", "Learn", "Collections" };

		for (int i = 0; i < words.length; i++) {
			addElement(words[i]);
		}
	}

	/**
	 * Method to add an element
	 */
	public void addElement(String word) {
		// provide logic to add an element
		popTags.add(word);
	}

	/**
	 * Method to remove an element
	 */
	public void removeElement(String word) {
		// provide logic to remove an element
		popTags.remove(word);
	}

}
