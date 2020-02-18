package com.ocp.others12;

import java.util.ArrayList;
import java.util.List;

public class InheritanceTest14 {
	static interface Vehicle {
	}

	static class Bus implements Vehicle {
	}

	static class Van extends Bus {
	}

	public static void main(String[] args) {
		Bus bus = new Van();
		Van van = new Van();
		Van[] vans = new Van[0];

		boolean b = bus instanceof Vehicle;
		boolean v = van instanceof Vehicle;
		boolean a = vans instanceof Vehicle[];

		System.out.println(b + " " + v + " " + a);
	}
}

// Ans:true true true
