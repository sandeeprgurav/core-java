package com.ocp.others12;

public class EqualsTest3 {
	public int employeeId;
	public String firstName, lastName;
	public int yearStarted;

	@Override
	public int hashCode() {
		return employeeId;
	}
	
	public boolean equals(EqualsTest3 e) {
		return this.employeeId == e.employeeId;
	}

	public static void main(String[] args) {
		EqualsTest3 one = new EqualsTest3();
		one.employeeId = 101;
		EqualsTest3 two = new EqualsTest3();
		two.employeeId = 101;
		if (one.equals(two))
			System.out.println("Success");
		else
			System.out.println("Failure");
	}
}
// Ans: Success
