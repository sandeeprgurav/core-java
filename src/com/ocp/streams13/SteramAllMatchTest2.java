package com.ocp.streams13;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class SteramAllMatchTest2 {
	public static void main(String[] args) {
		List<String> colors = Arrays.asList("red", "green", "yellow");
		Predicate<String> test = n -> {
			System.out.println("Searching...");
			return n.contains("red");
		};
		System.out.println(colors.stream().filter(c -> c.length() > 3).allMatch(test));
	}
}

/*
 * //It will filter ==>> green and yellow ==>> check for green, predicate return
 * false and print =>> stop execution since allMatch expect true for all if one
 * conditiona fails all will will be failed. Short circuit.
 */