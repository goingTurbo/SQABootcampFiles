package com.sqa.ts.selenium.actions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class GroupTests {

	@Test(groups = { "Odds", "Group1" })
	public void test1() {
		System.out.println("test 1: Group 1");
	}

	@Test(groups = { "Evens", "Group2" })
	public void test2() {
		System.out.println("test 2: Group 2");
	}

	@Test(groups = { "Odds", "Group3" })
	public void test3() {
		System.out.println("test 3: Group 3");
		Assert.fail();
	}

	@Test(groups = { "Evens", "Group4" })
	public void test4() {
		System.out.println("test 4: Group 4");
	}

	@Test(groups = { "Odds", "Group5" })
	public void test5() {
		System.out.println("test 5: Group 5");
	}

}