package com.ocp.file7;

import java.io.Console;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileTest22 {
	// Assuming the current working directory is /home, then what is the output of
	// the following program?
	public String doTrick(Path path) {
		// return path.subpath(2, 3).getName(1).toAbsolutePath().toString();
		// IllegalArgException runtime since path.subpath(2, 3) returns single name and
		// on that getName(1) will throw IllegealArgException.

		return path.subpath(2,3).getName(0).toAbsolutePath().toString(); // if get getName(0) then output will be /home/tricks

	}

	public static void main(String... cards) {
		final FileTest22 m = new FileTest22();
		System.out.print(m.doTrick(Paths.get("/bag/of/tricks/.././disappear.txt")));
	}
}
// Options: 1. The code does not compile. 2. /home 3. The code compiles but
// prints an exception at runtime.
// 4. /home/tricks
// Ans:The code compiles but prints an exception at runtime.
