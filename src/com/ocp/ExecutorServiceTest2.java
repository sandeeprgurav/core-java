package com.ocp;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorServiceTest2 {
public static void main(String[] args) throws InterruptedException, ExecutionException { // Need to throw or cathc exception when we get value from Future object
	Callable c = new Callable() {
		//   public Object run() {return 10;}  // Throws Exception missing 

		@Override
		public Object call() throws Exception { 
			return 10;
		}
		};
		ExecutorService s = Executors.newScheduledThreadPool(1);
		for(int i=0; i<10; i++) {
		   Future f = s.submit(c);
		   f.get();
		}
		s.shutdown();
		System.out.print("Done!");
}
}

//Ans: The code does not compile.
