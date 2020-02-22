package com.ocp.functionalinterfaces8;

import java.util.function.DoubleToIntFunction;
import java.util.function.Supplier;

class Bird {
	public void fly() {
		System.out.print("Can fly");
	}
}

class Penguin extends Bird {
	public void fly() {
		System.out.print("Cannot fly");
	}
}

public class FunctionInterfaceTest17 {
	public static void main(String[] args) {
		fly(() -> new Bird());
		fly(Penguin::new);
	}
	//static void fly (Supplier<? extends Bird> bird> bird) { //Dont know why this is not corerct
	static void fly (Supplier<Bird> bird) { //this is correct
		bird.get();
	}
}
//Ans: static void fly (Supplier<Bird> bird.get( ) fly (); }