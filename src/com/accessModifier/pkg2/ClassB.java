package com.accessModifier.pkg2;

import com.accessModifier.pkg1.ClassA;

public class ClassB extends ClassA {

	int r = 8;
	private int s = 3;

	public static void main(String[] args) {
		ClassA ca = new ClassA();
		ClassB cb = new ClassB();
		System.out.print(ca.p + " ");
		System.out.print(cb.p + " ");
		System.out.print(cb.q + " ");
		System.out.print(cb.r + " ");
		System.out.print(cb.s + " ");
	}
}