package com.ocp.others12;

public class StaticTest4 {
	private int x = 5;

	protected class Inner {
		// public static int x = 10; // Compile error at line 4
		public int x = 10;

		public void go() {
			System.out.println(x);
		}
	}

	public static void main(String[] args) {
		StaticTest4 out = new StaticTest4();
		StaticTest4.Inner in = out.new Inner();
		in.go();
	}
}
// Non static inner class can have final static or nonstatic variables. Ans no
// static method for non static inner class.
//Ans: Line 4 generates a compiler error.


