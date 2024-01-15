package com.codility.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public final class TriangleTest {
	@Test
	void testTriangularTripletExists() {
		int[] A1 = {10, 2, 5, 1, 8, 20};
		assertEquals(1, new Triangle().solution(A1));

		int[] A2 = {1, 1, 1};
		assertEquals(1, new Triangle().solution(A2));

		int[] A3 = {Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE};
		assertEquals(1, new Triangle().solution(A3));
	}

	@Test
	void testTriangularTripletDoesNotExist() {
		int[] A1 = {10, 50, 5, 1};
		assertEquals(0, new Triangle().solution(A1));

		int[] A2 = {};
		assertEquals(0, new Triangle().solution(A2));

		int[] A3 = {Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE};
		assertEquals(0, new Triangle().solution(A3));
	}

	@Test
	void testEdgeCases() {
		int[] A1 = {0, 0, 0};
		assertEquals(0, new Triangle().solution(A1));

		int[] A2 = {1};
		assertEquals(0, new Triangle().solution(A2));

		int[] A3 = {Integer.MIN_VALUE, Integer.MAX_VALUE, 0};
		assertEquals(0, new Triangle().solution(A3));
	}

	@Test
	void testLargeInput() {
		int[] A = new int[100000];
		for (int i = 0; i < A.length; i++) {
			A[i] = i + 1;
		}
		assertEquals(1, new Triangle().solution(A));
	}

	@Test
	void testNegativeNumbers() {
		int[] A1 = {-1, -2, -3, -4, -5, -6};
		assertEquals(0, new Triangle().solution(A1));

		int[] A2 = {-1, -1, -1};
		assertEquals(1, new Triangle().solution(A2));

		int[] A3 = {Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE};
		assertEquals(0, new Triangle().solution(A3));
	}
}
