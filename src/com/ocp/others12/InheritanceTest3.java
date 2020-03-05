package com.ocp.others12;

class X {
	int i = 10;
	public void mX() {
		System.out.println("Xm1");
	}
}

class Y extends X {
	int i = 20;
	@Override
	public void mX() {
		System.out.println("Xm2");
	}

	public void mY() {
		System.out.println("Ym");
	}
}

public class InheritanceTest3 {
	public static void main(String[] args) {
		X xRef = new Y();
		Y yRef = (Y) xRef;
		yRef.mY();
		xRef.mX();
		yRef.mX();
		System.out.println(xRef.i);
		System.out.println(yRef.i);
	}

}

// Ans: Ym 
//      Xm2
