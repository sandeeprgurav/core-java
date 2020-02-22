package com.ocp.file7;

import java.nio.file.Path;
import java.nio.file.Paths;

public class FileTest19 {
	public Path makeAbsolute(Path p) {
		if (p != null && !p.isAbsolute())
			return p.toAbsolutePath();
		return p;
	}
}

// Ans: The method compiles and returns a Path value that is always equivalent to the input argument.


