package com.ocp.streams13;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamFlatMapTest2 {
	public static void main(String[] args) {		
		List<Character> aToD = Arrays.asList('a', 'b', 'c', 'd');
		List<Character> eToG = Arrays.asList('e', 'f', 'g');
		Stream<List<Character>> stream = Stream.of(aToD, eToG);
		stream.flatMap(l -> l.stream()).peek(System.out::print).map(c -> (int) c)
				.forEach(i -> System.out.format("%d ", i));
	}
}
