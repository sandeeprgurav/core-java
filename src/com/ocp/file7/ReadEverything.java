package com.ocp.file7;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class ReadEverything {
	public void readFile(Path p) {
		try {
			//Files.readAllLines(p).parallel().forEach(System.out::println); //no parallel() method, parallelStream() exist 
		} catch (Exception e) {
		}
	}

	public void read(Path directory) throws Exception {
		//Files.walk(directory).filter(p -> File.isRegularFile(p)).forEach(x -> readFile(x)); //File.isRegularFile(p)) No such method, Files has 
	}

	public static void main(String... books) throws IOException {
		//Path p = Path.get("collection"); //Path.get no such method   
		//new ReadEverything().read(p);
	}
}

//Four compilation error
