
package com.sqa.ts.math;

/**
 * Circle //ADDD (description of class)
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
public class Circle {

	private double radius;
	private String details;

	public double calcArea() {
		double total = Math.PI * (radius * radius);
		return total;
	}

	public double calcCircumference() {
		double total = Math.PI * (radius / 2) * 2;
		return total;
	}

	public String circleDetails() {
		String circleDetail = details.toString();
		return circleDetail;
	}

	public static double calcArea(double radius) {
		double total = Math.PI * (radius * radius);
		return total;
	}

}
