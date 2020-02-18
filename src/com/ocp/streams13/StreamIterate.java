package com.ocp.streams13;

import java.util.stream.Stream;

public class StreamIterate {
	public static void main(String[] args) {
		Stream<String> stream = Stream.iterate("", (s) -> s + "1");
		System.out.println(stream.limit(2).map(x -> x + "2")); // print java.util.stream.ReferencePipeline$3@87aac27

		// stream.limit(2).map(x -> x + "2").forEach(System.out::print); //212
	}
}

// Ans: java.util.stream.ReferencePipeline$3@87aac27
