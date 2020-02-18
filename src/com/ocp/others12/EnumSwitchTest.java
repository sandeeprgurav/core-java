package com.ocp.others12;

public class EnumSwitchTest {
	enum Flavors {
		VANILLA, CHOCOLATE, STRAWBERRY
	}

	public static void main(String[] args) {
		//Flavors f = Flavors.STRAWBERRY; // cant convert int into Flavor
		int f = Flavors.STRAWBERRY.ordinal();
		switch (f) {
		case 0:
			System.out.println("vanilla");
		case 1:
			System.out.println("chocolate");
		case 2:
			System.out.println("strawberry");
			break;
		default:
			System.out.println("missing flavor");
		}
	}
}

//Ans: The code does not compile.