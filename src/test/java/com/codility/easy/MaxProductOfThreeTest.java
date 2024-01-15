package com.codility.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public final class MaxProductOfThreeTest {
	@Test
	public void testMaximalProduct1() {
		int[] A = {-3, 1, 2, -2, 5, 6};
		assertEquals(60, new MaxProductOfThree().solution(A));
	}

	@Test
	public void testMaximalProduct2() {
		int[] A = {1, 2, 3, 4, 5, 6};
		assertEquals(120, new MaxProductOfThree().solution(A));
	}

	@Test
	public void testMaximalProduct3() {
		int[] A = {-10, -2, -8, -1, -5, -9};
		assertEquals(-10, new MaxProductOfThree().solution(A));
	}

	@Test
	public void testMaximalProduct4() {
		int[] A = {0, 0, 0, 0, 0, 0};
		assertEquals(0, new MaxProductOfThree().solution(A));
	}

	@Test
	public void testMaximalProduct5() {
		int[] A = {-1, -2, -3, -4, -5, -6};
		assertEquals(-6, new MaxProductOfThree().solution(A));
	}

	@Test
	public void testMaximalProduct6() {
		int[] A = {-1, -2, -3, 4, 5, 6};
		assertEquals(120, new MaxProductOfThree().solution(A));
	}

	@Test
	public void testMaximalProduct7() {
		int[] A = {-1, -2, -3, -4, 5, 6};
		assertEquals(72, new MaxProductOfThree().solution(A));
	}

	@Test
	public void testMaximalProduct8() {
		int[] A = {1, 2, 3, -4, -5, -6};
		assertEquals(90, new MaxProductOfThree().solution(A));
	}

	@Test
	public void testMaximalProduct9() {
		int[] A = {1, -2, 3, -4, -5, -6};
		assertEquals(90, new MaxProductOfThree().solution(A));
	}

	@Test
	public void testMaximalProduct10() {
		int[] A = {1, -2, 3, 4, 5, -6};
		assertEquals(60, new MaxProductOfThree().solution(A));
	}

	@Test
	public void testMaximalProduct11() {
		int[] A = {1, -2, -3, -4, 5, 6};
		assertEquals(72, new MaxProductOfThree().solution(A));
	}

	@Test
	public void testMaximalProduct12() {
		int[] A = {1, -2, -3, 4, -5, 6};
		assertEquals(90, new MaxProductOfThree().solution(A));
	}

	@Test
	public void testMaximalProduct13() {
		int[] A = {-1, -2, 3, 4, -5, 6};
		assertEquals(72, new MaxProductOfThree().solution(A));
	}

	@Test
	public void testMaximalProduct14() {
		int[] A = {-1, -2, -3, -4, -5, 6};
		assertEquals(120, new MaxProductOfThree().solution(A));
	}

	@Test
	public void testMaximalProduct15() {
		int[] A = {1, 1, 1, 1, 1, 1};
		assertEquals(1, new MaxProductOfThree().solution(A));
	}

	@Test
	public void testMaximalProduct16() {
		int[] A = {-1, -1, -1, -1, -1, -1};
		assertEquals(-1, new MaxProductOfThree().solution(A));
	}

	@Test
	public void testMaximalProduct17() {
		int[] A = {2, 2, 2, 2, 2, 2};
		assertEquals(8, new MaxProductOfThree().solution(A));
	}

	@Test
	public void testMaximalProduct18() {
		int[] A = {-2, -2, -2, -2, -2, -2};
		assertEquals(-8, new MaxProductOfThree().solution(A));
	}

	@Test
	public void testMaximalProduct19() {
		int[] A = {1, 1, 0, 1, 1, 1};
		assertEquals(1, new MaxProductOfThree().solution(A));
	}

	@Test
	public void testMaximalProduct20() {
		int[] A = {-1, -1, 0, -1, -1, -1};
		assertEquals(0, new MaxProductOfThree().solution(A));
	}
}
