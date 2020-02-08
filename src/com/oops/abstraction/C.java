package com.oops.abstraction;

public class C implements I1, I2, I3 {

	public static void main(String[] args) {
		I2 c = new C();
		c.doX();
		System.out.println(c.i);

	}

	@Override
	public void doX() {

		System.out.println("X");
		// TODO Auto-generated method stub

	}

}
