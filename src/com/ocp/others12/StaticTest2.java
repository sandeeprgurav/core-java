package com.ocp.others12;

public class StaticTest2 {
	
	  private static void drive() {
		  /*static {
		        System.out.println("static");
		     }*/       
	       System.out.println("fast");
	   }
	   public static void main(String[] args) {
	      drive();
	      drive();
	   }
}
// Can not have static block inside the method. 
