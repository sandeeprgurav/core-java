package com.ocp;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class ExecutorServiceTest1 {
public static void main(String[] args) {
	/*ExecutorService service = Executors.newSingleThreadScheduledExecutor();
		service.scheduleWithFixedDelay(() -> { // w1
		System.out.println("Open Zoo");
		return null; // w2
	}, 0, 1, TimeUnit.MINUTES);
	Future<?> result = service.submit(() -> System.out.println("Wake Staff")); // w3
	System.out.println(result.get()); // w4
*/}
}

//Ans:  Line W1 and W2 need to correct to code compile
