package com.ocp;

interface Interface1 {
	public default void sayHi() {
		System.out.println("hi Interface-1");
	}
	//public void sayHi();
}

interface Interface2 {
	public default void sayHi() {
		System.out.println("hi Interface-2");
	}
	
	//public void sayHi();
}

public class InheritanceTest2 implements Interface1, Interface2 {
	public static void main(String[] args) {
		Interface2 obj = new InheritanceTest2();
		obj.sayHi();
	}

	public void sayHi() {
		System.out.println("Hi InheritanceTest2");
	}

}

//Ans: Hi InheritanceTest2