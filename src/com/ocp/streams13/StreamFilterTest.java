package com.ocp.streams13;

import java.util.Set;
import java.util.TreeSet;

public class StreamFilterTest {
	public static void main(String[] args) {
		Set<Integer> dice = new TreeSet<>();
		dice.add(6);
		dice.add(6);
		dice.add(4);
		//dice.stream().filter(n -> n != 4).forEach(System.out::println).count(); //count is not valid method on forEach
		dice.stream().filter(n -> n != 4).forEach(System.out::println); 
	}
}

//Ans: The code does not compile 
