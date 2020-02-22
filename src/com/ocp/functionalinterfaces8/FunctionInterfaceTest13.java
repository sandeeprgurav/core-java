package com.ocp.functionalinterfaces8;

import java.util.function.Predicate;
import java.util.stream.Stream;

public class FunctionInterfaceTest13 {
	public static void main(String... future) {
		Predicate<? super String> predicate = s -> s.length() > 3;
		Stream<String> stream = Stream.iterate("-", (s) -> s + s);
		boolean b1 = stream.noneMatch(predicate);
		boolean b2 = stream.anyMatch(predicate);
		System.out.println(b1 + " " + b2);
	}
}

//Ans: An exception is thrown
///java.lang.IllegalStateException: stream has already been operated upon or closed


