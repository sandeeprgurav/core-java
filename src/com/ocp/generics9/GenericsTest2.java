package com.ocp.generics9;

public class GenericsTest2<T> {

	T t;

	public GenericsTest2(T t) { this.t = t; }

	public String toString() {
		return t.toString();
	}

	public static void main(String[] args) {
		System.out.print(new GenericsTest2<String>("hi"));
		System.out.print(new GenericsTest2("there"));
	}
}
// Ans: hithere