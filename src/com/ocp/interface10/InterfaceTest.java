package com.ocp.interface10;

public interface InterfaceTest {
	int amount = 10;

	//public static void eatGrass(); // body not defined  // line 3
	public static void eatGrass() {} 
	//public  int chew() {  //default not mentioned //line 4 
	  public default int chew() {  
		 return 13;
		  }
}

// Ans: The code will not compile because of lines 3 and 4.