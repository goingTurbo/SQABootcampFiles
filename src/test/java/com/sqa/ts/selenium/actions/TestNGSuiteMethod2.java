package com.sqa.ts.selenium.actions;

import java.util.ArrayList;
import java.util.List;

import org.testng.TestNG;
import org.testng.annotations.Test;

public class TestNGSuiteMethod2 {

	@Test
	public void runTestNGTest() {

		// Create an instance on TestNG
		TestNG myTestNG = new TestNG();
		List<String> file = new ArrayList<String>();
		file.add("\\Users\\Trevor\\workspace\\actions\\AnnotationTestsSuite.xml");
		file.add("\\Users\\Trevor\\workspace\\actions\\GroupsTestSuite.xml");
		myTestNG.setTestSuites(file);
		// invoke ".run()" - this will run your test suites.
		myTestNG.run();
	}
}
