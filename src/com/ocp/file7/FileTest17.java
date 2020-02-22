package com.ocp.file7;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FileTest17 {
	// What is the output of the following application? Assume /all-data exists and
	// is accessible within the file system.
	public static Stream<String> readLines(Path p) {
		try {
			return Files.lines(p);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	public static long count(Path p) throws Exception {
		return Files.list(p).filter(w -> Files.isRegularFile(w)).flatMap(s -> readLines(s)).count();
	}

	public final static void main(String[] day) throws Exception {
		System.out.print(count(Paths.get("/all-data")));
	}
}

// Ans: The number of lines in all files in a single directory
