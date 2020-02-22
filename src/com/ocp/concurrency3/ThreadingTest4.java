package com.ocp.concurrency3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreadingTest4<T> {
	private List<T> data;
	private boolean foundMatch = false;

	public ThreadingTest4(List<T> list) {
		this.data = list;
	}

	public void exists(T value, int start, int end) {
		if (end - start <= 1) {
			foundMatch = foundMatch || value.equals(data.get(start));
		} else {
			final int middle = start + (end - start) / 2;
			new Thread(() -> exists(value, start, middle)).run();
			new Thread(() -> exists(value, middle, end)).run();
		}
	}

	public static void main(String[] a) throws Exception {
		List<Integer> data = Arrays.asList(1, 2, 3, 4, 5, 6);
		ThreadingTest4<Integer> t = new ThreadingTest4<Integer>(data);
		t.exists(5, 0, data.size());
		System.out.print(t.foundMatch);
	}
}

// Ans: true
