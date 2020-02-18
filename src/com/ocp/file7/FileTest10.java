package com.ocp.file7;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileTest10 {
	public void jenniferReads(Path p) throws IOException {
		Files.lines(p);
	}

	public void jonReads(Path p) throws IOException {
		Files.readAllLines(p);
	}

	public static void main(String[] pages) throws IOException {
		Path p = Paths.get("/bookshelf/mobydick.txt");
		final FileTest10 r = new FileTest10();
		r.jenniferReads(p);
		r.jonReads(p);
	}
}

// Ans: The code does not compile.  Remember IOException is mandatory to handle when access the file
