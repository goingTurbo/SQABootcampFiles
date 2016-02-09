
package com.sqa.ts.actions;

import java.util.Set;
import java.util.TreeSet;

/**
 * MediaManager A Media Manger Software. This software collects media for a
 * video rental store.
 * <p>
 * The software contains a String[] array to represent the names of all the
 * items the user wants to rent. This array should be converted to a valid
 * collection type to satisfy user requirements: > Optimal performance while
 * satisfying requirements > The media collection can not have any duplicates as
 * it would not makes sense to rent any of the same two items. All media should
 * be kept in natural order based on the name of the media.
 * <p>
 * There are methods to add, remove, and display collection
 * 
 * @author LastName, FirstName
 * @version 1.0.0
 * @since 1.0
 *
 */

/******************************************* TreeSet **************************************/

public class MediaManager {

	// String[] media = { "LAPTOP0217", "LAMPO3982", "CANDY3984", "JAVA9083",
	// "SQASOL9845", "VACAT9845" };

	private Set<String> mediaType;

	/**
	 * Here is a basic test or application logic that should be performed on the
	 * collection
	 */
	public static void main(String[] gs) {
		// Create Simulation instance
		MediaManager mediaManager = new MediaManager();
		// Add few elements to the collection
		mediaManager.addElement("MEDIC2541");
		// Display Elements
		mediaManager.displayElements();
		// Remove few elements to the collection
		mediaManager.removeElement("MEDIC2541");
		// Use a static method version to view elements
		displayElements(mediaManager);
	}

	/**
	 * A static method to display a elements
	 * 
	 * @param mediaManager
	 *            MediaManager instance to work with
	 */
	public static void displayElements(MediaManager mediaManager) {
		// Provide logic to view elements in collection for TrendingTags
		// instance
		mediaManager.displayElements();
	}

	/**
	 * An instance method to display all elements
	 */
	private void displayElements() {
		// Provide logic to view elements for instance\
		System.out.println("Here are all the current medias: ");
		for (String m : mediaType) {
			System.out.println("\t-" + m);
		}
		System.out.println(" ");
	}

	/**
	 * Default constructor
	 */
	public MediaManager() {
		// Either overload this class or make this default default constructor
		// interactive.
		mediaType = new TreeSet<String>();

		String[] media = { "LAPTOP0217", "LAMPO3982", "CANDY3984", "JAVA9083", "SQASOL9845", "VACAT9845" };

		for (int i = 0; i < media.length; i++) {
			addElement(media[i]);
		}
	}

	/**
	 * Method to add an element
	 */
	public void addElement(String media) {
		// provide logic to add an element
		mediaType.add(media);
	}

	/**
	 * Method to remove an element
	 */
	public void removeElement(String media) {
		// provide logic to remove an element
		mediaType.remove(media);
	}

}
