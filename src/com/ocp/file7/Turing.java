package com.ocp.file7;

import java.io.Console;

public class Turing {

	public static void main(String[] args) {
		Console c = System.console();
		final String response = c.readLine("Are you human?");
		System.err.print(response);
	}
}

/*
 * 1. The program may ask the user a question and print the response to the
 * error stream. 2. The program may throw a NullPointerException at runtime. 3.
 * The program may wait indefinitely.
 * 
 * Ans : I, II, and III
 */