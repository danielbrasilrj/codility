package com.codility.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public final class TapeEquilibriumTest {

	@Test
	void testExampleCase() {
		int[] A = {3, 1, 2, 4, 3};
		assertEquals(1, new TapeEquilibrium2().solution(A));
	}

	@Test
	void testMinimumInputSize() {
		int[] A = {-1000, 1000};
		assertEquals(0, new TapeEquilibrium2().solution(A));
	}

	@Test
	void testAllNegativeNumbers() {
		int[] A = {-3, -1, -2, -4, -3};
		assertEquals(1, new TapeEquilibrium2().solution(A));
	}

	@Test
	void testAllPositiveNumbers() {
		int[] A = {3, 1, 2, 4, 3};
		assertEquals(1, new TapeEquilibrium2().solution(A));
	}

	@Test
	void testEqualPositiveNumbers() {
		int[] A = {5, 5, 5, 5, 5};
		assertEquals(5, new TapeEquilibrium2().solution(A));
	}

	@Test
	void testEqualNegativeNumbers() {
		int[] A = {-5, -5, -5, -5, -5};
		assertEquals(5, new TapeEquilibrium2().solution(A));
	}

	@Test
	void testMixedPositiveAndNegativeNumbers() {
		int[] A = {1, -2, 3, -4, 5};
		assertEquals(1, new TapeEquilibrium2().solution(A));
	}

	@Test
	void testAllZeroes() {
		int[] A = {0, 0, 0, 0, 0};
		assertEquals(0, new TapeEquilibrium2().solution(A));
	}


	@Test
	void testTwoNumbers() {
		int[] A = {2, 7};
		assertEquals(5, new TapeEquilibrium2().solution(A));
	}

	@Test
	void testTwoNumbersWithNegatives() {
		int[] A = {-2, 7};
		assertEquals(9, new TapeEquilibrium2().solution(A));
	}

	@Test
	void testTwoNumbersWithPositives() {
		int[] A = {2, -7};
		assertEquals(9, new TapeEquilibrium2().solution(A));
	}

	@Test
	void testTwoEqualNumbers() {
		int[] A = {4, 4};
		assertEquals(0, new TapeEquilibrium2().solution(A));
	}

	@Test
	void testTwoEqualNegativeNumbers() {
		int[] A = {-4, -4};
		assertEquals(0, new TapeEquilibrium2().solution(A));
	}

	@Test
	void testTwoDifferentNumbers() {
		int[] A = {5, 9};
		assertEquals(4, new TapeEquilibrium2().solution(A));
	}

	@Test
	void testTwoDifferentNegativeNumbers() {
		int[] A = {-5, -9};
		assertEquals(4, new TapeEquilibrium2().solution(A));
	}

	@Test
	void testTwoMixedNumbers() {
		int[] A = {-5, 9};
		assertEquals(14, new TapeEquilibrium2().solution(A));
	}

	@Test
	void testRecursiveArrayWithMixedValues() {
		int[] A = {3, -5, 7, -1, 2, -8, 9, 4, -6, 11, -13, 15, -17, 19, -21, 23, -25, 27, -29, 31};
		assertEquals(0, new TapeEquilibrium2().solution(A));
	}

	@Test
	void testRecursiveArrayWithRepeatedValues() {
		int[] A = {5, -3, 7, -3, 2, 5, -3, 7, -3, 2, 5, -3, 7, -3, 2, 5, -3, 7, -3, 2};
		assertEquals(0, new TapeEquilibrium2().solution(A));
	}

	@Test
	void testRecursiveArrayWithMaxRangeValues() {
		int[] A = {1000, -1000, 1000, -1000, 1000, -1000, 1000, -1000, 1000, -1000, 1000, -1000, 1000, -1000, 1000, -1000, 1000, -1000, 1000, -1000};
		assertEquals(0, new TapeEquilibrium2().solution(A));
	}

	@Test
	void testRecursiveArrayWithAllZeros() {
		int[] A = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		assertEquals(0, new TapeEquilibrium2().solution(A));
	}

	@Test
	void testRecursiveArrayWithSingleMaxValue() {
		int[] A = {1000, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		assertEquals(1000, new TapeEquilibrium2().solution(A));
	}
}
