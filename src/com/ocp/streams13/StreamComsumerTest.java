package com.ocp.streams13;

import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/*
 * Which of the following expressions, inserted simultaneously into both blanks, allow the application to compile?
 */
abstract class Phantom {
	public void bustLater(DoubleConsumer buster, double value) {
		buster.accept(value);
	}
}

public class StreamComsumerTest extends Phantom {
	public void bustNow(Consumer<Double> buster, double value) {
		buster.accept(value);
	}

	void call() {
		double value = 10;
		bustNow(System.out::print, value);
		bustLater(System.out::print, value);

		bustNow(v -> System.out.print(v), value);
		bustLater(v -> System.out.print(v), value);

		bustNow(g -> {
			System.out.println();
		}, value);
		bustLater(g -> {
			System.out.println();
		}, value);

	}
}

// Ans: 1. System.out::print 2. v -> System.out.print(v) 3. g ->
// {System.out.println();}