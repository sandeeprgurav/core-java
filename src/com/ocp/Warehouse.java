package com.ocp;

import java.util.function.BooleanSupplier;

public class Warehouse {
	private int quantity = 40;
	private final BooleanSupplier stock;
	{
		stock = () -> quantity > 0;
	}

	public void checkInventory() {
		if (stock.getAsBoolean())
		//if (stock.get())  There is no method get() in BooleanSupplier function interface
			System.out.print("Plenty!");
		else {
			System.out.print("On Backorder!");
		}
	}

	public static void main(String... widget) {
		final Warehouse w13 = new Warehouse();
		w13.checkInventory();
	}
}

//Ans: The code does not compile because of the checkInventory() method.

