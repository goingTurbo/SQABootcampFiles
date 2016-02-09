
package com.sqa.ts.properties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * PropProject //ADDD (description of class)
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
public class PropProject {

	private String name;
	private int age;
	private String job;
	private String address;
	private String city;

	private Properties props; // this makes it a member of the class

	/**
	 * 
	 */
	public void demoLoad() {
		// TODO Auto-generated method stub
		props = new Properties(); // having this declared inside the method
		// and outside the method will make it so the object will stay around
		// for the duration of the class
		try {
			FileInputStream fis = new FileInputStream("my-properties.prop");
			props.load(fis); // this is where the file is read

			this.setName(props.getProperty("name"));
			this.setAge(Integer.parseInt(props.getProperty("age")));
			this.setJob(props.getProperty("job"));
			this.setAddress(props.getProperty("address"));
			this.setCity(props.getProperty("city"));

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * 
	 */
	public void display() {
		// TODO Auto-generated method stub
		System.out.println(this.props);
	}

	/**
	 * 
	 */
	public void demoSave() {
		// TODO Auto-generated method stub
		props.setProperty("name", this.getName());
		try {
			FileOutputStream fos = new FileOutputStream("saved-properties.prop");
			props.store(fos, "My Properties File: " + this.getName());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	/**
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("PropProject [name=");
		builder.append(name);
		builder.append(", age=");
		builder.append(age);
		builder.append(", job=");
		builder.append(job);
		builder.append(", address=");
		builder.append(address);
		builder.append(", city=");
		builder.append(city);
		builder.append("]");
		return builder.toString();
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age
	 *            the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * @return the job
	 */
	public String getJob() {
		return job;
	}

	/**
	 * @param job
	 *            the job to set
	 */
	public void setJob(String job) {
		this.job = job;
	}

	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address
	 *            the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * @param city
	 *            the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * 
	 */
	public void changeValues() {
		// TODO Auto-generated method stub
		this.setName("Mr. Bananas");
		this.setAge(25);
	}

}
