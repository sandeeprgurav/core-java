package com.ocp.functionalinterfaces8;

import java.util.function.DoubleToIntFunction;

public class FunctionInterfaceTest16 {
	private int savingsInCents;

	private static class ConvertToCents {
		// static DoubleToIntFunction f = p -> p*100; // p*100 p is double which
		// multiple by int will return Double, need to cast (int) to get int in returns
		static DoubleToIntFunction f = p -> (int) p * 100; 
	}

	public static void main(String... currency) {
		FunctionInterfaceTest16 creditUnion = new FunctionInterfaceTest16();
		creditUnion.savingsInCents = 100;
		double deposit = 1.5;

		creditUnion.savingsInCents += ConvertToCents.f.applyAsInt(deposit); // j1
		System.out.print(creditUnion.savingsInCents);
	}
}
//Options: 1. 200 2. None of the above 3. 250 4. The code does not compile because of line j1.
// Ans: None of the above

// If int is cast then output will be 200 
