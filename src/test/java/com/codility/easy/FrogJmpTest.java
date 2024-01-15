package com.codility.easy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public final class FrogJmpTest {
	@Test
	void testMinimumJumps() {
		assertEquals(3, new FrogJmp().solution(10, 85, 30));
	}

	@Test
	void testExactJumps() {
		assertEquals(2, new FrogJmp().solution(10, 70, 30));
	}

	@Test
	void testSingleJump() {
		assertEquals(1, new FrogJmp().solution(10, 40, 30));
	}

	@Test
	void testNoJumpNeeded() {
		assertEquals(0, new FrogJmp().solution(10, 10, 30));
	}

	@Test
	void testLargeJumpDistance() {
		assertEquals(1, new FrogJmp().solution(10, 1000000000, 1000000000));
	}

	@Test
	void testSmallJumpDistance() {
		assertEquals(50, new FrogJmp().solution(10, 60, 1));
	}

	@Test
	void testMinimumValues() {
		assertEquals(0, new FrogJmp().solution(1, 1, 1));
	}

	@Test
	void testMaximumValues() {
		assertEquals(500000000, new FrogJmp().solution(1, 1000000000, 2));
	}

	@Test
	void testEqualPositions() {
		assertEquals(0, new FrogJmp().solution(15, 15, 30));
	}

	@Test
	void testEqualPositionsLargeJump() {
		assertEquals(0, new FrogJmp().solution(15, 15, 100));
	}

	@Test
	void testZeroPosition() {
		assertEquals(2, new FrogJmp().solution(0, 50, 25));
	}

	@Test
	void testLargeValues() {
		assertEquals(333333333, new FrogJmp().solution(1, 1000000000, 3));
	}

	@Test
	void testLargeValuesWithLargeJumpDistance() {
		assertEquals(1, new FrogJmp().solution(1, 1000000000, 1000000000));
	}
}
