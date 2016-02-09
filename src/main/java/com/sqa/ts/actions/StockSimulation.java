
package com.sqa.ts.actions;

import java.util.Map;
import java.util.TreeMap;

/**
 * StockSimulation A Stock Simulation software. This software shows securities
 * for a stock simulation where securities are trading amongst traders. A
 * Security represents an element which has a value that changes during the
 * simulation.
 * <p>
 * The application contains two String[] fields which should be converted to a
 * valid collection type to satisfy user requirements: > Optimal performance
 * while satisfying requirements > There CAN NOT be more than one Security with
 * the same name > All securities should remain in natural order based on their
 * security name.
 * <p>
 * There are methods you should implement to add, remove, and display collection
 * 
 * @author LastName, FirstName
 * @version 1.0.0
 * @since 1.0
 *
 */

/************************************** TreeMap ****************************************/

public class StockSimulation {

	// String[] securityNames = { "Gold", "Silver", "Iron", "Lead", "Copper",
	// "Iron" };
	// double[] securityValues = { 89.6, 48.39, 24.9, 12.1, 4.0, 24.9 };

	private Map<String, Double> securities;

	/**
	 * Here is a basic test or application logic that should be performed on the
	 * collection
	 */
	public static void main(String[] gs) {
		// Create Simulation instance
		StockSimulation sim = new StockSimulation();
		// Display Elements
		sim.displayElements();
		// Add and remove few elements to the collection
		sim.addElement("Ore", 30.7);
		sim.removeElement("Ore");
		// Use a staic method version to view elements
		displayElements(sim);
	}

	/**
	 * A static method to display a StockSimulation's elements
	 * 
	 * @param sim
	 *            StockSimulation instance to work with
	 */
	public static void displayElements(StockSimulation sim) {
		// Provide logic to view elements in collection for StockSimilation
		// instance
		sim.displayElements();
	}

	/**
	 * An instance method to display a elements
	 */
	private void displayElements() {
		// Provide logic to view elements for instance
		for (String i : securities.keySet()) {
			System.out.println("The security name is " + i + " and the value of it is " + securities.get(i) + ".");
		}
	}

	/**
	 * Default Constructor
	 */
	public StockSimulation() {
		// Either overload this class or make this default default constructor
		// interactive.
		securities = new TreeMap<String, Double>();

		String[] securityNames = { "Gold", "Silver", "Iron", "Lead", "Copper", "Iron" };
		double[] securityValues = { 89.6, 48.39, 24.9, 12.1, 4.0, 24.9 };

		for (int i = 0; i < securityNames.length; i++) {
			addElement(securityNames[i], securityValues[i]);
		}

	}

	/**
	 * Method to add an element
	 */
	public void addElement(String securityName, Double securityValue) {
		// provide logic to add an element
		// for (int i = 0; i < securityNames; i++) {
		securities.put(securityName, securityValue);
		// }
	}

	/**
	 * Method to remove an element
	 */
	public void removeElement(String securityName) {
		// provide logic to remove an element

		securities.remove(securityName);

	}

}
