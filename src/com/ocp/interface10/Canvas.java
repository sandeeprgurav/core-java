package com.ocp.interface10;

interface Readable {
	public void read();

	public static void close() {
		System.out.println("close");
	}
}

interface Writable extends Readable {
	public default void write() {
		read(); // line n1
		System.out.println("Welcome");
	}
}

public class Canvas implements Writable { // line n2

	@Override
	public void read() {
		System.out.println("Hello");
	}

	public static void main(String[] args) {
		Writable canvas1 = new Canvas();
		canvas1.write();
		// Writable.close(); //line n3
		Readable.close();
	}
}

// Ans: Compilation fails due to an error at line n3.
