package com.sqa.ts.sports;

public class Sports {

	private int numOfPlayers;

	Sports() {

	}

	public void moveBody() {
		System.out.println("There are " + numOfPlayers + " players moving about");
	}

	/**
	 * @param numOfPlayers
	 */
	public Sports(int numOfPlayers) {
		super();
		this.numOfPlayers = numOfPlayers;
	}

}
