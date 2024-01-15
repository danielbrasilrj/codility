package com.codility.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public final class PermCheckTest {

	@Test
	public void testPermutation() {
		int[] A = { 4, 1, 3, 2 };
		assertEquals(1, new PermCheck().solution(A));
	}

	@Test
	public void testNotPermutationMissingElement() {
		int[] A = { 4, 1, 3 };
		assertEquals(0, new PermCheck().solution(A));
	}

	@Test
	public void testNotPermutationDuplicateElement() {
		int[] A = { 4, 1, 3, 2, 2 };
		assertEquals(0, new PermCheck().solution(A));
	}

	@Test
	public void testPermutationWithSingleElement() {
		int[] A = { 1 };
		assertEquals(1, new PermCheck().solution(A));
	}

	@Test
	public void testPermutationWithTwoElements() {
		int[] A = { 1, 2 };
		assertEquals(1, new PermCheck().solution(A));
	}

	@Test
	public void testNotPermutationWithTwoElements() {
		int[] A = { 1, 1 };
		assertEquals(0, new PermCheck().solution(A));
	}

	@Test
	public void testPermutationWithReversedOrder() {
		int[] A = { 4, 3, 2, 1 };
		assertEquals(1, new PermCheck().solution(A));
	}

	@Test
	public void testNotPermutationWithReversedOrder() {
		int[] A = { 4, 3, 2, 1, 5 };
		assertEquals(1, new PermCheck().solution(A));
	}

	@Test
	public void testNotPermutationWithRandomOrder() {
		int[] A = { 2, 1, 4, 3, 5 };
		assertEquals(1, new PermCheck().solution(A));
	}

	@Test
	public void testPermutationWithRandomOrder() {
		int[] A = { 2, 1, 4, 3 };
		assertEquals(1, new PermCheck().solution(A));
	}

	@Test
	public void testPermutationWithRandomOrderAndDuplicateElement() {
		int[] A = { 2, 1, 4, 3, 3 };
		assertEquals(0, new PermCheck().solution(A));
	}

	@Test
	public void testNotPermutationWithRandomOrderAndMissingElement() {
		int[] A = { 2, 1, 4, 3, 5, 7 };
		assertEquals(0, new PermCheck().solution(A));
	}
}
