package com.codility.easy;

/**
 * A non-empty array A consisting of N integers is given. The unique number is the number that occurs exactly once in array A.
 * <p>
 * For example, the following array A:
 * <p>
 * A[0] = 4 A[1] = 10 A[2] = 5 A[3] = 4 A[4] = 2 A[5] = 10 contains two unique numbers (5 and 2).
 * <p>
 * You should find the first unique number in A. In other words, find the unique number with the lowest position in A.
 * <p>
 * For above example, 5 is in second position (because A[2] = 5) and 2 is in fourth position (because A[4] = 2). So, the first unique number is 5.
 * <p>
 * Write a function:
 * <p>
 * class Solution { public int solution(int[] A); }
 * <p>
 * that, given a non-empty array A of N integers, returns the first unique number in A. The function should return −1 if there are no unique numbers
 * in A.
 * <p>
 * For example, given:
 * <p>
 * A[0] = 1 A[1] = 4 A[2] = 3 A[3] = 3 A[4] = 1 A[5] = 2 the function should return 4. There are two unique numbers (4 and 2 occur exactly once). The
 * first one is 4 in position 1 and the second one is 2 in position 5. The function should return 4 bacause it is unique number with the lowest
 * position.
 * <p>
 * Given array A such that:
 * <p>
 * A[0] = 6 A[1] = 4 A[2] = 4 A[3] = 6 the function should return −1. There is no unique number in A (4 and 6 occur more than once).
 * <p>
 * Write an efficient algorithm for the following assumptions:
 * <p>
 * N is an integer within the range [1..100,000]; each element of array A is an integer within the range [0..1,000,000,000].
 */
public final class FirstUnique {

    public int solution(int[] A) {
        if(A.length > 100000) {
            return -1;
        }

        for (final int number : A) {
            if (isNumberInRange(number) && isUnique(number, A)) {
                return number;
            }
        }

        return -1;
    }

    private boolean isUnique(final int number, int[] array) {
        var count = 0;

        for (int n : array) {
            if (number == n) {
                count++;
                if(count > 1) {
                    return false;
                }
            }
        }

        return count == 1;
    }

    private boolean isNumberInRange(int number) {
        return number >= 0 && number <= 1000000000;
    }
}
