package com.ocp.concurrency3;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorServiceTest9 {
	 public void sleep() {
	      try {
	         Thread.sleep(5000);
	      } catch (Exception e) {}
	   }
	   public String getQuestion(ExecutorServiceTest9 r) {
		   //synchronized {  either with (this) or (ExecutorServiceTest9.class) else compile error
	      synchronized (this) {
	         sleep();
	         if(r != null) r.getAnswer(null);
	         return "How many programmers does it take "
	               + "to change a light bulb?";
	      }
	   }
	   public synchronized String getAnswer(ExecutorServiceTest9 r) {
	      sleep();
	      if(r != null) r.getAnswer(null);
	      return "None, that's a hardware problem";
	   }
	 
	   public static void main(String... ununused) {
	      final ExecutorServiceTest9 r1 = new ExecutorServiceTest9();
	      final ExecutorServiceTest9 r2 = new ExecutorServiceTest9();
	      ExecutorService s = Executors.newFixedThreadPool(2);
	      s.submit(() -> r1.getQuestion(r2));
	      s.execute(() -> r2.getAnswer(r1));
	      s.shutdown();
	   }
}

// Ans: The code does not compile. Future get() method throws exceptions so need
// to catch else compile error.
