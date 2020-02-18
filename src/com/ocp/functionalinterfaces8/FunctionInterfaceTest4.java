package com.ocp.functionalinterfaces8;

interface AddNumbers {
	int add(int x, int y);
	
	static int subtract(int x, int y) {
		return x - y;
	}

	default int multiply(int x, int y) {
		return x * y;
	}
}

public class FunctionInterfaceTest4 {
	protected void calculate(AddNumbers add, int a, int b) {
		System.out.print(add.add(a, b));
	}

	public static void main(String[] moreNumbers) {
		final FunctionInterfaceTest4 ti = new FunctionInterfaceTest4();
		ti.calculate((k, p) -> p + k + 1, 2, 5); // j1
	}	
}

// Ans: 8