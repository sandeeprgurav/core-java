package com.ocp.file7;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Collectors;

public class FileTest15 {

	public static void main(String[] real) throws Exception {
		Path p = Paths.get("/eclipse/projects");
		Files.walk(p)
		.map(z -> z.toAbsolutePath().toString())
		.filter(s -> s.endsWith(".java"))
		.collect(Collectors.toList()).forEach(System.out::println);

		Files.find(p,Integer.MAX_VALUE,
		(w,a) -> w.toAbsolutePath().toString().endsWith(".java"))
		.collect(Collectors.toList()).forEach(System.out::println);
	}
}

// Ans: Both statements compile but are unlikely to print the same results at runtime.
