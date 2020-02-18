package com.ocp.functionalinterfaces8;

import java.util.function.Predicate;

class Tourist {
	   public Tourist(double distance) {
	      this.distance = distance;
	   }
	   public double distance;
	}

public class FunctionInterfaceTest1 {
	 private void saveLife(Predicate<Tourist> canSave, Tourist tourist) {
	      System.out.print(canSave.test(tourist) ? "Saved" : "Too far");  // y1
	   }
	   public final static void main(String... sand) {
	      new FunctionInterfaceTest1().saveLife(s -> s.distance<4, new Tourist(2));  // y2
	   }
}

// Ans: Saved
