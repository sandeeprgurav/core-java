package com.ocp.streams13;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

public class StreamIntStreamTest {
	private static void await(CyclicBarrier b) {
		try {
			b.await();			
		} catch (InterruptedException | BrokenBarrierException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] chalk) {
	      ExecutorService s = Executors.newFixedThreadPool(1);
	      final CyclicBarrier b = new CyclicBarrier(4,
	         () -> System.out.print("Jump!"));
	      IntStream
	         .iterate(1, q -> 2)
	         .limit(12)
	         .forEach(q -> s.execute(()->await(b)));
	      s.shutdown();
	      
	   }
}
//Ans: None of the above

/*Jump!Jump! printed twice and hangs */