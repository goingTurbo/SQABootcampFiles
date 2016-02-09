package com.sqa.ts.sports;

public class TeamSports extends ESports {

	private String teamName;

	public void talkToTeam() {
		System.out.println("It looks like the " + teamName + " players are talking with one another.");
	}

	/**
	 * @param teamName
	 */
	public TeamSports(String teamName) {
		super();
		this.teamName = teamName;
	}

	public void moveBody() {
		super.moveBody();
		System.out.println("He than move to talk to team..");
		talkToTeam();
	}

}
