package com.codility.easy;

import java.util.HashSet;

public final class PermCheck {

	// 100%
	public int solution(int[] A) {
		var set = new HashSet<>();

		for(int j : A) {
			if(j <= A.length) {
				set.add( j );
			}
		}

		return set.size() == A.length ? 1 : 0;
	}
}
