package com.ocp.concurrency3;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class ExecutorServiceTest10 {
	private ExecutorService service = Executors.newCachedThreadPool();
	   public void planEvents() {
	      /*service.scheduleWithFixedDelay(  // these both methods are not present for  ExecutorService
	            () -> System.out.print("Check food stock"),
	            1, TimeUnit.HOURS);
	      service.scheduleAtFixedRate(
	            () -> System.out.print("Check drink stock"),
	            1, 1000, TimeUnit.SECONDS);*/
	      service.execute(() -> System.out.print("Take out trash"));
	   }
}

// Ans:The execute() method call compiles.