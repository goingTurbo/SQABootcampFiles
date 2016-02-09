
package com.sqa.ts.listener;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * DBTest1 //ADDD (description of class)
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
public class DBTestOne {

	@Test
	public void testThatTimesOut() throws InterruptedException {
		Thread.sleep(4000);
		System.out.println("This test will is to sleep for 4 seconds");
		Assert.assertTrue(true);
	}

}
