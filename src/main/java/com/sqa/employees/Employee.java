
package com.sqa.employees;

/**
 * Employee //ADDD (description of class)
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
public class Employee extends AbstractPerson {

	private int empId;
	private String empType;

	/**
	 * @see com.sqa.employees.AbstractPerson#requestValues()
	 */
	@Override
	public void requestValues() {
		System.out.println("What is employee's name: ");
		this.setName(scanner.nextLine());
		System.out.println("What is " + getName() + "'s age: ");
		this.setAge(Integer.parseInt(scanner.nextLine()));
		System.out.println("What is " + getName() + "'s address: ");
		this.setAddress(scanner.nextLine());
		System.out.println("What is there employee ID number: ");
		this.setEmpId(Integer.parseInt(scanner.nextLine()));
		this.setEmpType(this.getClass().getSimpleName().toString()); // this is
		// for when their subclass children call this part
	}

	/**
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return super.toString() + "empId=" + empId + ", empType=" + empType;
	}

	public Employee() {

	}

	/**
	 * @param name
	 * @param age
	 * @param address
	 * @param empId
	 * @param empType
	 */
	// parameterized constructor
	public Employee(String name, int age, String address, int empId, String empType) {
		super(name, age, address); // this part pulls from parent class
		this.empId = empId;
		this.empType = empType;
	}

	/**
	 * @return the empId
	 */
	public int getEmpId() {
		return empId;
	}

	/**
	 * @param empId
	 *            the empId to set
	 */
	public void setEmpId(int empId) {
		this.empId = empId;
	}

	/**
	 * @return the empType
	 */
	public String getEmpType() {
		return empType;
	}

	/**
	 * @param empType
	 *            the empType to set
	 */
	public void setEmpType(String empType) {
		this.empType = empType;
	}

}
