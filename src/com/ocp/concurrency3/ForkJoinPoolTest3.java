package com.ocp.concurrency3;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.RecursiveAction;

public class ForkJoinPoolTest3 extends RecursiveAction {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int start;
	private int end;

	public ForkJoinPoolTest3(int start, int end) {
		this.start = start;
		this.end = end;
	}

	protected void compute() {
		if (start < 0) {  // this condition will never satisfy it will keep on executing and will throw runtime exception. 			
			return ;
		} else {
			int middle = start + ((end - start) / 2);
			invokeAll(new ForkJoinPoolTest3(start, middle), new ForkJoinPoolTest3(middle, end)); // m1
		}
	}

	public static void main(String[] args) {
		ForkJoinTask<?> task = new ForkJoinPoolTest3(0, 4); // m2
		ForkJoinPool pool = new ForkJoinPool();
		Object result = pool.invoke(task); // m3
		
	}
}

// Ans: It compiles but throws an exception at runtime.
/*
 * Exception in thread"ForkJoinPool-1-worker-1"java.lang.NoClassDefFoundError:
 * Could not initialize class
 * java.util.concurrent.locks.AbstractQueuedSynchronizer$Node
 */