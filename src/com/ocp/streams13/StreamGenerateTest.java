package com.ocp.streams13;

import java.util.stream.Stream;

public class StreamGenerateTest {
public static void main(String[] args) {
	Stream<Character> chars = Stream.generate(()->'a');
	chars.filter(c -> c < 'b')
	.sorted()
	.findFirst()
	.ifPresent(System.out::print);
}
}

// Ans: The code enters an infinite loop.
