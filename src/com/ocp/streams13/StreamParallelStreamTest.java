package com.ocp.streams13;

import java.util.Arrays;

public class StreamParallelStreamTest {
	public static void main(String[] args) {
		System.out.println(Arrays.asList("duck", "chicken", "flamingo", "pelican").parallelStream().parallel() // q1
				.reduce("", (c1, c2) -> ""+ c1.length() + c2.length(), // q2 // // length on Integer is not exist
						(s1, s2) -> s1 + s2)); // q3
	}
}


//Ans: The code will not compile because of line q2.