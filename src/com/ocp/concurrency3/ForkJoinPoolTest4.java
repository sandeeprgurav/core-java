package com.ocp.concurrency3;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.RecursiveAction;
import java.util.concurrent.RecursiveTask;

public class ForkJoinPoolTest4 extends RecursiveTask<String> {
	   final int remainder;
	   public ForkJoinPoolTest4(int remainder) {  // j2
	      this.remainder = remainder;
	   }
	   protected String compute() {
	      if (remainder <= 1)
	         return "1";
	      else {
	    	  ForkJoinPoolTest4 otherTask = new ForkJoinPoolTest4(remainder - 1);
	         String otherValue = otherTask.fork().join();  // j3
	         return otherValue
	            + new ForkJoinPoolTest4(remainder - 2).compute();
	      }
	   }
	   public static void main(String[] purpose) {
	      ForkJoinPool pool = new ForkJoinPool();
	      ForkJoinTask<?> task = new ForkJoinPoolTest4(10);
	      System.out.println(pool.invoke(task));
	      pool.shutdown();
	   }
}

// Ans: The code compiles but does not implement the fork/join framework in a proper multi-threaded manner.