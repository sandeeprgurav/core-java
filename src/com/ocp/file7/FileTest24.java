package com.ocp.file7;

import java.nio.file.Path;
import java.nio.file.Paths;

public class FileTest24 {
	public static void main(String[] args) {
		final Path path = Paths.get(".").normalize(); // h1
		int count = 0;
		for(int i=0; i<path.getNameCount(); ++i) {
		count++;
		}
		System.out.println(count);
	}
}

// Ans: 1


