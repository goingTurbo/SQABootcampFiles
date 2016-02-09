
package com.sqa.ts.actions;

import org.testng.annotations.Test;

/**
 * Listerner //ADDD (description of class)
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
public class Listerner {

	public static void main(string[] args) {
		JUnitCore runner = new JUnitCore();
		runner.addListener(new TestListener(System.out));
		runner.run();
		// insert 2 classes above
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
