package com.ocp.file7;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.function.BiPredicate;
import java.nio.file.Paths;

public class FileTest6 {
	public static void main(String[] args) throws IOException {
		Path path = Paths.get("/animals");
		boolean myBoolean = Files.walk(path)
				// .filter((p,a) -> a.isDirectory() && !path.equals(p) ) // w1 // filter
				// supports Predicate which has single param
				.findFirst().isPresent(); // w2
		System.out.println(myBoolean ? "No Sub-directory" : "Has Sub-directory");
	}
}

// Ans:The code will not compile because of line w1.
