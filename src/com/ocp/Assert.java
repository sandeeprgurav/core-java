package com.ocp;

public class Assert {

	private int addPlusOne(int a, int b) {
		//boolean assert = false;
		assert a++ > 0;
		assert b > 0;
		return a + b;
	}
	
}
