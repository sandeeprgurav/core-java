package com.ocp.file7;

import java.nio.file.Path;
import java.nio.file.Paths;

public class FileTest16 {

	public static void main(String[] holidays) throws Exception {
		Path p1 = Paths.get("./found/../keys");
		Path p2 = Paths.get("/lost/blue.txt");
		System.out.println(p1.resolve(p2));
		System.out.println(p2.resolve(p1));
	}
}

// Ans: \lost\blue.txt
// \lost\blue.txt\.\found\..\keys

/* Notes: 
 * First case. If we have an absolute path and we want to combine it with a
 * second path that doesn't have a root element (a partial path), the second
 * path is appended:
 * 
 * Path path = Paths.get("/temp"); System.out.println(path.resolve("newDir"));
 * // /temp/newDir
 * 
 * Second case. If we have a partial or relative path, and we want to combine it
 * with an absolute path, this absolute path is returned:
 * 
 * Path path = Paths.get("newDir"); System.out.println(path.resolve("/temp"));
 * // /temp
 */