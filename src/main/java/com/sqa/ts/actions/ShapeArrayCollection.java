package com.sqa.ts.actions;

import com.sqa.ts.math.Math;

/**
 * IShape //ADDD (description of class)
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
public class ShapeArrayCollection implements IShape, IClassDemo {

	ShapeArrayCollection() {
		System.out.println("A shape was created");
	}

	private String name;
	private String color;
	private int height;
	private int width;
	private boolean isPolygon;
	private boolean isCircle;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShapeArrayCollection[] shapes = { new ShapeArrayCollection("Square", "Red", 7, 7, false, false),
				new ShapeArrayCollection("Rectangle", "Blue", 7, 5, false, false),
				new ShapeArrayCollection("Circle", "White", 5, 5, false, true),
				new ShapeArrayCollection("Circle", "Green", 10, 10, false, true),
				new ShapeArrayCollection("Polygon", "Purple", 8, 8, true, false), };

		for (ShapeArrayCollection sh : shapes) {
			sh.demoClassActivity();
		}
	}

	/**
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ShapeArrayCollection [name=" + name + ", color=" + color + ", height=" + height + ", width=" + width
				+ ", isPolygon=" + isPolygon + ", isCircle=" + isCircle + "]";
	}

	/**
	 * @param name
	 * @param color
	 * @param height
	 * @param width
	 * @param isPolygon
	 * @param isCircle
	 */
	public ShapeArrayCollection(String name, String color, int height, int width, boolean isPolygon, boolean isCircle) {
		super();
		this.name = name;
		this.color = color;
		this.height = height;
		this.width = width;
		this.isPolygon = isPolygon;
		this.isCircle = isCircle;
	}

	/**
	 * @see IClassDemo#demoClassActivity()
	 */
	@Override
	public void demoClassActivity() {
		// TODO Auto-generated method stub
		System.out.println("The " + getColor() + " " + getName() + " has the following Area and Perimeter:");
		System.out.println("Area: " + calcArea());
		System.out.println("Perimeter: " + calcPerimeter() + "\n");
	}

	/**
	 * @see IShape#getName()
	 */
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	/**
	 * @see IShape#setName(java.lang.String)
	 */
	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub

	}

	/**
	 * @see IShape#getColor()
	 */
	@Override
	public String getColor() {
		// TODO Auto-generated method stub
		return color;
	}

	/**
	 * @see IShape#setColor(java.lang.String)
	 */
	@Override
	public void setColor(String color) {
		// TODO Auto-generated method stub

	}

	/**
	 * @see IShape#getHeight()
	 */
	@Override
	public int getHeight() {
		// TODO Auto-generated method stub
		return height;
	}

	/**
	 * @see IShape#setHeight(int)
	 */
	@Override
	public void setHeight(int height) {
		// TODO Auto-generated method stub

	}

	/**
	 * @see IShape#getWidth()
	 */
	@Override
	public int getWidth() {
		// TODO Auto-generated method stub
		return width;
	}

	/**
	 * @see IShape#setWidth(int)
	 */
	@Override
	public void setWidth(int width) {
		// TODO Auto-generated method stub

	}

	/**
	 * @see IShape#isPolygon()
	 */
	@Override
	public boolean isPolygon() {
		// TODO Auto-generated method stub
		return false;
	}

	/**
	 * @see IShape#isCircle()
	 */
	@Override
	public boolean isCircle() {
		// TODO Auto-generated method stub
		return false;
	}

	/**
	 * @see IShape#calcArea()
	 */
	@Override
	public double calcArea() {
		double total;
		double height = getHeight();
		double width = getWidth();
		if (isCircle == true) {
			total = (Math.PI * (height / 2) * (width) / 2);
		} else if (isPolygon == true) {
			total = (height * height * 6) / (4 * (180 / 6));
		} else {
			total = height * width;
		}
		return total;
	}

	/**
	 * @see IShape#calcPerimeter()
	 */
	@Override
	public double calcPerimeter() {
		double total;
		if (isCircle == true) {
			total = (Math.PI * (getHeight() / 2) * 2);
		} else if (isPolygon == true) {
			total = (getHeight() * 6);
		} else {
			total = (getHeight() * 2) + (getWidth() * 2);
		}
		return total;
	}

}
