package com.sqa.ts.webtests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.util.Strings;

public class Asserts {

	@DataProvider(name = "EvenOdd Numbers")
	public static Object[][] dataSet1() {
		Object[][] data = new Object[][] { { 2, true }, { 3, false }, { 0, true }, { 22, true }, { -4, true },
				{ -100234, true }, { 8009, false }, { 534, true }, { -6500, true } };
		return data;
	}

	@DataProvider(name = "Math")
	public static Object[][] dataSet2() {
		Object[][] data = new Object[][] { { 2, 2, 4 }, { 3, 4, 55 }, { 3, 3, 9 }, { 22, 1, 22 }, { -4, 4, -16 },
				{ 4, 5, 21 }, { 5, 5, 25 }, { 7, 7, 49 }, { 0, 4, 4 } };
		return data;
	}

	@DataProvider(name = "Vowels")
	public static Object[][] dataSet3() {
		Object[][] data = new Object[][] { { "frog", "frg" }, { "cat", "cat" }, { "doug", "dg" }, { "FRANCE", "FRNC" },
				{ "roll", "rll" }, { "extreme", "xtrem" }, { "DOG", "DG" }, { "watermelon", "wtrmln" },
				{ "banana", "bann" } };
		return data;
	}

	@DataProvider(name = "Reverse")
	public static Object[][] dataSet4() {
		Object[][] data = new Object[][] { { "frog", "gorf" }, { "cat", "tac" }, { "doug", "doug" },
				{ "FRANCE", "ECNARF" }, { "roll", "llor" }, { "extreme", "emertxe" }, { "DOG", "DOG" },
				{ "watermelon", "nolemretaw" }, { "banana", "gnanab" } };
		return data;
	}

	@DataProvider(name = "Sorting")
	public static Object[][] dataSet5() {
		Object[][] data = new Object[][] { { 3, 1, 5 }, { 21, 23, 1 }, { 4, 3, 4 }, { 1, 2, 3 }, { 11, 14, 2 },
				{ 7, 8, 6 }, { 5, 5, 25 }, { 7, 5, 49 }, { 0, 4, -1 } };
		return data;
	}

	@Test
	public void testEvenTS(int number, boolean expResult) {
		boolean isEven = com.sqa.ts.help.math.EvenOdd.numberIsEven(number);
		if (expResult == true) {
			Assert.assertTrue(isEven);
		} else if (expResult == false) {
			Assert.assertFalse(isEven);
		}
	}

	@Test
	public void testOddTS(int number, boolean expResult) {
		boolean isOdd = com.sqa.ts.help.math.EvenOdd.numberIsOdd(number);
		if (expResult == true) {
			Assert.assertTrue(isOdd);
		} else if (expResult == false) {
			Assert.assertFalse(isOdd);
		}
	}

	@Test
	public void testMultiplyTS(double operand1, double operand2, double expResult) {
		double total = com.sqa.ts.help.math.Calculations.multNumber(operand1, operand2);
		Assert.assertEquals(total, expResult);
	}

	@Test
	public void testDivideTS(double operand1, double operand2, double expResult) {
		double total = com.sqa.ts.help.math.Calculations.divideNumber(operand1, operand2);
		Assert.assertEquals(total, expResult);
	}

	@Test
	public void testRemoveVowelsTS(String fullWord, String shortenWord) {
		String editedWord = com.sqa.ts.help.strings.Removing.removeVowelCharacters(fullWord);
		Assert.assertEquals(editedWord, shortenWord);
	}

	@Test
	public void testReverseWordsTS(String forwardWord, String reverseWord) {
		String editedWord = com.sqa.ts.help.strings.Reversing.reverseLetters(forwardWord);
		Assert.assertEquals(editedWord, reverseWord);
	}

	public void testSortingTS(String[] element){
		String[] originalArra = {"cat", "ape", "dog"};
		Strings[] sortedArray = com.sqa.ts.help.arrays.Sorting.sortElements(originalArra);
		Assert.notsame (ori, sor})
	}
}
