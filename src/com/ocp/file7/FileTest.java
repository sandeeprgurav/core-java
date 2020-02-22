package com.ocp.file7;

import java.io.BufferedReader;
import java.io.Writer;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileTest {
	public static void copy(Path source, Path target) throws Exception {
		try (BufferedReader r = Files.newBufferedReader(source); Writer w = Files.newBufferedWriter(target)) {
			String temp = null;
			while ((temp = r.readLine()) != null) {
				w.write(temp);
			}
		}
	}

	public static void main(String[] tooMany) throws Throwable {
		Rewriter.copy(Paths.get("/original.txt"), FileSystems.getDefault().getPath("/", "unoriginal.txt"));
	}
}

/* Options:
1. The implementation correctly copies a regular file.
2. The class compiles without issue.
3. The class never throws an exception at runtime.
4. All of the above*/

// Ans: The class compiles without issue.
