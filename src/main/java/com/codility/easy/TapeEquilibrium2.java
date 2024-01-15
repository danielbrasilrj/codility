package com.codility.easy;

import java.util.Arrays;

public final class TapeEquilibrium2 {

	// 88% (totalSum should be a long for huge summing)
	public int solution(int[] A) {
		final var totalSum = Arrays.stream( A ).sum();
		var leftSum = 0;
		var rightSum = totalSum;
		var minDiff = Integer.MAX_VALUE;

		for ( int j : A ) {
			leftSum += j;
			rightSum -= j;
			var currentDiff = subtract( leftSum, rightSum );
			minDiff = Math.min( minDiff, currentDiff );
		}

		return minDiff;
	}

	private static int subtract( final int leftSum, final int rightSum ) {
		int currentDiff;
		if( leftSum > rightSum ) {
			currentDiff = leftSum - rightSum;
		} else {
			currentDiff = rightSum - leftSum;
		}
		//			currentDiff = Math.abs(leftSum - rightSum);
		return currentDiff;
	}

	private static int subtractEfficient( final int leftSum, final int rightSum ) {
		int currentDiff;
		if( leftSum > rightSum ) {
			currentDiff = leftSum - rightSum;
		} else {
			currentDiff = rightSum - leftSum;
		}
		//			currentDiff = Math.abs(leftSum - rightSum);
		return currentDiff;
	}
}
