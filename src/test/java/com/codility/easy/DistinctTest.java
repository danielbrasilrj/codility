package com.codility.easy;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public final class DistinctTest {

	@Test
	void testEmptyArray() {
		int[] A = {};
		assertEquals(0, new Distinct().solution(A));
	}

	@Test
	void testSingleElementArray() {
		int[] A = {5};
		assertEquals(1, new Distinct().solution(A));
	}

	@Test
	void testArrayWithAllEqualElements() {
		int[] A = {4, 4, 4, 4, 4};
		assertEquals(1, new Distinct().solution(A));
	}

	@Test
	void testArrayWithAllDistinctElements() {
		int[] A = {6, 3, 8, 1, 5};
		assertEquals(5, new Distinct().solution(A));
	}

	@Test
	void testArrayWithNegativeElements() {
		int[] A = {-2, -3, -2, -5, -3};
		assertEquals(3, new Distinct().solution(A));
	}

	@Test
	void testArrayWithZero() {
		int[] A = {0, 0, 0, 0, 0};
		assertEquals(1, new Distinct().solution(A));
	}

	@Test
	void testArrayWithMixedPositiveAndNegativeElements() {
		int[] A = {-2, 1, 0, -5, 1};
		assertEquals(4, new Distinct().solution(A));
	}

	@Test
	void testArrayWithLargeNumberOfElements() {
		int[] A = new int[100000];
		assertEquals(1, new Distinct().solution(A));
	}

	@Test
	void testArrayWithLargeNumberOfDistinctElements() {
		int[] A = new int[100000];
		for (int i = 0; i < 100000; i++) {
			A[i] = i;
		}
		assertEquals(100000, new Distinct().solution(A));
	}

	@Test
	void testArrayWithLargeNumberOfRepeatedElements() {
		int[] A = new int[100000];
		for (int i = 0; i < 100000; i++) {
			A[i] = 5;
		}
		assertEquals(1, new Distinct().solution(A));
	}

	@Test
	void testArrayWithMinAndMaxValues() {
		int[] A = {-1000000, 1000000, -1000000, 1000000};
		assertEquals(2, new Distinct().solution(A));
	}
}
