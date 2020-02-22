package com.ocp.functionalinterfaces8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class FunctionInterfaceTest7 {
	private static void checkPrices(List<Double> prices, Consumer<Double> scanner) {
		prices.forEach(scanner);
	}

	public static void main(String[] right) {
		List<Double> prices = Arrays.asList(1.2, 6.5, 3.0);
		checkPrices(prices, p -> {
			String result = p < 5 ? "Correct" : "Too high";
			System.out.println(result);
		});
	}
	
	// OPtions: 1. Consumer 2. DoubleConsumer 3. None of the above 4. Supplier<Double>
}

//Ans: None of the above since required is Consumer<Double>