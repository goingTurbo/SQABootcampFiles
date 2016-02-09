package com.sqa.ts.sports;

public class NonAggresiveSports extends PhysicalSports {

	private boolean requiresHighIntelligence;

	public void think() {
		System.out.println("Planning out my next moves.");
	}

	/**
	 * @param numOfPlayers
	 * @param requiresSafetyGear
	 * @param requiresHighIntelligence
	 */
	public NonAggresiveSports(int numOfPlayers, boolean requiresSafetyGear, boolean requiresHighIntelligence) {
		super(numOfPlayers, requiresSafetyGear);
		this.requiresHighIntelligence = requiresHighIntelligence;
	}

}
