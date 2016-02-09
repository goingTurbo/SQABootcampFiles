
package com.sqa.employees;

/**
 * VolleyballCoach //ADDD (description of class)
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
public class VolleyballCoach extends Coach {

	private boolean beachVolleyball;

	/**
	 * 
	 */
	public VolleyballCoach() {

	}

	/**
	 * @param name
	 * @param age
	 * @param address
	 * @param empId
	 * @param empType
	 */
	public VolleyballCoach(String name, int age, String address, int empId, String empType) {
		super(name, age, address, empId, empType);
		this.beachVolleyball = beachVolleyball;
	}

	/**
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return super.toString() + "beachVolleyball=" + beachVolleyball + "]";
	}

	@Override
	public void requestValues() {
		super.requestValues();
		this.setBeachVolleyball(requestBooleanValue("Is this beach style volleyball?"));
	}

	/**
	 * @return the beachVolleyball
	 */
	public boolean isBeachVolleyball() {
		return beachVolleyball;
	}

	/**
	 * @param beachVolleyball
	 *            the beachVolleyball to set
	 */
	public void setBeachVolleyball(boolean beachVolleyball) {
		this.beachVolleyball = beachVolleyball;
	}

}
