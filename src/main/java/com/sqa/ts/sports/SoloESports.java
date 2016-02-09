package com.sqa.ts.sports;

public class SoloESports extends ESports {

	private boolean requireStick;

	public void juggleOpponent() {
		System.out.println("This opponent is too easy.  Juggling him against the side of the screen will be easy");
	}

	/**
	 * @param requireStick
	 */
	public SoloESports(boolean requireStick) {
		super();
		this.requireStick = requireStick;
	}

}
