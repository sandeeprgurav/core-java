package com.ocp.others12;

public class EqualsTest2 {
	private String city, mascot;
	private int numberOfPlayers;

	public boolean equals(Object obj) {
		if (!(obj instanceof EqualsTest2))
			return false;
		EqualsTest2 other = (EqualsTest2) obj;
		return (city.equals(other.city) && mascot.equals(other.mascot));
	}

	public int hashCode() {
		return numberOfPlayers;
	}
	// imagine getters and setters are here
}
// Ans: The class compiles but has an improper hashCode() method.


