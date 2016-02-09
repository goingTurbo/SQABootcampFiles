
package com.sqa.employees;

/**
 * Coach //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 * 
 * @author LastName, FirstName
 * @version 1.0.0
 * @since 1.0
 *
 */
public class Coach extends Employee {

	private String sport;
	private int teamSize;
	private boolean isInside;

	public enum Sports {
		BASKETBALL, VOLLEYBALL, SOCCER, BASEBALL, FOOTBALL
	}

	/**
	 * 
	 */
	public Coach() {

	}

	/**
	 * @param name
	 * @param age
	 * @param address
	 * @param empId
	 * @param empType
	 */
	public Coach(String name, int age, String address, int empId, String empType) {
		super(name, age, address, empId, empType);
		this.sport = sport;
		this.teamSize = teamSize;
		this.isInside = isInside;
	}

	@Override
	public void requestValues() {
		super.requestValues();

		System.out.println("Which sport does the teacher coach?");
		System.out.print("[ ");
		// This prints out the options for user
		for (Sports s : Sports.values()) {
			System.out.print(s + ", ");
		}
		System.out.println("]");
		sport = scanner.nextLine();

		System.out.println("What is " + getName() + "'s team size: ");
		this.setTeamSize(Integer.parseInt(scanner.nextLine()));
		this.setInside(requestBooleanValue("Is " + getSport() + " played inside?"));
	}

	/**
	 * @return the sport
	 */
	public String getSport() {
		return sport;
	}

	/**
	 * @param sport
	 *            the sport to set
	 */
	public void setSport(String sport) {
		this.sport = sport;
	}

	/**
	 * @return the teamSize
	 */
	public int getTeamSize() {
		return teamSize;
	}

	/**
	 * @param teamSize
	 *            the teamSize to set
	 */
	public void setTeamSize(int teamSize) {
		this.teamSize = teamSize;
	}

	/**
	 * @return the isInside
	 */
	public boolean isInside() {
		return isInside;
	}

	/**
	 * @param isInside
	 *            the isInside to set
	 */
	public void setInside(boolean isInside) {
		this.isInside = isInside;
	}

	/**
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return super.toString() + " sport=" + sport + ", teamSize=" + teamSize + ", isInside=" + isInside + " ";
	}

}
