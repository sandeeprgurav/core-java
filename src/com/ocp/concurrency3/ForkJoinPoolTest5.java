package com.ocp.concurrency3;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.RecursiveAction;
import java.util.concurrent.RecursiveTask;

class MyTask extends ForkJoinTask {

	@Override
	protected boolean exec() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Object getRawResult() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected void setRawResult(Object arg0) {
		// TODO Auto-generated method stub

	}

}

public class ForkJoinPoolTest5 extends RecursiveTask {
	private Integer[] elements;
	private int a;
	private int b;
	private  int min;

	public ForkJoinPoolTest5(Integer[] elements, int a, int b) {
		this.elements = elements;
		this.a = a;
		this.b = b;
	}

	public Integer compute() {
		if ((b - a) < 2) {
			min =  Math.min(elements[a], elements[b]);
			return min;
		}else {
			int m = a + ((b - a) / 2);
			System.out.println(a + "," + m + "," + b);
			RecursiveTask t1 = new ForkJoinPoolTest5(elements, a, m);
			int result = (int) t1.fork().join();
			return Math.min(new ForkJoinPoolTest5(elements, m, b).compute(), result);
		}
	}

	public static void main(String[] args) throws InterruptedException,
	ExecutionException {
	Integer[] elements = new Integer[] { 8, -3, 2, -54 };
	ForkJoinPoolTest5 task = new ForkJoinPoolTest5(elements, 0, elements.length-1);
	ForkJoinPool pool = new ForkJoinPool(1);
	Integer sum = (Integer) pool.invoke(task);
	System.out.println("Min: " + sum);
	System.out.println("Static Min: " + task.min);
	}
}

// Ans: 1. MyTask inherits RecursiveTask. 2. The code correctly finds the minimum value in the array.



