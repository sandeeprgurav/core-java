package com.ocp.streams13;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

public class StreamIntStreamTest2 {
	 long ticketsSold;
	   final AtomicInteger ticketsTaken;
	   public StreamIntStreamTest2() {
	      ticketsSold = 0;
	      ticketsTaken = new AtomicInteger(0);
	   }
	   public void performJob() {
	      IntStream.iterate(1, p -> p+1)
	         .parallel()
	         .limit(10)
	         .forEach(i -> ticketsTaken.getAndIncrement());
	      IntStream.iterate(1, q -> q+1)
	         .limit(50)
	         .parallel()
	         .forEach(i -> ++ticketsSold);
	      System.out.print(ticketsTaken+" "+ticketsSold);
	   }
	   public static void main(String[] matinee) {
	      new StreamIntStreamTest2().performJob();
	   }
}
/*
1. The class compiles and runs without throwing an exception.
2. The first number printed is consistently 10.
3. The second number printed is consistently 5.*/

//Ans: I and II.  

