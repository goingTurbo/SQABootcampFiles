package com.sqa.ts.sports;

public class Employee extends Person {

	private String employeeId;
	private String jobTitle;
	private double salary;

	Employee(String name, int age, boolean hasHair, String birthDate, String employeeId, String jobTitle,
			double salary) {
		super(birthDate, age, hasHair, name);
		this.employeeId = employeeId;
		this.jobTitle = jobTitle;
		this.salary = salary;
	}

	Employee(String employeeId, String jobTitle, double salary) {
		this.employeeId = employeeId;
		this.jobTitle = jobTitle;
		this.salary = salary;
	}

	/**
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		String previous = super.toString();
		return previous + "Employee [employeeId=" + employeeId + ", jobTitle=" + jobTitle + ", salary=" + salary + "]";
	}

}
