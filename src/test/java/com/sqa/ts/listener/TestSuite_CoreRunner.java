
package com.sqa.ts.listener;

/**
 * TestSuite_CoreRunner //ADDD (description of class)
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
public class TestSuite_CoreRunner {

	public static void main(String[] args) {
		JUnitCore runner = new JUnitCore();
		runner.addListener(new TextListener(System.out));
		runner.run(TextLengthTest.class, TextMessageTest.class);

	}

}
