package com.ocp.streams13;

import java.util.stream.IntStream;

public class StreamIntStreamTest4 {
public static void main(String[] args) {
	IntStream is = IntStream. empty();
	is.average(); //Returns OptionalDouble
	is.sum(); //returns int 	
    is.findAny(); //returns OptionalInt
}
}
