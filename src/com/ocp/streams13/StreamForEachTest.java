package com.ocp.streams13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

public class StreamForEachTest {
	public static void main(String[] args) {
		List<Integer> db = Collections.synchronizedList(new ArrayList<>());
		IntStream.iterate(1, i -> i + 1).limit(5).parallel().map(i -> {
			db.add(i);
			return i;
		}).forEachOrdered(System.out::print); // p1
		System.out.println();
		db.forEach(System.out::print); // p2
	}
}


//Ans: They are sometimes the same. since DB is populated randomly due to parallel. 
// for first loop it is ordered whereas for second time it is not 