package com.ocp;

public class SwitchTest {
	public static void main(String[] args) {

		String s = "A";
		switch (s) {
		case "a":
			System.out.print("simaple A ");
		default:
			System.out.print("default ");
		case "A":
			System.out.print("Capital A ");
		}

	}
}

// Ans: Capital A 

