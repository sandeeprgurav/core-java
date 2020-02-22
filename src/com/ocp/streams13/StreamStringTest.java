package com.ocp.streams13;

import java.util.ArrayList;
import java.util.List;

public class StreamStringTest {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Atlanta");
		list.add("Chicago");
		list.add("New York");
		list.stream().filter(String::isEmpty).forEach(System.out::println);
		// 1. ! String::isEmpty 2. String::! isEmpty 3. None of the above 4.
		// String::isEmpty
	}
}

//Ans: None of the above 
