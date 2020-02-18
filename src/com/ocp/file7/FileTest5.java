package com.ocp.file7;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileTest5 {
	public String getNameQuick() throws IOException {
		final BufferedReader r = new BufferedReader(new FileReader("saved.name"));
		final String name = r.readLine();
		// r.flush(); Reader doesnt have fluhs() method
		return name;
	}

	public String getNameSafely() throws IOException {
		try (final BufferedReader r = new BufferedReader(new FileReader("saved.name"))) {
			final String name = r.readLine();
			// r.flush(); Reader doesnt have fluhs() method
			return name;
		}
	}
}

// Ans: Neither method compiles.