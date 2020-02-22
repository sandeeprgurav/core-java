package com.ocp.concurrency3;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorServiceTest8 {
	public void submitReports() throws InterruptedException, ExecutionException { // Need to throw Exception
		ExecutorService service = Executors.newCachedThreadPool();
		Future bosses = service.submit(() -> System.out.print(""));
		service.shutdown();
		System.out.print(bosses.get());
	}

	public static void main(String[] memo) throws InterruptedException, ExecutionException { // Need to throw Exception
		new ExecutorServiceTest8().submitReports();
	}
}

// Ans: The code does not compile. Future get() method throws exceptions so need
// to catch else compile error.
