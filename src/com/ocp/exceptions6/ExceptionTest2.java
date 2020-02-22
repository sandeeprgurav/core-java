package com.ocp.exceptions6;

public class ExceptionTest2 {
	   static void makeCall() throws RuntimeException {
	      throw new ArrayIndexOutOfBoundsException("Call");
	   }
	   public static void main(String[] messages) {
	      try {
	         makeCall();
	      }
	      /* catch (MissedCallException e) { // Unreacheabke Exception since RuntimeException is not cached by Exception class 
	         throw new RuntimeException("Voicemail");
	      }*/
	      finally {
	         throw new RuntimeException("Text");
	      }
	   }
	}

//Ans : 	The code does not compile.
