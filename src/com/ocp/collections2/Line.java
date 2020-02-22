package com.ocp.collections2;

import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;

public class Line {
	   static BlockingDeque<Integer> queue = new LinkedBlockingDeque<>();
	   public static void main(String[] participants) throws Exception {
	      IntStream.iterate(1, i -> i+1).limit(5)
	         .parallel()
	         .forEach(s -> {
				
					try {
						queue.offerLast(s,10000,TimeUnit.MILLISECONDS);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}//this method required to handle try-catch
				
			});
	      IntStream.iterate(1, i -> 5).limit(10)
	         .parallel()
	         .forEach(s -> {
				try {
					queue.pollFirst(10,TimeUnit.SECONDS); //this method required to handle try-catch
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			});
	      System.out.print(queue.size());
	   }
	}

//Ans : The code does not compile.
