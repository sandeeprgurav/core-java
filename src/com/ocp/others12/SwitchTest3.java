package com.ocp.others12;

public class SwitchTest3 {
	public static void main(String[] args) {
		String str = null;
		switch (str) {
		case "":
			System.out.print("blank");			
		case "null":
			System.out.print("Two");
		default: 
			System.out.println("invalid");
		}

	}
}

// Ans: Nullpointer Exception >> An exception is thrown at runtime. 

