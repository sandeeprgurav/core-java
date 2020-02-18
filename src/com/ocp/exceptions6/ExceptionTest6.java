package com.ocp.exceptions6;

class LostBallException extends Exception {}

public class ExceptionTest6 {
	//public void toss() throw LostBallException { throw instead of throws
	  public void toss() throws LostBallException {
	      throw new ArrayStoreException();
	   }
	   public static void main(String[] bouncy) {
	      try {
	         new ExceptionTest6().toss();
	      } catch (Throwable e) {
	         System.out.print("Caught!");
	      }
	   }
}

//Ans: The code doesnt compile for a different reason.  

