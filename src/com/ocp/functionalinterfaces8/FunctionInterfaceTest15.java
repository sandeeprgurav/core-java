package com.ocp.functionalinterfaces8;

import java.util.Arrays;
import java.util.function.BiFunction;

public class FunctionInterfaceTest15 {
	public static void main(String... future) {
		int i = 0;
		BiFunction<Integer, Integer, Integer> accumulator = (a, b) -> 5;
		System.out.print(Arrays.asList(1, 2, 3, 4, 5).parallelStream().reduce(0, accumulator, (s1, s2) -> s1 + s2));
	}
}

// options: 1. (a,b) -> i++ 2. (a,b) -> (a-b) 3. (a,b) -> 5 4. None of the above
// are appropriate.
// Ans:(a,b) -> 5
