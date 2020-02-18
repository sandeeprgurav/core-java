package com.ocp.streams13;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamFlatMapTest {
public static void main(String[] args) {
	Stream<List<String>> iStr= Stream.of (
			Arrays.asList ("1", "John"),
			Arrays.asList ("2", null));
			//Stream<String> nInSt = iStr.flatMapToInt ((x) -> x.stream ()); // compile error 
			//nInSt.forEach (System.out :: print);	
}
}

//Ans : A compilation error occurs
