package com.ocp.others12;

import java.util.ArrayList;
import java.util.List;

abstract class Shape {
	Shape() {
		System.out.println("Shape");
	}

	protected void area() {
		System.out.println("Shape");
	}
}

class Square extends Shape {
	int side;
    
	Square(int side) {
		this.side = side;
	}

	public void area() {
		System.out.println("Square");
	}
}

public class InheritanceTest15 extends Square {
	int len, br;

	InheritanceTest15(int x, int y) {
		super(x);
		len = x;
		br = y;
	}

	public void area() {
		System.out.println("Rectangle");
	}
	public static void main(String[] args) {
		
	}
}
// Ans:	At line 20, use public void area ( ) {
/*At line 17, insert super(x);;*/
