package com.ocp.others12;

public class StaticTest3 {
	
	public static class Ship {
	      private enum Sail {  // w1
	         TALL {protected int getHeight() {return 100;}},
	         SHORT {protected int getHeight() {return 2;}};
	         protected abstract int getHeight();
	      }
	      public Sail getSail() {
	         return Sail.TALL;
	      }
	   }
	   public static void main(String[] stars) {
		   StaticTest3 bottle = new StaticTest3();
	      //Ship q = bottle.new Ship();  // w2
		  //System.out.print(q.getSail());
		  System.out.print(new Ship().getSail());		  
	   }
}
// The code does not compile because of line w2. 
