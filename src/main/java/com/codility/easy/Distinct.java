package com.codility.easy;

import java.util.Arrays;
import java.util.stream.Collectors;

public final class Distinct {
	// 100%
	public int solution(int[] A) {
		var set = Arrays.stream( A ).boxed().collect( Collectors.toSet() );
		return set.size();
	}

}
