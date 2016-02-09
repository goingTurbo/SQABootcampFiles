package com.sqa.ts.sports;

public class AggressiveSports extends PhysicalSports {

	private String teamStadiumName;

	public void run() {
		System.out.println("The " + teamStadiumName + " are running now.");
	}

	/**
	 * @param numOfPlayers
	 * @param requiresSafetyGear
	 * @param teamSportsName
	 */
	public AggressiveSports(int numOfPlayers, boolean requiresSafetyGear, String teamStadiumName) {
		super(numOfPlayers, requiresSafetyGear);
		this.teamStadiumName = teamStadiumName;
	}

}
