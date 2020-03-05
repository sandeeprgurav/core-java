package com.ocp.functionalinterfaces8;

import java.util.function.Supplier;

public class Android {
	public void wakeUp(Supplier supplier) { // d1
		supplier.get();
	}

	public static void main(String... electricSheep) {
		Android data = new Android();
		//data.wakeUp(() -> System.out.print("Program started!")); // d2  //Supplier can not have body which returns void
	}
}

//The code does not compile because of line d2 only.