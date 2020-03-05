package com.ocp.others12;

public class EqualsTest {
	@Override
	public int hashCode() {
		return 5;
	}

	
	// public boolean equals(EqualsTest o) { //parameter must be Object
	//@Override
	public boolean equals1(Object o) {
		return true;
	}
	
	public static void main(String[] args) {
		EqualsTest obj = new EqualsTest();
		EqualsTest obj1 = new EqualsTest();
		System.out.println(obj.equals1(obj1));
		
	}
}
//None of the above. The code does not compile with any of the options.

