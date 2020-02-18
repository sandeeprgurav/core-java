package com.ocp.file7;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Collectors;

public class FileTest8 {
	public static void main(String[] args) throws IOException {
		Files.walk(Paths.get("..").toRealPath().getParent()) // u1
		.map(p -> p.toAbsolutePath().toString()) // u2
		.filter(s -> s.endsWith(".java")) // u3
		.collect(Collectors.toList())
		.forEach(System.out::println);
	}
}

// Ans: 1. It prints all .java files in the root directory tree. 2. It compiles but may throw an exception at runtime.