package com.ocp.streams13;

import java.util.stream.Stream;

public class StreamPeekTest {
public static void main(String[] args) {
	Stream.of("Java", "Unix", "Linux")
	.filter(s-> s.contains("n"))
	.peek(s-> System.out.println("PEEK: "+s))
	.findAny();	
	//.findFirst();
}
}

//Ans: .findAny and findFirst