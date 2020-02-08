package com.ocp;

import java.util.function.Supplier;

public class Ready1 {
	   private static double getNumber() {
	      return .007;
	   }
	   public static void math() {
	     // Supplier<double> s = Ready1:getNumber; // : instead of :: AND genericType double should not be primitive.
		   Supplier<Double> s = Ready1::getNumber; 
	      double d = s.get();
	      System.out.println(d);
	   }
	}
//Ans: Two