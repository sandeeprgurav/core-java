package com.ocp;

import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamTest {
	public static void main(String[] args) {
		Predicate<? super String> predicate = s -> s.length() > 3;
		Stream<String> stream = Stream.iterate("-", (s) -> s + s);
		boolean b1 = stream.noneMatch(predicate);
		boolean b2 = stream.anyMatch(predicate);
		System.out.println(b1 + " " + b2);
	}
}


// Ans : "stream has already been operated upon or closed" An exception is thrown.