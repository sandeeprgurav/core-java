package com.ocp.file7;

import java.io.Console;

public class FileTest21 {
	public static void main(String... dontDoThis) throws Exception {
		// What is the output of the following application? Assume the System.console()
		// is available and the user enters badxbad and presses Enter.
		Console c = System.console();
		if (c != null) {
			c.writer().write('P');
			c.writer().write('a');
			c.writer().write('s');
			c.writer().write('s');
			c.writer().flush(); // t1
			int i;
			StringBuilder sb = new StringBuilder();
			while ((i = c.reader().read()) != 'x') { // t2
				sb.append((char) i);
			}
			c.writer().format("Result: %s", sb.toString());
		}
	}
}

// Ans:Result: bad
