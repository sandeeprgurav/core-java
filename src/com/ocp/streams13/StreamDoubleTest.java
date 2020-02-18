package com.ocp.streams13;

import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamDoubleTest {
public static void main(String[] args) {
	//DoubleStream str = Stream.of (1.0, 2.0, 3.0, 4.0);
	//Stream str = Stream.of (1.0, 2.0, 3.0, 4.0);
	IntStream str = IntStream.of (1, 2, 3, 4);
	Double d = str.average().getAsDouble();
	System.out.println(d);
}
}

//Ans: IntStream str = IntStream.of (1, 2, 3, 4);
//DBExam ans: DoubleStream str = Stream.of (1.0, 2.0, 3.0, 4.0);
