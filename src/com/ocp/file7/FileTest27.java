package com.ocp.file7;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;
import java.util.stream.Stream;

public class FileTest27 {
	public static void main(String[] args) throws IOException {
		//Stream<Path> files1 = Files.find(Paths.get("D:\\report\\fy2014.txt"));
		Stream<Path> files2 = Files.walk(Paths.get("D:\\report")); //correct
		//Stream<Path> files3 = Files.walk(Paths.get("D:\\report"), 3, (p, a) -> p.isRegularFile());
		//Stream<Path> files4 = Files.walk(Paths.get("D:\\report"), 3, (p, a) -> a.isRegularFile());
	}
}

// Ans: Two Errors




