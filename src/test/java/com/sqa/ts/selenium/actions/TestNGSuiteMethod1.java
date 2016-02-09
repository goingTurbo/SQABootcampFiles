
package com.sqa.ts.selenium.actions;

import org.testng.TestNG;

/**
 * TestNGSuite //ADDD (description of class)
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
public class TestNGSuiteMethod1 {

	public static void main(String[] args) {
		TestNG testng = new TestNG();
		testng.setTestClasses(new Class[] { AssertTests.class, GroupTests.class, DataProviderTest.class });
		testng.run();
	}
}
