package com.codility.elementary;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class TennisTournamentTest {

    @Test
    public void shouldReturn2For5PlayersAnd3Courts() {
        final var tennisTournament = new TennisTournament();

        final var numberOfPlayers = 5;
        final var numberOfCourts = 3;

        final var result = tennisTournament.solution(numberOfPlayers, numberOfCourts);
        assertEquals(2, result);
    }

    @Test
    public void shouldReturn3For10PlayersAnd3Courts() {
        final var tennisTournament = new TennisTournament();

        final var numberOfPlayers = 10;
        final var numberOfCourts = 3;

        final var result = tennisTournament.solution(numberOfPlayers, numberOfCourts);
        assertEquals(3, result);
    }

    @Test
    public void testScenario1() {
        TennisTournament solution = new TennisTournament();
        assertEquals(2, solution.solution(5, 3));
    }

    @Test
    public void testScenario2() {
        TennisTournament solution = new TennisTournament();
        assertEquals(3, solution.solution(10, 3));
    }

    @Test
    public void testMinimumPlayersAndCourts() {
        TennisTournament solution = new TennisTournament();
        assertEquals(0, solution.solution(1, 1));
    }

    @Test
    public void testEqualPlayersAndCourts() {
        TennisTournament solution = new TennisTournament();
        assertEquals(5, solution.solution(10, 10));
    }

    @Test
    public void testMoreCourtsThanPlayers() {
        TennisTournament solution = new TennisTournament();
        assertEquals(3, solution.solution(7, 10));
    }

    @Test
    public void testExactlyEnoughCourts() {
        TennisTournament solution = new TennisTournament();
        assertEquals(5, solution.solution(10, 5));
    }

    @Test
    public void testLargeNumberOfPlayersAndCourts() {
        TennisTournament solution = new TennisTournament();
        assertEquals(15000, solution.solution(30000, 15000));
    }

    @Test
    public void testOddNumberOfPlayers() {
        TennisTournament solution = new TennisTournament();
        assertEquals(3, solution.solution(7, 4));
    }

    @Test
    public void testPrimeNumberOfPlayers() {
        TennisTournament solution = new TennisTournament();
        assertEquals(9, solution.solution(19, 10));
    }

    @Test
    public void testLargeEvenNumberOfPlayers() {
        TennisTournament solution = new TennisTournament();
        assertEquals(15000, solution.solution(30000, 20000));
    }

    @Test
    public void testLargeEvenNumberOfCourts() {
        TennisTournament solution = new TennisTournament();
        assertEquals(10000, solution.solution(20000, 10000));
    }

    @Test
    public void testZeroPlayers() {
        TennisTournament solution = new TennisTournament();
        assertEquals(0, solution.solution(0, 5));
    }

    @Test
    public void testZeroCourts() {
        TennisTournament solution = new TennisTournament();
        assertEquals(0, solution.solution(10, 0));
    }

    @Test
    public void testNegativePlayers() {
        TennisTournament solution = new TennisTournament();
        assertEquals(0, solution.solution(-5, 3));
    }

    @Test
    public void testNegativeCourts() {
        TennisTournament solution = new TennisTournament();
        assertEquals(0, solution.solution(5, -3));
    }

    @Test
    public void testPlayersGreaterThanMaxLimit() {
        TennisTournament solution = new TennisTournament();
        assertEquals(3, solution.solution(35000, 3));
    }

    @Test
    public void testCourtsGreaterThanMaxLimit() {
        TennisTournament solution = new TennisTournament();
        assertEquals(2, solution.solution(5, 35000));
    }

    @Test
    public void testPlayersAndCourtsAtMaxLimit() {
        TennisTournament solution = new TennisTournament();
        assertEquals(15000, solution.solution(30000, 15000));
    }
}
