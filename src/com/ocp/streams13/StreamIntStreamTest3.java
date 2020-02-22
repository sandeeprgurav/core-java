package com.ocp.streams13;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamIntStreamTest3 {
 public static void main(String[] args) {
	 IntStream ints = IntStream.empty();
	 IntStream moreInts = IntStream.of(66, 77, 88);
	 Stream.of(ints, moreInts).flatMapToInt(x -> x).forEach(System.out::print);
}
}
//Ans: flatMapToInt
//flatMap takes input Stream<?>
//flatMapToInt requires param IntStream