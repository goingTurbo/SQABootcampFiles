
package com.sqa.ts.listener;

import org.jboss.netty.util.Timeout;

@RunWith(Suite.class)
@Suite.SuiteClasses({ DBTestOne.class, DBTestTwo.class })

/**
 * DBTestSuite //ADDD (description of class)
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
public class DBTestSuite {

	@ClassRule
	public static Timeout timeout = new Timeout(3000);

}
