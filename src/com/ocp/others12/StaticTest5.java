package com.ocp.others12;

public class StaticTest5 {
	private static int numShovels;
	private int numRakes;

	public static int getNumShovels() {
		return numShovels;
	}

	/*public static int getNumRakes() { //cant access nonstatic in static block
		return numRakes;
	}*/
}
// Non static inner class can have final static or nonstatic variables. Ans no
// static method for non static inner class.
// Ans: Line 4 generates a compiler error.
