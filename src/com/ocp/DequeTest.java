package com.ocp;

import java.util.concurrent.BlockingDeque;
import java.util.concurrent.TimeUnit;

public class DequeTest {
	public void addAndPrintItems(BlockingDeque<Integer> deque) throws InterruptedException { //Need to throw throws InterruptedException when use BlockingQueue
		deque.offer(103);
		deque.offerFirst(20, 1, TimeUnit.SECONDS);
		deque.offerLast(85, 7, TimeUnit.HOURS);
		System.out.print(deque.pollFirst(200, TimeUnit.NANOSECONDS));
		System.out.print(" " + deque.pollLast(1, TimeUnit.MINUTES));
	}
}
//Ans: The code will not compile.

