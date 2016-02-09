package com.sqa.ts.listener;

import org.junit.Test;
import org.testng.AssertJUnit;

public class TextLengthTest {
	private final String TEXT = "blah";

	@Test
	public void testLength() {
		AssertJUnit.assertTrue(TEXT.length() > 0);
	}

}
