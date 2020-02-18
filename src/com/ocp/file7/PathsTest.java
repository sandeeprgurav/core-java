package com.ocp.file7;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathsTest {
public static void main(String[] args) {
	Path p1 = Paths.get("./locks");
	Path p2 = Paths.get("/found/red.zip");
	System.out.println(p1.relativize(p2));
	System.out.println(p2.relativize(p1));
}
}

// Ans: None of the above (compile time error)
