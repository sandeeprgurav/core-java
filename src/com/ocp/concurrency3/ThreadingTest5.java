package com.ocp.concurrency3;

public class ThreadingTest5<T> {
	public static void main(String[] a) {
		Runnable r = () -> System.out.println("L1");
		new Thread(r).start();

		new Thread(() -> {
			System.out.println("L2");
		}).start();

		System.out.println("L3");
	}
}

// Ans: true
