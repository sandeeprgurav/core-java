package com.ocp.file7;

import java.nio.file.Path;
import java.nio.file.Paths;

public class FileTest9 {
	/*
	 * Assuming the current directory is /seals/harp/food, what is the result of executing the following code?
	 */

	public static void main(String[] holidays) throws Exception {
		final Path path = Paths.get(".").normalize(); // h1
		int count = 0;
		for(int i=0; i<path.getNameCount(); ++i) {
		count++;
		}
		System.out.println(count);	}
}

//Ans: 1
