package com.ocp.streams13;

import java.util.Arrays;

public class StreamParallelTest2 {
	public static void main(String[] args) {
		Arrays.asList(1, 2, 3, 4).stream().forEach(System.out::println);
		//Arrays.asList(1, 2, 3, 4).parallel().forEachOrdered(System.out::println); parallelStream is on collection whereas parallel on stream() 
		Arrays.asList(1, 2, 3, 4).parallelStream().forEachOrdered(System.out::println); // for this out put is 12341234 on multiple executes		
		
	}
}

//Ans: None of the above