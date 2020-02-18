package com.ocp.assert1;

public class Assert {

	private int addPlusOne(int a, int b) {
		//boolean assert = false;  //compile time rror since assert is keywork so cant use as variable.
		assert a++ > 0;
		assert b > 0;
		return a + b;
	}
	
}
