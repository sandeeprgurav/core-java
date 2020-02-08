package com.ocp;

import java.util.stream.IntStream;

public class IntStreamClass {
	public static void main(String[] args) {
		IntStream s = IntStream.empty();
		System.out.print(s.average().getAsDouble());  //No value present Runtime error 
	}
}
