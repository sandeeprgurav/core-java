package com.ocp.concurrency3;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ExecutorServiceTest5 {
	static int cookies = 0;

	public synchronized void deposit(int amount) {
		cookies += amount;
	}

	public static synchronized void withdrawal(int amount) {
		cookies -= amount;
	}

	public static void main(String[] amount) throws Exception {
		ExecutorService teller = Executors.newScheduledThreadPool(50);
		ExecutorServiceTest5 bank = new ExecutorServiceTest5();
		for (int i = 0; i < 25; i++) {
			teller.submit(() -> bank.deposit(5));
			teller.submit(() -> bank.withdrawal(5));
		}
		teller.shutdown();
		teller.awaitTermination(10, TimeUnit.SECONDS);
		System.out.print(bank.cookies);
	}
}

// Ans: The result is unknown until runtime.
