
package com.sqa.ts.listener;

import java.util.ArrayList;

import org.testng.annotations.Test;

/**
 * OutOfBoundsExceptionWithAnnotations //ADDD (description of class)
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
public class OutOfBoundsExceptionWithAnnotations {

	@Test(expected = IndexOutOfBoundsException.class)
	public void testOutOfBoundsException() {
		new ArrayList<Object>().get(0);
	}

}
