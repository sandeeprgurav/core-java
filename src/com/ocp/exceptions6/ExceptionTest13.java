package com.ocp.exceptions6;
class LostBallException1 extends Exception {}

public class ExceptionTest13 {
	//public void toss() throw LostBallException {  throw instead of throws
	public void toss() throws LostBallException1 {
	      throw new ArrayStoreException();
	   }
	   public static void main(String[] bouncy) {
	      try {
	         new ExceptionTest13().toss();
	      } catch (Throwable e) {
	         System.out.print("Caught!");
	      }
	   }
}

// Ans:The code does not compile for a different reason
