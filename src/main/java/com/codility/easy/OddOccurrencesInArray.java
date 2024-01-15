package com.codility.easy;

import java.util.HashSet;

public final class OddOccurrencesInArray {

	// 100%
	public int solution(int[] A) {
		var set = new HashSet<>();

		for ( int item : A ) {
			if(set.contains( item )) {
				set.remove( item );
			} else {
				set.add( item );
			}
		}
		return (int) set.iterator().next();
	}
}
