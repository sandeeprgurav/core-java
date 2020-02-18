package com.ocp.concurrency3;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ExecutorServiceTest4 {
	public static void main(String[] args) throws InterruptedException, ExecutionException { 
		/*ScheduledExecutorService t = Executors
				  .newSingleThreadScheduledExecutor();
				Future result = t.execute(System.out::println); // cannot pass Syso since it returns void
				t.invokeAll(null);
				 t.scheduleAtFixedRate(() -> {return;}, 5, TimeUnit.MINUTES);*/
				 
				 // Actual: Runnable , long , long , TimeUnit
				 // Passed: Runnable , int, TimeUnit		
	}
}

// Ans: Two compile time error. 


