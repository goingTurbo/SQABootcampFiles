package com.sqa.ts.selenium.actions;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class OddTests {

	@DataProvider(name = "EvenOdd Numbers")
	public static Object[][] dataSet1() {
		Object[][] data = new Object[][] { { 2, true }, { 3, false }, { 0, true }, { 22, true }, { -4, true },
				{ -100234, true }, { 8009, false }, { 534, true }, { -6500, true } };
		return data;
	}

	@Test
	public void f() {
	}
}
