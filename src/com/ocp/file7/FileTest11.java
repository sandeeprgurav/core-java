package com.ocp.file7;

import java.io.Console;
import java.util.ArrayList;
import java.util.List;

public class FileTest11 {
	private List<String> activities = new ArrayList<>();

	private static FileTest11 getFileTest9(String name) {
		return null;
	}

	public static void printItinerary() throws Exception {
		Console c = null;//new Console(); // compile error, cant create Console uisng new 
		final String name = c.readLine("What is your name?");
		final FileTest11 stuff = getFileTest9(name);
		stuff.activities.forEach(s -> c.printf(s));
	}

	public static void main(String[] holidays) throws Exception {
		printItinerary();
	}
}

//Ans: The code does not compile.

// Ans: