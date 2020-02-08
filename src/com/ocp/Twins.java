package com.ocp;

interface Alex {
	default void write() {
	}

	static void publish() {
	}

	void think();
}

interface Michael {
	public default void write() {
	}

	public static void publish() {
	}

	public void think();
}

public class Twins implements Alex, Michael {
	@Override
	public void write() {
	}

	//@Override  can't override static method
	public static void publish() {
	}

	@Override
	public void think() {
		System.out.print("Thinking...");
	}
}

//Ans: The class fails to compile because of the publish() method.