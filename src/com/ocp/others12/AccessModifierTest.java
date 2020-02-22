package com.ocp.others12;

class Caller{
	private void init() {
		System.out.println("initialized!");
	}
	
	public void start() {
		init();
		System.out.println("started");
	}
}

public class AccessModifierTest {
public static void main(String[] args) {
	Caller c = new Caller();
	c.start();
	//c.init(); //init method is not accessible
}
}

// Ans: Compilation Fail
