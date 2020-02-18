package com.ocp.others12;

public class StringTest {
	public static void main(String[] args) {		
		String message = "Hi everyone!";
		System.out.println("message = " + message.replace("e", "X")); // returns message = Hi XvXryonX!
		System.out.println("message = " + message.replaceAll("e", "X")); // returns message = Hi XvXryonX!
	}
}
