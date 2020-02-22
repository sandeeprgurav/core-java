package com.ocp.others12;

public class SwitchTest5 {

	public static void main(String[] args) {
		String color = "teal";
		switch (color) {
		case "red":
			System.out.print("red");			
		case "blue":
			System.out.print("blue");
			break;
		case "Teal":
			System.out.print("Teal");
			break;
		default:
			System.out.println("Default");
		}
	}
}

// Ans: Default
