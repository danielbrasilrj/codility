package com.codility.easy;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public final class CyclicRotationTest {
	@Test
	public void testRotateArrayExample1() {
		int[] A = {3, 8, 9, 7, 6};
		int K = 3;
		int[] result = new CyclicRotation().solution(A, K);
		assertArrayEquals(new int[]{ 9, 7, 6, 3, 8}, result);
	}

	@Test
	public void testRotateArrayExample2() {
		int[] A = {0, 0, 0};
		int K = 1;
		int[] result = new CyclicRotation().solution(A, K);
		assertArrayEquals(new int[]{0, 0, 0}, result);
	}

	@Test
	public void testRotateArrayExample3() {
		int[] A = {1, 2, 3, 4};
		int K = 4;
		int[] result = new CyclicRotation().solution(A, K);
		assertArrayEquals(new int[]{1, 2, 3, 4}, result);
	}

	@Test
	public void testRotateArrayEmptyArray() {
		int[] A = {};
		int K = 2;
		int[] result = new CyclicRotation().solution(A, K);
		assertArrayEquals(new int[]{}, result);
	}

	@Test
	public void testRotateArrayKZero() {
		int[] A = {1, 2, 3, 4};
		int K = 0;
		int[] result = new CyclicRotation().solution(A, K);
		assertArrayEquals(new int[]{1, 2, 3, 4}, result);
	}

	@Test
	public void testRotateArrayKNegative() {
		int[] A = {1, 2, 3, 4};
		int K = -2;
		int[] result = new CyclicRotation().solution(A, K);
		assertArrayEquals(new int[]{1, 2, 3, 4}, result);
	}

	@Test
	public void testRotateArrayLargeK() {
		int[] A = {1, 2, 3, 4};
		int K = 100;
		int[] result = new CyclicRotation().solution(A, K);
		assertArrayEquals(new int[]{1, 2, 3, 4}, result);
	}

	@Test
	public void testRotateArraySingleElement() {
		int[] A = {5};
		int K = 3;
		int[] result = new CyclicRotation().solution(A, K);
		assertArrayEquals(new int[]{5}, result);
	}

	@Test
	public void testRotateArrayNegativeNumbers() {
		int[] A = {-3, -5, -7, -2};
		int K = 2;
		int[] result = new CyclicRotation().solution(A, K);
		assertArrayEquals(new int[]{-7, -2, -3, -5}, result);
	}

	@Test
	public void testRotateArrayZeroRotation() {
		int[] A = {3, 8, 9, 7, 6};
		int K = 0;
		int[] result = new CyclicRotation().solution(A, K);
		assertArrayEquals(new int[]{3, 8, 9, 7, 6}, result);
	}
}
