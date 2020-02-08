package com.ocp;

abstract class TShirt {
	   abstract int insulate();
	   public TShirt() {
	      System.out.print("Starting...");
	   }
	}
	public class InheritanceTest6 {
	   abstract class Sweater extends TShirt {
	      int insulate() {return 5;}
	   }
	   //private static void dress() {  // static method can not have non static class
	   private void dress() {
	      class Jacket extends Sweater {  // v1	    	  
	         int insulate() {return 10;}
	      };
	      final TShirt outfit = new Jacket() {  // v2
	         int insulate() {return 20;}
	      };
	      System.out.println("Insulation:"+outfit.insulate());
	   }
	   public static void main(String... snow) {
		
	      new InheritanceTest6().dress();
	   }
	}
// Ans: The code does not compile because of line v1.
