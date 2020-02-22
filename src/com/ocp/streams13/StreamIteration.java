package com.ocp.streams13;

import java.util.stream.Stream;

public class StreamIteration {
public static void main(String[] args) {
	Stream<Integer> stream = Stream.iterate(1, i->i+1);
	boolean b = stream.anyMatch(i -> i > 5); // When i >5 iteration will stop since result is true 
	System.out.println(b);
}
}
