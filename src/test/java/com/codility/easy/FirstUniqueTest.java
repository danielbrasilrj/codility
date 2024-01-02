package com.codility.easy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public final class FirstUniqueTest {
    @Test
    public void testFirstUniqueNumber() {
        FirstUnique firstUnique = new FirstUnique();
        assertEquals(5, firstUnique.solution(new int[]{4, 10, 5, 4, 2, 10}));
    }

    @Test
    public void testNoUniqueNumber() {
        FirstUnique firstUnique = new FirstUnique();
        assertEquals(-1, firstUnique.solution(new int[]{6, 4, 4, 6}));
    }

    @Test
    public void testFirstUniqueNumberAtStart() {
        FirstUnique firstUnique = new FirstUnique();
        assertEquals(4, firstUnique.solution(new int[]{1, 4, 3, 3, 1, 2}));
    }

    @Test
    public void testFirstUniqueNumberAtEnd() {
        FirstUnique firstUnique = new FirstUnique();
        assertEquals(4, firstUnique.solution(new int[]{3, 4, 1, 3, 1, 2}));
    }

    @Test
    public void testUniqueNumberInMiddle() {
        FirstUnique firstUnique = new FirstUnique();
        assertEquals(2, firstUnique.solution(new int[]{1, 4, 3, 3, 1, 2, 4, 5, 6}));
    }

    @Test
    public void testAllUniqueNumbers() {
        FirstUnique firstUnique = new FirstUnique();
        assertEquals(1, firstUnique.solution(new int[]{1, 2, 3, 4, 5, 6}));
    }

    @Test
    public void testSingleElementArray() {
        FirstUnique firstUnique = new FirstUnique();
        assertEquals(1, firstUnique.solution(new int[]{1}));
    }

    @Test
    public void testAllRepeatedNumbers() {
        FirstUnique firstUnique = new FirstUnique();
        assertEquals(-1, firstUnique.solution(new int[]{1, 1, 1, 1, 1, 1}));
    }

    @Test
    public void testLargeArray() {
        FirstUnique firstUnique = new FirstUnique();
        assertEquals(1000000000, firstUnique.solution(new int[]{1000000000, 2, 3, 4, 5, 6}));
    }

    @Test
    public void testUniqueNumberAtMaxPosition() {
        FirstUnique firstUnique = new FirstUnique();
        assertEquals(1, firstUnique.solution(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 6}));
    }

    @Test
    public void testUniqueNumberInLargeArray() {
        FirstUnique firstUnique = new FirstUnique();
        assertEquals(4, firstUnique.solution(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 6, 7, 8, 9, 10, 1, 2, 3}));
    }

    @Test
    public void testAllUniqueNumbersInLargeArray() {
        FirstUnique firstUnique = new FirstUnique();
        assertEquals(11, firstUnique.solution(new int[]{11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30}));
    }

    @Test
    public void testNegativeNumbers() {
        FirstUnique firstUnique = new FirstUnique();
        assertEquals(0, firstUnique.solution(new int[]{-2, -1, -2, 0, 1, 2}));
    }

    @Test
    public void testZeroAsUniqueNumber() {
        FirstUnique firstUnique = new FirstUnique();
        assertEquals(1, firstUnique.solution(new int[]{0, 1, 0, 2, 3, 4}));
    }

    @Test
    public void testRepeatedNegativeNumbers() {
        FirstUnique firstUnique = new FirstUnique();
        assertEquals(-1, firstUnique.solution(new int[]{-1, -1, -1, -1, -1, -1}));
    }

    @Test
    public void testRepeatedZero() {
        FirstUnique firstUnique = new FirstUnique();
        assertEquals(-1, firstUnique.solution(new int[]{0, 0, 0, 0, 0, 0}));
    }

    @Test
    public void testMixedNumbers() {
        FirstUnique firstUnique = new FirstUnique();
        assertEquals(5, firstUnique.solution(new int[]{1, 2, 3, 4, 5, 4, 3, 2, 1}));
    }

    @Test
    public void testMixedNumbersWithDuplicates() {
        FirstUnique firstUnique = new FirstUnique();
        assertEquals(4, firstUnique.solution(new int[]{-1, 2, -3, 4, -5, -3, 2, 1}));
    }

    @Test
    public void testRepeatedLargeNumbers() {
        FirstUnique firstUnique = new FirstUnique();
        assertEquals(-1, firstUnique.solution(new int[]{-1000000000, -1000000000, -1000000000, -1000000000, -1000000000, -1000000000}));
    }

    @Test
    public void testEmptyArray() {
        FirstUnique firstUnique = new FirstUnique();
        assertEquals(-1, firstUnique.solution(new int[]{}));
    }
}
