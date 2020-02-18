package com.ocp.file7;

import static java.nio.file.StandardCopyOption.*;
import static java.nio.file.Files.*;
import java.io.*;
import java.nio.file.*;

public class FileTest2 {
	public static void main(String[] args) throws IOException {
		final Path s = new File("apples.zip").toPath();
		final Path t = FileSystems.getDefault().getPath("oranges.zip");
		copy(s, t, REPLACE_EXISTING); // q1
//		copy(Files.newBufferedReader(t), t, ATOMIC_MOVE); // q2
		// method params Path, Path, CopyOption... not matching	BufferedReader, Path, StandardCopyOptio 
	}

}

// Ans: Line q2 does not compile