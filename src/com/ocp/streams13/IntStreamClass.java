package com.ocp.streams13;

import java.util.stream.IntStream;

public class IntStreamClass {
	public static void main(String[] args) {
		IntStream s = IntStream.empty();
		System.out.print(s.average().getAsDouble());  //No value present Runtime error 
	}
}
//Ans: Exception in thread "main" java.util.NoSuchElementException: No value present