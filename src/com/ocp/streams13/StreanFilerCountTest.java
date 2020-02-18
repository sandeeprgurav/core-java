package com.ocp.streams13;

import java.util.Set;
import java.util.TreeSet;

public class StreanFilerCountTest {

	public static void main(String[] args) {
		Set<Integer> dice = new TreeSet<>();
		dice.add(6);
		dice.add(6);
		dice.add(4);
		dice.stream().filter(n -> n != 4).forEach(System.out::println);		
		//dice.stream().filter(n -> n != 4).forEach(System.out::println).count(); forEach returns void
	}
}


// Compilation error due to call of .count on forEach()