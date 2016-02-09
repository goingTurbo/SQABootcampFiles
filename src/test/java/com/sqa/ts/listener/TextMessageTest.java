package com.sqa.ts.listener;

import static org.junit.Assert.*;
import org.junit.Test;

public class TextMessageTest {
	private final String MESSAGE_TO_TEST = "Hello world";
	
	@Test
	public void testMessage(){
		assertEquals(MESSAGE_TO_TEST, "Hello world");
	}

}
