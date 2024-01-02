package com.codility.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class LongestPasswordTest {

    private static final String PHRASE = "test 5 a0A pass007 ?xy1";

    @Test
    public void shouldReturn7ForDefaultPhrase() {
        final var solution = new LongestPassword();
        final var result = solution.solution(PHRASE);

        Assertions.assertEquals(7, result);
    }

    @Test
    public void shouldReturnNegativeForOnlyOneWord() {
        final var solution = new LongestPassword();
        final var result = solution.solution("zaq!2#edc");

        Assertions.assertEquals(-1, result);
    }

    @Test
    public void shouldReturnOneForEvenNumberOfLetters() {
        final var solution = new LongestPassword();
        final var result = solution.solution("1 0");

        Assertions.assertEquals(1, result);
    }

    @Test
    public void shouldReturnTwoForEvenNumberOfLetters() {
        final var solution = new LongestPassword();
        final var result = solution.solution("123 0");

        Assertions.assertEquals(3, result);
    }

    @Test
    public void shouldReturnTwoForEvenNumberOfLetters2() {
        final var solution = new LongestPassword();
        final var result = solution.solution("ab1 0");

        Assertions.assertEquals(3, result);
    }

    @Test
    public void shouldReturnTwoForEvenNumberOfLetters3() {
        final var solution = new LongestPassword();
        final var result = solution.solution("a1b 0");

        Assertions.assertEquals(3, result);
    }

    @Test
    public void shouldReturnTwoForEvenNumberOfLetters4() {
        final var solution = new LongestPassword();
        final var result = solution.solution("a1b23 0");

        Assertions.assertEquals(5, result);
    }

    @Test
    public void shouldReturnOneForOddNumberOfDigits() {
        final var solution = new LongestPassword();
        final var result = solution.solution("1 0");

        Assertions.assertEquals(1, result);
    }

    @Test
    public void shouldReturnOneForOddNumberOfDigits2() {
        final var solution = new LongestPassword();
        final var result = solution.solution("123 0");

        Assertions.assertEquals(3, result);
    }

    @Test
    public void shouldReturnNegativeForEmptyString() {
        final var solution = new LongestPassword();
        final var result = solution.solution("");

        Assertions.assertEquals(-1, result);
    }

    @Test
    public void shouldReturnOneFor0String() {
        final var solution = new LongestPassword();
        final var result = solution.solution("0");

        Assertions.assertEquals(1, result);
    }
}
