package com.sqa.ts.sports;

public abstract class ESports extends Sports {

	private String typeOfSystem;

	public void powerOnSystems() {
		System.out.println("Turning on the " + typeOfSystem + " system.");
	}

	public ESports() {
		super();
	}

	/**
	 * @param numOfPlayers
	 * @param typeOfSystem
	 */
	public ESports(int numOfPlayers, String typeOfSystem) {
		super(numOfPlayers);
		this.typeOfSystem = typeOfSystem;
	}

	@Override
	public void moveBody() {
		super.moveBody();
		System.out.println("The E Player stretching..");
		powerOnSystems();
	}

}
