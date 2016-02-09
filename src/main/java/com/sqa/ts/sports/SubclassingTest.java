
package com.sqa.ts.sports;

import org.testng.annotations.Test;

/**
 * SubclassingTest //ADDD (description of class)
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
public class SubclassingTest {

	/**
	 * Test method for {@link com.sqa.ts.sports.Person#calcAgeInDogYears()}.
	 */
	@Test
	public void testSubClasses() {
		Person p1 = new Person();
		Person p2 = new Person("jf");
		System.out.println("Creating a test!");
		System.out.println("Person 1: " + p1);
		System.out.println("Person 2: " + p2);
		Employee e1 = new Employee("emp101", "sales clerk", 30000);
		System.out.println("Employee 1:" + e1);
		Employee e2 = new Employee("0923423", 30, false, "John Stark", "sdfgfd", "Rockstar", 1230909);
		System.out.println("Employee 2:" + e2);
	}

}
