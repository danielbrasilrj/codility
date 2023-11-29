package com.codility.bitwise_operations.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class BinaryGapTest {

    @Test
    public void shouldReturn0for0() {
        final var solution = new BinaryGap();
        final var result = solution.solution(0);

        Assertions.assertEquals(0, result);
    }

    @Test
    public void shouldReturn0for1() {
        final var solution = new BinaryGap();
        final var result = solution.solution(1);

        Assertions.assertEquals(0, result);
    }

    @Test
    public void shouldReturn0for2() {
        final var solution = new BinaryGap();
        final var result = solution.solution(2);

        Assertions.assertEquals(0, result);
    }

    @Test
    public void shouldReturn0for3() {
        final var solution = new BinaryGap();
        final var result = solution.solution(3);

        Assertions.assertEquals(0, result);
    }

    @Test
    public void shouldReturn0for4() {
        final var solution = new BinaryGap();
        final var result = solution.solution(4);

        Assertions.assertEquals(0, result);
    }

    @Test
    public void shouldReturn0for6() {
        final var solution = new BinaryGap();
        final var result = solution.solution(6);

        Assertions.assertEquals(0, result);
    }

    @Test
    public void shouldReturn1for5() {
        final var solution = new BinaryGap();
        final var result = solution.solution(5);

        Assertions.assertEquals(1, result);
    }

    @Test
    public void shouldReturn0for32() {
        final var solution = new BinaryGap();
        final var result = solution.solution(32);

        Assertions.assertEquals(0, result);
    }

    @Test
    public void shouldReturn2for9() {
        final var solution = new BinaryGap();
        final var result = solution.solution(9);

        Assertions.assertEquals(2, result);
    }

    @Test
    public void shouldReturn2for651131() {
        final var solution = new BinaryGap();
        final var result = solution.solution(651131);

        Assertions.assertEquals(2, result);
    }

    @Test
    public void shouldReturn4for529() {
        final var solution = new BinaryGap();
        final var result = solution.solution(529);

        Assertions.assertEquals(4, result);
    }

    @Test
    public void shouldReturn5for1041() {
        final var solution = new BinaryGap();
        final var result = solution.solution(1041);

        Assertions.assertEquals(5, result);
    }

    @Test
    public void shouldReturn6for547564736() {
        final var solution = new BinaryGap();
        final var result = solution.solution(547564736);

        Assertions.assertEquals(6, result);
    }
}
