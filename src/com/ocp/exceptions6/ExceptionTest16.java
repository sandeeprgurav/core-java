package com.ocp.exceptions6;

import java.io.IOException;

public class ExceptionTest16 {
	class AddingException extends Exception {};
	   class DividingException extends Exception {};
	   class UnexpectedException extends RuntimeException {};
	   public void doTaxes() throws Throwable {
	      try {
	         throw new IllegalStateException();
	      }/* catch (AddingException | DividingException e) {  // p1 // Unreacheable Exception
	         System.out.println("Math Problem");
	      } catch (UnexpectedException f) {  // p2 // UnexpectedException is unreacheable due to Exception
	         System.out.println("Unknown Error");
	         throw f;
	      }*/
	      finally{
	    	  
	      }
	   }
	   public static void main(String[] numbers) throws Throwable {
	      try {
	         new ExceptionTest16().doTaxes();
	      } finally {
	         System.out.println("All done!");
	      }
	   }
}

// Ans:The code does not compile due to lines p1



