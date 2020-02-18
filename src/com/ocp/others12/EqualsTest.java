package com.ocp.others12;

public class EqualsTest {
	@Override
	public int hashCode() {
		return 5;
	}

	@Override
	// public boolean equals(EqualsTest o) { parameter must be Object
	public boolean equals(Object o) {
		return true;
	}
}
//None of the above. The code does not compile with any of the options.

