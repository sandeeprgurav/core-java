package com.innerClass;

public class AnnonymousInnerClassUsingBaseClass {
	static Demo d = new Demo() {
		void show() {
			super.show();
			System.out.println("i am in AnnonymousInnerClassUsingBaseClass class");
		}
	};

	public static void main(String[] args) {
		d.show();
	}
}

class Demo {
	void show() {
		System.out.println("i am in show method of super class");
	}
}