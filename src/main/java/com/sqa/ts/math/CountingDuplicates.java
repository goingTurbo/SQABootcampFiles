
package com.sqa.ts.math;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

/**
 * CountingDuplicates //ADDD (description of class)
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
public class CountingDuplicates {

	public static List<Integer> randomNums() {
		List<Integer> nums = new ArrayList<>();
		for (int i = 1; i < 101; i++) {
			nums.add((int) (Math.random() * 100 + 1));
		}
		return nums;
	}

	public static void main(String[] args) {
		List<Integer> randomNumbers = randomNums();
		System.out.println("Numbers: " + randomNumbers);
		TreeMap<Integer, Integer> duplicates = new TreeMap<>();
		// This will just count how many times a certain number appears, even if
		// it's just once
		for (int i : randomNumbers) {
			int count = duplicates.get(i) == null ? 1 : duplicates.get(i) + 1;
			duplicates.put(i, count);
		}
		ArrayList<Integer> removals = new ArrayList<Integer>();
		// This will get rid of the #'s that only appear once considering that
		// they are not duplicated
		for (int i : duplicates.keySet()) {
			if (duplicates.get(i) == 1) {
				removals.add(i);
			}
		}
		// The reason we needed to needed 2 lists is because we could not simply
		// remove the data without
		// an error occurring. We can however, reference what needs to be
		// removed from an list by taking a list of
		// what needs to be removed
		for (int i : removals) {
			duplicates.remove(i);
		}

		System.out.println("Final collection: " + duplicates);
		System.out.println("Single occurance numbers: " + removals);
	}

}
