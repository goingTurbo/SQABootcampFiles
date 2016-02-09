
package com.sqa.ts.selenium.actions;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import org.testng.annotations.Test;

/**
 * CollectionsTest //ADDD (description of class)
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
public class CollectionsTest {

	@Test
	@Ignore
	public void test() {
		List<String> arrayList = new LinkedList<>();
		arrayList.add("JF");
		arrayList.add("John");
		arrayList.add("Jean");

		for (String s : arrayList) {
			System.out.println(s);
		}
		System.out.println("/**********/");

		arrayList.remove("John");
		arrayList.remove(1);

		for (String s : arrayList) {
			System.out.println(s);
		}
	}

	@Test
	@Ignore
	public void test2() { // This will take it all in and replace anything that
							// is a duplicate. THERE WILL BE NO REPEATS!!!!
		Set<String> set = new TreeSet<>();
		set.add("JF");
		set.add("JN");
		set.add("JP");
		set.add("JTYTF");
		set.add("JN");
		set.add("JP");
		set.add("JDFGF");
		set.add("JN");
		set.add("JP");
		set.add("JGFHF");
		set.add("JN");
		set.add("JP");
		set.add("JF");
		set.add("JWERYN");
		set.add("JP");
		set.add("JF");
		set.add("JLUN");
		set.add("JP");

		for (String s : set) { // This will print everything out. No repeats
								// will be seen because duplicates were replaced
			System.out.println(s);
		}

	}

	@Test
	public void test3() {
		Map<Integer, String> map = new TreeMap<Integer, String>(); // Have to
																	// use class
																	// type in
																	// here. So
																	// that is
																	// why 'int'
																	// wasn't
																	// used, but
																	// Integer
																	// was
		map.put(3, "Florida");
		map.put(2, "Florida");
		map.put(3, "Ohio");
		map.put(4, "Florida");
		map.put(3, "Florida");
		map.put(3, "Florida");
		map.put(5, "New York");
		map.put(3, "Florida");
		map.put(9, "California");
		map.put(3, "Florida");
		map.put(2, "Florida");
		map.put(1, "Ohio");
		map.put(3, "Florida");
		map.put(7, "Florida");
		map.put(6, "Oregon");

		for (Integer i : map.keySet()) {
			System.out.println(i + ": " + map.get(i));
		}
	}

}
