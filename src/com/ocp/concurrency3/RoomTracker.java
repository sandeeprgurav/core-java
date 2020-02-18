package com.ocp.concurrency3;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.stream.IntStream;

public class RoomTracker {

	public static void await(CyclicBarrier cb) { // j1
		try {
			cb.await();
		} catch (InterruptedException | BrokenBarrierException e) {
			// Handle exception
		}
	}

	public static void main(String[] args) {
		CyclicBarrier cb = new CyclicBarrier(10, () -> System.out.println("Stock Room Full!")); // j2
		IntStream.iterate(1, i -> 1).limit(9).parallel().forEach(i -> await(cb)); // j3
	}
}
//ANS: It compiles but waits forever at runtime.
