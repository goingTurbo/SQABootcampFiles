package com.sqa.ts.selenium.actions;

import org.testng.annotations.Test;

public class BeforeAfterTests {

	private int[] numArray = { 3, 7, 1, 8, 11, 5 };

	@Test(priority = 3)
	public void f() {
		System.out.println("PRIORITY LEVEL 3!");
		// for (int i = 0; i < numArray.length; i++) {
		// System.out.println(numArray[i]);
		// }
		// for (int i = 0; i < numArray.length; i++) {
		// Arrays.sort(numArray);
		// }
		// for (int i = 0; i < numArray.length; i++) {
		// System.out.print(numArray[i]);
		// }
		// System.out.println("\n");
	}

	@Test(priority = 1)
	public void test1() {
		System.out.println("PRIORITY LEVEL 1!");
	}

	@Test(priority = 4)
	public void test2() {
		System.out.println("PRIORITY LEVEL 4!");
	}

	@Test(priority = 0)
	public void test3() {
		System.out.println("PRIORITY LEVEL 0!");
	}

	@Test(priority = 2)
	public void test4() {
		System.out.println("PRIORITY LEVEL 2!");
	}

	// @BeforeMethod
	// public void beforeMethod() {
	// System.out.println("This is the 'BEFORE METHOD' annotation.");
	// System.out.println("\n");
	// }
	//
	// @AfterMethod
	// public void afterMethod() {
	// System.out.println("This is the 'AFTER METHOD' annotation.");
	// System.out.println("\n");
	// }
	//
	// @BeforeClass
	// public void beforeClass() {
	// System.out.println("This is the 'BEFORE CLASS' annotation.");
	// System.out.println("\n");
	// }
	//
	// @AfterClass
	// public void afterClass() {
	// System.out.println("This is the 'AFTER CLASS' annotation.");
	// System.out.println("\n");
	// }
	//
	// @BeforeSuite
	// public void beforeSuite() {
	// System.out.println("This is the 'BEFORE SUITE' annotation.");
	// System.out.println("\n");
	// }
	//
	// @AfterSuite
	// public void afterSuite() {
	// System.out.println("This is the 'AFTER SUITE' annotation.");
	// System.out.println("\n");
	// }

}
