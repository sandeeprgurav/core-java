package com.ocp.interface10;

interface Doable{
	public void doSomething(String s);
}

public abstract class AbstractionTest implements Doable{
  // no mandatorily implement interface in abstarct class can delegate to subclass implementation.
	
	//abstarct class can have static methods
	static void test() {
		
	}
	
}
