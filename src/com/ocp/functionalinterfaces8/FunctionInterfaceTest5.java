package com.ocp.functionalinterfaces8;

interface Secret {
	String magic(double d);
}

public class FunctionInterfaceTest5 implements Secret {
	public String magic(double d) {
		System.out.println("inside class");
		return "Poof1";
	}

	public static void main(String[] args) {
		Secret sec = (e) -> {
			System.out.println("Autonomus Implementation");
			String f = "";
			return "Poof";
		};
		Secret sec1 = (e) -> "Poof";
		sec.magic(12.00);
		sec1.magic(12.00);
	}
}
