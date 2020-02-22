package com.ocp.concurrency3;

import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

public class ExecutorServiceTest11 {
	private void waitTillFinished(CyclicBarrier c) {
		try {
			c.await();
			System.out.print("1");
		} catch (Exception e) {
		}
	}

	public void row(ExecutorService service) {
		final CyclicBarrier cb = new CyclicBarrier(5);
		IntStream.iterate(1, i -> i + 1).limit(12).forEach(i -> service.submit(() -> waitTillFinished(cb)));
	}

	public static void main(String[] oars) {
		ExecutorService service = null;
		try {
			service = Executors.newCachedThreadPool();
			new ExecutorServiceTest11().row(service);
		} finally {
			service.isShutdown();
		}
	}
}

// Ans:10

/*
 * Options: 1. None of the above 2. 12 3. 0 4. 10
 */