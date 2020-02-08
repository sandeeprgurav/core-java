package com.ocp;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamJoining {
	public static void main(String[] args) {
		System.out.println(Stream.iterate(1, x -> ++x).limit(5).map(x -> "" + x).collect(Collectors.joining()));
		// Wrap the entire line in a System.out.print statement.
		// Change x -> x++ to x -> ++x.
		// Change map(x -> x) to map(x -> "" + x) .
	}
}