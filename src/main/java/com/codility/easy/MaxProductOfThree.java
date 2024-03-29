package com.codility.easy;

import java.util.Arrays;

/**
 *A non-empty array A consisting of N integers is given. The product of triplet (P, Q, R) equates to A[P] * A[Q] * A[R] (0 ≤ P < Q < R < N).
 *
 * For example, array A such that:
 *
 *   A[0] = -3
 *   A[1] = 1
 *   A[2] = 2
 *   A[3] = -2
 *   A[4] = 5
 *   A[5] = 6
 * contains the following example triplets:
 *
 * (0, 1, 2), product is −3 * 1 * 2 = −6
 * (1, 2, 4), product is 1 * 2 * 5 = 10
 * (2, 4, 5), product is 2 * 5 * 6 = 60
 * Your goal is to find the maximal product of any triplet.
 *
 * Write a function:
 *
 * class Solution { public int solution(int[] A); }
 *
 * that, given a non-empty array A, returns the value of the maximal product of any triplet.
 *
 * For example, given array A such that:
 *
 *   A[0] = -3
 *   A[1] = 1
 *   A[2] = 2
 *   A[3] = -2
 *   A[4] = 5
 *   A[5] = 6
 * the function should return 60, as the product of triplet (2, 4, 5) is maximal.
 *
 * Write an efficient algorithm for the following assumptions:
 *
 * N is an integer within the range [3..100,000];
 * each element of array A is an integer within the range [−1,000..1,000].
 */
public final class MaxProductOfThree {
	public int solution(int[] A) {
		// 44%
//		var result = - Integer.MAX_VALUE;
//		for(int i = 0 ; i < A.length-2 ; i++) {
//			for (int j = i+1 ; j < A.length-1 ; j++) {
//				for(int k = j+1 ; k < A.length ; k++) {
//					var triplet = A[i] * A[j] * A[k];
//					if(triplet > result) {
//						result = triplet;
//					}
//				}
//			}
//		}
//		return result;

		// 100%
		Arrays.sort(A);

		int n = A.length;

		// Compare the product of the two smallest and three largest elements
		int option1 = A[0] * A[1] * A[n - 1];
		int option2 = A[n - 3] * A[n - 2] * A[n - 1];

		return Math.max(option1, option2);
	}
}
