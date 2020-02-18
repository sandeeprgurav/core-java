package com.ocp.streams13;

import java.util.stream.Stream;

public class StreamPeek {
	public static void main(String[] args) {
		Stream ints = Stream.of(3, 6, 0, 4);
		ints.sorted().peek(System.out::print).findFirst();

	}
}

//Ans : 0