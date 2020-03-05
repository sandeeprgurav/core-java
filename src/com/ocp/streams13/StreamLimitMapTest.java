package com.ocp.streams13;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamLimitMapTest {
	public static void main(String[] args) {
		Stream.iterate(1, x -> x++).limit(5).map(x -> ""+x).collect(Collectors.joining());
		//1                                       //2                    //3
		System.out.println(Stream.iterate(1, x -> ++x).limit(5).map(x ->""+ x).collect(Collectors.joining()));

	}
}
/*1. Change x -> x++ to x -> ++x.
2. Change map(x -> x) to map(x -> "" + x) .
3. Wrap the entire line in a System.out.print statement.*/
