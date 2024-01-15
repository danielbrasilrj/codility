package com.codility.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public final class FrogRiverOneTest {

	@Test
	public void shouldReturn6() {
		int[] array = {1, 3, 1, 4, 2, 3, 5, 4};
		var result = new FrogRiverOne().solution( 5, array );

		assertEquals( 6, result );
	}

	@Test
	public void shouldReturn7() {
		int[] array = {1, 3, 1, 4, 2, 3, 4, 5};
		var result = new FrogRiverOne().solution( 5, array );

		assertEquals( 7, result );
	}

	@Test
	public void testExampleCase() {
		int[] A = { 1, 3, 1, 4, 2, 3, 5, 4 };
		assertEquals(6, new FrogRiverOne().solution(5, A));
	}

	@Test
	public void testMinimumInput() {
		int[] A = { 1 };
		assertEquals(0, new FrogRiverOne().solution(1, A));
	}

	@Test
	public void testNoLeaves() {
		int[] A = { 2, 4, 6, 8 };
		assertEquals(-1, new FrogRiverOne().solution(5, A));
	}

	@Test
	public void testLeavesAtDestination() {
		int[] A = { 1, 2, 3, 4, 5 };
		assertEquals(4, new FrogRiverOne().solution(5, A));
	}

	@Test
	public void testLeavesAtFirstSecond() {
		int[] A = { 1, 1, 1, 1, 1 };
		assertEquals(-1, new FrogRiverOne().solution(5, A));
	}

	@Test
	public void testLeavesAtLastSecond() {
		int[] A = { 5, 5, 5, 5, 5 };
		assertEquals(-1, new FrogRiverOne().solution(5, A));
	}

	@Test
	public void testLeavesInSequentialOrder() {
		int[] A = { 1, 2, 3, 4, 5 };
		assertEquals(4, new FrogRiverOne().solution(5, A));
	}

	@Test
	public void testLargeInput() {
		int[] A = new int[100000];
		for (int i = 0; i < 100000; i++) {
			A[i] = i + 1;
		}
		assertEquals(99999, new FrogRiverOne().solution(100000, A));
	}

	@Test
	public void testAllLeavesInSamePosition() {
		int[] A = { 2, 2, 2, 2, 2 };
		assertEquals(-1, new FrogRiverOne().solution(5, A));
	}

	@Test
	public void testLeavesInRandomOrder() {
		int[] A = { 4, 2, 5, 1, 3 };
		assertEquals(4, new FrogRiverOne().solution(5, A));
	}

	@Test
	public void testXEqualsN() {
		int[] A = { 1, 2, 3, 4, 5 };
		assertEquals(4, new FrogRiverOne().solution(5, A));
	}

	@Test
	public void testXEquals1() {
		int[] A = { 1, 1, 1, 1, 1 };
		assertEquals(0, new FrogRiverOne().solution(1, A));
	}

	@Test
	public void testXAndNEqual() {
		int[] A = { 1, 2, 3, 4, 5 };
		assertEquals(4, new FrogRiverOne().solution(5, A));
	}

	@Test
	public void testLeavesInReverseOrder() {
		int[] A = { 5, 4, 3, 2, 1 };
		assertEquals(4, new FrogRiverOne().solution(5, A));
	}

	@Test
	public void testXGreaterThanN() {
		int[] A = { 1, 3, 5 };
		assertEquals(-1, new FrogRiverOne().solution(7, A));
	}

	@Test
	public void testLeavesAtEvenPositions() {
		int[] A = { 2, 4, 6, 8 };
		assertEquals(-1, new FrogRiverOne().solution(4, A));
	}

	@Test
	public void testLeavesAtOddPositions() {
		int[] A = { 1, 3, 5, 7 };
		assertEquals(-1, new FrogRiverOne().solution(4, A));
	}

	@Test
	public void testLeavesAtXPosition() {
		int[] A = { 1, 3, 5, 4 };
		assertEquals(-1, new FrogRiverOne().solution(4, A));
	}

	@Test
	public void testXEqualsNMinusOne() {
		int[] A = { 1, 2, 3, 4 };
		assertEquals(2, new FrogRiverOne().solution(3, A));
	}
}
