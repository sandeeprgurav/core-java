package com.ocp.streams13;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CharStream {
	public static void main(String[] args) {
		Stream<Character> chars = Stream.of('o', 'b', 's', 't', 'a', 'c', 'l', 'e');
		chars.map(c -> c).collect(Collectors.toList());
		//chars.map(c -> c).collect(Collectors.toArrayList());  toArrayList not an method for Collectors
		//chars.map(c -> c).collect(Collectors.toMap()); toMap incorrect option
	}
}
