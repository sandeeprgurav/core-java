package com.ocp.functionalinterfaces8;

import java.util.function.IntUnaryOperator;

public class FunctionInterfaceTest10 {
	private static int AT_CAPACITY = 100;
	   public int takeTicket(int currentCount, IntUnaryOperator counter) {  //IntUnaryOperator<Integer> here <Integer> should not be passed 
	      return counter.applyAsInt(currentCount);
	   }
	   public static void main(String...theater) {
	      final FunctionInterfaceTest10 bob = new FunctionInterfaceTest10();
	      final int oldCount = 50;
	      final int newCount = bob.takeTicket(oldCount,t -> {
	         if(t>AT_CAPACITY) {
	            throw new RuntimeException("Sorry, max has been reached");
	         }
	         return t+1;
	      });
	      System.out.print(newCount);
	   }
}

//Ans:The code does not compile for a different reason.

