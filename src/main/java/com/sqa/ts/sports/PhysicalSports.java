package com.sqa.ts.sports;

public abstract class PhysicalSports extends Sports {

	private boolean requiresSafetyGear;

	public void stretch() {
		System.out.println("All the players are stretching.");
	}

	/**
	 * @param numOfPlayers
	 * @param requiresSafetyGear
	 */
	public PhysicalSports(int numOfPlayers, boolean requiresSafetyGear) {
		super(numOfPlayers);
		this.requiresSafetyGear = requiresSafetyGear;
	}

}
