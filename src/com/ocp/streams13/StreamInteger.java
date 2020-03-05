package com.ocp.streams13;

import java.util.stream.Stream;

public class StreamInteger {
public static void main(String[] args) {
	Stream<Integer> stream = Stream.iterate(1, i-> i);
	boolean b = stream.anyMatch(i-> i > 5);
	System.out.println(b);
}
}
//Options: 1. noneMatch 2. anyMatch 3. allMatch
//None of the above : Since condition will never match as stream of 1 will never be greater than 5. Infinite loop