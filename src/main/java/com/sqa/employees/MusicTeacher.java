
package com.sqa.employees;

import java.util.ArrayList;
import java.util.List;

/**
 * MusicTeacher //ADDD (description of class)
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
public class MusicTeacher extends Teacher {

	private List<String> instrument;

	public enum Instruments {
		PIANO, VIOLIN, CELLO, DRUMS, GUITAR
	}

	@Override
	public void requestValues() {
		super.requestValues();

		boolean contains = false;

		contains = false; // after the first one is done, it doesn't matter
		// that we declare it back to false here.
		ArrayList<Instruments> instrument = new ArrayList<Instruments>();

		while (!contains) { // which means true, list is empty
			System.out.println("What specific instrument(s) does " + this.getName() + " teach with in his class?");
			System.out.print("[ ");
			// This prints out the options for user
			for (Instruments s : Instruments.values()) {
				System.out.print(s + " ");
			}
			System.out.println("]");
			String input = scanner.nextLine();

			// this will check all options in 'Subjects' and if
			// it finds one, contain will go to true
			for (Instruments s : Instruments.values()) {
				if (input.equalsIgnoreCase(s.toString())) {
					contains = true;
				}
			}
			// if the 'for' loop above doesn't find it, this will
			// be executed.
			if (!contains) {
				System.out.println("Needs at least one instrument.");
			} else {

			}
		}
	}

	/**
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return super.toString() + "instrument=" + instrument + " ";
	}

	/**
	 * 
	 */
	public MusicTeacher() {

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
	public MusicTeacher(String name, int age, String address, int empId, String empType, String subject,
			boolean hasAssistant, List<String> specificSubjects) {
		super(name, age, address, empId, empType, subject, hasAssistant, specificSubjects);
		this.instrument = instrument;
	}

	/**
	 * @return the instrument
	 */
	public List<String> getInstrument() {
		return instrument;
	}

	/**
	 * @param instrument
	 *            the instrument to set
	 */
	public void setInstrument(List<String> instrument) {
		this.instrument = instrument;
	}

}
