
package com.sqa.ts.properties;

import org.testng.annotations.Test;

/**
 * PropertiesTest //ADDD (description of class)
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
public class PropertiesTest {

	@Test
	public void test() {
		PropProject myProject = new PropProject();
		myProject.demoLoad();
		myProject.display();
		myProject.changeValues();
		myProject.demoSave();
	}

}
