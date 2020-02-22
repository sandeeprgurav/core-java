package com.ocp.functionalinterfaces8;

interface Pump {
	void pump(double psi);
}

interface Bend extends Pump {
	void bend(double tensileStrength);
}

public class FunctionInterfaceTest9 {
	public static final void apply(Bend instruction, double input) { // r1
		instruction.bend(input);
	}

	public static void main(String... future) {
		final FunctionInterfaceTest9 r = new FunctionInterfaceTest9();
		// r.apply(x -> System.out.print(x+" bent!"), 5); Lambdata expression fail since
		// Bend is not a functional interface.
	}
}

// Ans:The code does not compile because Bend is not a functional interface.
