
package com.sqa.employees;

import java.util.List;

/**
 * ScienceTeacher //ADDD (description of class)
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
public class ScienceTeacher extends Teacher {

	private boolean hasLab;

	@Override
	public void requestValues() {
		super.requestValues();
		this.setHasLab(requestBooleanValue("Does " + getName() + " have a lab?"));
	}

	public ScienceTeacher() {

	}

	/**
	 * @param name
	 * @param age
	 * @param address
	 * @param empId
	 * @param empType
	 * @param subject
	 * @param hasAssistant
	 * @param specificSubjects
	 * @param hasLab
	 */
	public ScienceTeacher(String name, int age, String address, int empId, String empType, String subject,
			boolean hasAssistant, List<String> specificSubjects, boolean hasLab) {
		super(name, age, address, empId, empType, subject, hasAssistant, specificSubjects);
		this.hasLab = hasLab;
	}

	/**
	 * @return the hasLab
	 */
	public boolean isHasLab() {
		return hasLab;
	}

	/**
	 * @param hasLab
	 *            the hasLab to set
	 */
	public void setHasLab(boolean hasLab) {
		this.hasLab = hasLab;
	}

	/**
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return super.toString() + "hasLab=" + hasLab + " ";

	}
}
