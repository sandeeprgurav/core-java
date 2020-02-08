package com.ocp;

public class EnumTest2 {
	enum Flavors {
		VANILLA, CHOCOLATE, STRAWBERRY
	}

	public static void main(String[] args) {
		System.out.println(Flavors.CHOCOLATE.ordinal()); //ordinal tells the index of enum element starting from 0
	}
}

//Ans: 1