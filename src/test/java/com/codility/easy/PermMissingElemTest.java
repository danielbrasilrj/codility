package com.codility.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public final class PermMissingElemTest {

	@Test
	void testMissingElementAtFirstPosition() {
		int[] A = {2, 3, 4, 5};
		assertEquals(1, new PermMissingElem().solution(A));
	}

	@Test
	void testMissingElementAtLastPosition() {
		int[] A = {1, 2, 3, 4};
		assertEquals(5, new PermMissingElem().solution(A));
	}

	@Test
	void testMissingElementInMiddle() {
		int[] A = {1, 2, 4, 5};
		assertEquals(3, new PermMissingElem().solution(A));
	}

	@Test
	void testEmptyArray() {
		int[] A = {};
		assertEquals(1, new PermMissingElem().solution(A));
	}

	@Test
	void testArrayWithOneElement() {
		int[] A = {2};
		assertEquals(1, new PermMissingElem().solution(A));
	}

	@Test
	void testArrayWithTwoElements() {
		int[] A = {1, 2};
		assertEquals(3, new PermMissingElem().solution(A));
	}

	@Test
	void testArrayWithThreeElements() {
		int[] A = {1, 3, 4};
		assertEquals(2, new PermMissingElem().solution(A));
	}

	@Test
	void testArrayWith100000Elements() {
		int[] A = new int[100000];
		for (int i = 1; i <= 100000; i++) {
			A[i - 1] = i;
		}
		assertEquals(100001, new PermMissingElem().solution(A));
	}

	@Test
	void testArrayWithRandomOrder() {
		int[] A = {5, 3, 2, 1};
		assertEquals(4, new PermMissingElem().solution(A));
	}
}
