package com.ocp.file7;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

public class FileTest14 {

	public static void main(String[] real) throws Exception {
		try (InputStream is = new FileInputStream("prime6.txt")) {
			is.skip(1);
			is.read();
			is.skip(1);
			is.read();
			is.mark(4);
			is.skip(1);
			is.reset();
			System.out.print(is.read());
		}
	}
}

// Ans: prime6.txt (The system cannot find the file specified) Though it is exist
//The code compiles but throws an exception at runtime.
