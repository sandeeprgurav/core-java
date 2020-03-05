package com.ocp.exceptions6;

public class ExceptionTest12 {
	class BearException extends RuntimeException {}
	   class WolfException extends RuntimeException {}
	   class DragonException extends RuntimeException {}
	   public int tellStory() {
	      try {} catch (BearException d) {
	        // d = new RuntimeException();   // canot assign superclass to subclass
	         throw d;
	      } catch (WolfException | DragonException e) {
	         //e = new RuntimeException(); canont assign any value to e 
	         throw e;
	      }
	      return 3;
	   }
	   public static void main(String... wand) throws RuntimeException{
	      new ExceptionTest12().tellStory();
	   }
}

// Ans: None of the above; the code does not compile.
