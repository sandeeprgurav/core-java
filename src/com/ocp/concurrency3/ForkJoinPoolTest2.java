package com.ocp.concurrency3;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveAction;

public class ForkJoinPoolTest2 extends RecursiveAction {
	static int[] sheep = new int[] { 1, 2, 3, 4 };
	final int start;
	final int end;
	int count = 0;

	public ForkJoinPoolTest2(int start, int end) {
		this.start = start;
		this.end = end;
	}

	public void compute() {
		if (end - start < 2) {
			count += sheep[start];
			System.out.println("count inside compute ==>>" +count);
			return;
		} else {
			int middle = start + (end - start) / 2;
			invokeAll(new ForkJoinPoolTest2(start, middle), new ForkJoinPoolTest2(middle, end));
		}
	}

	public static void main(String[] night) {
		ForkJoinPool pool = new ForkJoinPool();
		ForkJoinPoolTest2 action = new ForkJoinPoolTest2(0, sheep.length);
		pool.invoke(action);
		pool.shutdown();
		System.out.print(action.count);
	}
}

//Ans: 0