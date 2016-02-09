
package com.sqa.employees;

/**
 * BasketballCoach //ADDD (description of class)
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
public class BasketballCoach extends Coach {

	private double basketHeight;

	/**
	 * 
	 */
	public BasketballCoach() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param name
	 * @param age
	 * @param address
	 * @param empId
	 * @param empType
	 */
	public BasketballCoach(String name, int age, String address, int empId, String empType) {
		super(name, age, address, empId, empType);
		this.basketHeight = basketHeight;
	}

	/**
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return super.toString() + "basketHeight=" + basketHeight + " ";
	}

	@Override
	public void requestValues() {
		super.requestValues();
		System.out.print("What is the height of the basket: ");
		this.setBasketHeight(Double.parseDouble(scanner.nextLine()));
	}

	/**
	 * @return the basketHeight
	 */
	public double getBasketHeight() {
		return basketHeight;
	}

	/**
	 * @param basketHeight
	 *            the basketHeight to set
	 */
	public void setBasketHeight(double basketHeight) {
		this.basketHeight = basketHeight;
	}

}
