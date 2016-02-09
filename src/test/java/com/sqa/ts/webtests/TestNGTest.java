package com.sqa.ts.webtests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGTest {
	// group tests that are divible by 3
	// and groups divisible by 2
	@Test(priority = 1)
	public void test1() {
		System.out.println("1 ran");
	}

	@Test(priority = 2)
	public void test2() {
		System.out.println("2 ran");
		Assert.fail("dumber");
	}

	@Test(enabled = true, priority = 3)
	public void test3() {
		System.out.println("3 ran");
		Assert.fail("Dumb");
	}

	@Test(dependsOnMethods = "test3", priority = 4)
	public void test4() {
		System.out.println("4 ran");
	}

	@Test(dependsOnMethods = "test2", alwaysRun = true, priority = 5)
	public void test5() {
		System.out.println("5 ran");
	}

	@Test(enabled = false, priority = 6)
	public void test6() {
		System.out.println("6 ran");
	}

	@Test(priority = 1)
	public void test7() {
		System.out.println("1 ran");
	}

	@Test(priority = 2)
	public void test8() {
		System.out.println("2 ran");
		Assert.fail("dumber");
	}

	@Test(enabled = true, priority = 3)
	public void test9() {
		System.out.println("3 ran");
		Assert.fail("Dumb");
	}

	@Test(dependsOnMethods = "test3", priority = 4)
	public void test10() {
		System.out.println("4 ran");
	}

	@Test(dependsOnMethods = "test2", alwaysRun = true, priority = 5)
	public void test11() {
		System.out.println("5 ran");
	}

	@Test(enabled = false, priority = 6)
	public void test12() {
		System.out.println("6 ran");
	}
}
