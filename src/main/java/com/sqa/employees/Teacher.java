
package com.sqa.employees;

import java.util.ArrayList;
import java.util.List;

/**
 * Teacher //ADDD (description of class)
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
public class Teacher extends Employee {

	private String subject;
	private boolean hasAssistant;
	private List<String> specificSubjects;

	/**
	 * Default Constructor
	 */
	public Teacher() {
		// TODO Auto-generated constructor stub
	}

	public enum Subjects { // this has to be capitalized for enum, it's good
							// practice.
		MATH, MUSIC, ENGLISH, SCIENCE
	}

	public enum SpecificSubjects {
		CHEMISTRY, BIOLOGY, PHYSICS, MOLECULAR, ORCHESTRA, BAND, CHORUS, JAZZ
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
	 */
	public Teacher(String name, int age, String address, int empId, String empType, String subject,
			boolean hasAssistant, List<String> specificSubjects) {
		super(name, age, address, empId, empType);
		this.subject = subject;
		this.hasAssistant = hasAssistant;
		this.specificSubjects = specificSubjects;
	}

	/**
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return super.toString() + "subject=" + subject + ", hasAssistant=" + hasAssistant + ", specificSubjects="
				+ specificSubjects + " ";
	}

	@Override
	public void requestValues() {
		super.requestValues();

		boolean contains = false;
		while (!contains) { // which means true, list is empty
			System.out.println("Which subject does the teacher teach?");
			System.out.print("[ ");
			// This prints out the options for user
			for (Subjects s : Subjects.values()) {
				System.out.print(s + " ");
			}
			System.out.println("]");
			String input = scanner.nextLine();

			// this will check all options in 'Subjects' and if
			// it finds one, contain will go to true
			for (Subjects s : Subjects.values()) {
				if (input.equalsIgnoreCase(s.toString())) {
					contains = true;
				}
			}
			// if the 'for' loop above doesn't find it, this will
			// be executed.
			if (!contains) {
				System.out.println("Put in the classes.");
			} else {
				this.setSubject(input.toUpperCase());
			}
		}

		contains = false; // after the first one is done, it doesn't matter
							// that we declare it back to false here.
		ArrayList<SpecificSubjects> specificSubjects = new ArrayList<SpecificSubjects>();

		while (!contains) { // which means true, list is empty
			System.out.println(
					"Does one of the specific subjects" + this.getName() + " teaches include any of the following?");
			System.out.print("[ ");
			// This prints out the options for user
			for (SpecificSubjects s : SpecificSubjects.values()) {
				System.out.print(s + " ");
			}
			System.out.println("]");
			String input = scanner.nextLine();

			// this will check all options in 'Subjects' and if
			// it finds one, contain will go to true
			for (SpecificSubjects s : SpecificSubjects.values()) {
				if (input.equalsIgnoreCase(s.toString())) {
					contains = true;
				}
			}
			// if the 'for' loop above doesn't find it, this will
			// be executed.
			if (!contains) {
				System.out.println("Needs at least one class.");
			} else {
				this.setSubject(input.toUpperCase());
			}
		}

		this.setHasAssistant(requestBooleanValue("Does " + getName() + " have an assistant?"));

	}

	/**
	 * @return the subject
	 */
	public String getSubject() {
		return subject;
	}

	/**
	 * @param subject
	 *            the subject to set
	 */
	public void setSubject(String subject) {
		this.subject = subject;
	}

	/**
	 * @return the hasAssistant
	 */
	public boolean isHasAssistant() {
		return hasAssistant;
	}

	/**
	 * @param hasAssistant
	 *            the hasAssistant to set
	 */
	public void setHasAssistant(boolean hasAssistant) {
		this.hasAssistant = hasAssistant;
	}

	/**
	 * @return the specificSubjects
	 */
	public List<String> getSpecificSubjects() {
		return specificSubjects;
	}

	/**
	 * @param specificSubjects
	 *            the specificSubjects to set
	 */
	public void setSpecificSubjects(List<String> specificSubjects) {
		this.specificSubjects = specificSubjects;
	}

}
