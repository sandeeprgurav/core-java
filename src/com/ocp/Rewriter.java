package com.ocp;

import java.io.BufferedReader;
import java.io.Writer;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Rewriter {
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

//The class compiles without issue. 