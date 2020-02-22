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
//None of the above : since code will go in infinite loop, limit() call is missing to limit the stream data. 