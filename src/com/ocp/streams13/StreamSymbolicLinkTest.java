package com.ocp.streams13;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Collectors;

public class StreamSymbolicLinkTest {
public static void main(String[] args) throws IOException {
	Path path = Paths.get("/monkeys");
	Files.find(path, 0, (p,a) -> a.isSymbolicLink()).map(p -> p.toString()) // y1
	.collect(Collectors.toList()) // y2
	.stream() // y3
	.filter(x -> x.toString().endsWith(".txt")) // y4
	.forEach(System.out::println);
}
}

// 	It will print nothing.