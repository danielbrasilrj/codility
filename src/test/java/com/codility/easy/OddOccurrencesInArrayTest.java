package com.codility.easy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public final class OddOccurrencesInArrayTest {
	@Test
	public void testSingleElementArray() {
		int[] A = {5};
		assertEquals(5, new OddOccurrencesInArray().solution(A));
	}

	@Test
	public void testMultipleElementsWithSingleUnpairedElement() {
		int[] A = {9, 3, 9, 3, 9, 7, 9};
		assertEquals(7, new OddOccurrencesInArray().solution(A));
	}

	@Test
	public void testMultipleElementsWithUnpairedElementInMiddle() {
		int[] A = {9, 3, 9, 7, 9, 7, 9};
		assertEquals(3, new OddOccurrencesInArray().solution(A));
	}

	@Test
	public void testZeroAsUnpairedElement() {
		int[] A = {2, 4, 2, 4, 0, 4, 2};
		assertEquals(0, new OddOccurrencesInArray().solution(A));
	}

	@Test
	public void testUnpairedElementIsMaxValue() {
		int[] A = {1, 2, 3, 4, 5, 6, Integer.MAX_VALUE, 5, 6, 4, 3, 2, 1};
		assertEquals(Integer.MAX_VALUE, new OddOccurrencesInArray().solution(A));
	}

	@Test
	public void testUnpairedElementIsMinValue() {
		int[] A = {1, 2, 3, 4, 5, 6, Integer.MIN_VALUE, 5, 6, 4, 3, 2, 1};
		assertEquals(Integer.MIN_VALUE, new OddOccurrencesInArray().solution(A));
	}

	@Test
	public void testUnpairedElementIsZero() {
		int[] A = {1, 2, 3, 4, 5, 6, 0, 5, 6, 4, 3, 2, 1};
		assertEquals(0, new OddOccurrencesInArray().solution(A));
	}

	@Test
	public void testUnpairedElementIsNegative() {
		int[] A = {1, 2, 3, 4, 5, 6, -8, 5, 6, 4, 3, 2, 1};
		assertEquals(-8, new OddOccurrencesInArray().solution(A));
	}

	@Test
	public void testUnpairedElementIsPositive() {
		int[] A = {1, 2, 3, 4, 5, 6, 8, 5, 6, 4, 3, 2, 1};
		assertEquals(8, new OddOccurrencesInArray().solution(A));
	}
}
