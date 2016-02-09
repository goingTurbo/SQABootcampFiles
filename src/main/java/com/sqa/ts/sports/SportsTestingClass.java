
package com.sqa.ts.sports;

import org.testng.annotations.Test;

/**
 * SportsTestingClass //ADDD (description of class)
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
public class SportsTestingClass {

	@Test
	public void test() {
		Sports s1 = new Sports(12);
		System.out.println("Sports Class: " + s1);
		PhysicalSports ps1 = new PhysicalSports(10, true);
		System.out.println("Physical Sports Class: " + ps1);
		ESports es1 = new ESports(1, "Playstation 4");
		System.out.println("E-Sports Class: " + es1);
		AggressiveSports ags1 = new AggressiveSports(12, false, "Levi's Stadium");
		System.out.println("Aggressive Sports Class: " + ags1);
		NonAggresiveSports nas1 = new NonAggresiveSports(4, false, true);
		System.out.println("Non-Aggressive Sports Class: " + nas1);
		TeamSports ts1 = new TeamSports("Blue Snakes");
		System.out.println("Team Sports Class: " + ts1);
		SoloESports ses1 = new SoloESports(true);
		System.out.println("Solo E-Sports Class: " + ses1);
	}

}
