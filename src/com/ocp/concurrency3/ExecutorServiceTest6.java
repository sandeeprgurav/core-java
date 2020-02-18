package com.ocp.concurrency3;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ExecutorServiceTest6 {
	  int stroke = 0;
	   public synchronized void swimming() {
	      stroke++;
	   }
	   public static void main(String... laps) {
	      ExecutorService s = Executors.newFixedThreadPool(10);
	      ExecutorServiceTest6 a = new ExecutorServiceTest6();
	      for(int i=0; i<1000; i++) {
	         s.execute(() -> a.swimming());
	      }
	      s.shutdown();
	      System.out.print(a.stroke);
	   }
}

// Ans:The result is unknown until runtime for some other reason.
