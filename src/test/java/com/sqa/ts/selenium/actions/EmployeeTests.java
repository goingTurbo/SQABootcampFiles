
package com.sqa.ts.selenium.actions;

import org.testng.annotations.Test;

import com.sqa.employees.AbstractPerson;
import com.sqa.employees.ScienceTeacher;
import com.sqa.employees.Teacher;
import com.sqa.employees.VolleyballCoach;

/**
 * EmployeeTests //ADDD (description of class)
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
public class EmployeeTests {

	@Test
	@Ignore
	public void test() {
		Employee employee = new Employee(); // An employee object is being
											// created here.
		System.out.println("Your employee object details: " + employee);

		Employee teacher = new Teacher();
		System.out.println("Your teacher object details are: " + teacher);
	}

	@Ignore
	@Test
	public void test2() {
		Employee teacher = new Teacher();
		System.out.println("Your teacher object details are: " + teacher);
	}

	@Test
	@Ignore
	public void test3() {
		boolean isHappy = AbstractPerson.requestBooleanValue("Are you happy?");
		if (isHappy) {
			System.out.println("Cool");
		} else {
			System.out.println("Cheer up");
		}
	}

	@Test
	@Ignore
	public void test4() {
		Employee teacher = new ScienceTeacher();
		System.out.println("Your science teacher object details are: " + teacher);
		// when this is executed 'teacher' is being executed like
		// teacher.toString(). Both are identical.
	}

	@Test
	public void test5() {
		Employee coach = new VolleyballCoach();
		System.out.println("Here are the object details of the Volleyball Coach: " + coach);
	}

}
