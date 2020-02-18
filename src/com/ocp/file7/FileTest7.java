package com.ocp.file7;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class FileTest7 {
	public static void main(String[] args) throws IOException {
		Writer w = new FileWriter("couch.txt");
		try (BufferedWriter bw = new BufferedWriter(w)) {
			bw.write("Blue coach on Sale!");
		} finally {
			w.flush(); // This flush is creating stream closed IOException
			w.close();			
		}
		System.out.print("Done!");
	}
}

// Ans: The code compiles but throws an exception at runtime.