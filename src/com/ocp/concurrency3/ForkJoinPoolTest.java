package com.ocp.concurrency3;

import java.util.concurrent.RecursiveAction;

public class ForkJoinPoolTest extends RecursiveAction { // line n1
	static final int THRESHOLD_SIZE = 3;
	int stIndex, lstIndex;
	int[] data;

	public ForkJoinPoolTest(int[] data, int start, int end) {
		this.data = data;
		this.stIndex = start;
		this.lstIndex = end;
	}

	protected void compute() {
		int sum = 0;
		if (lstIndex>THRESHOLD_SIZE  ? stIndex <= THRESHOLD_SIZE : false) {
			for (int i = stIndex; i < lstIndex; i++) {
				sum += data[i];
			}
			System.out.println(sum);
		} else {
			new ForkJoinPoolTest(data, stIndex + THRESHOLD_SIZE, lstIndex).fork();
			new ForkJoinPoolTest(data, stIndex, Math.min(lstIndex, stIndex + THRESHOLD_SIZE)).compute();
		}
	}
		
}

// Ans : The program prints several values that total 55.