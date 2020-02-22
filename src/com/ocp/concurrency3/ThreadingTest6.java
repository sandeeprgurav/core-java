package com.ocp.concurrency3;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;

public class ThreadingTest6 implements Runnable {
	String fName;

	public ThreadingTest6(String fName) {
		this.fName = fName;
	}

	public void run() {
		System.out.println(fName);
	}

	public static void main(String[] args) throws IOException, InterruptedException {
		ExecutorService executor = Executors.newCachedThreadPool();
		Stream<Path> listOfFiles = Files.walk(Paths.get("Java Projects"));
		listOfFiles.forEach(line -> {
			executor.execute(new ThreadingTest6(line.getFileName().toString())); // line n1
		});
		executor.shutdown();
		executor.awaitTermination(5, TimeUnit.DAYS);// line n2
	}
}
// Ans:The program prints files names concurrently.
