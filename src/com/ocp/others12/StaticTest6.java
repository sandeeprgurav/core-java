package com.ocp.others12;

public class StaticTest6 {
	

	StaticTest6() {
		x = 5;
	}

	static int x = 0;

	public static void main(String[] args) {
		//StaticTest6 mec = new StaticTest6();
		System.out.println(x);
	}

	static {
		x = 10;
	}
	static {
		x = 15;
	}
}
// Non static inner class can have final static or nonstatic variables. Ans no
// static method for non static inner class.
// Ans: Line 4 generates a compiler error.
