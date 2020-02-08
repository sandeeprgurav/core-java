package com.innerClass;

public class OuterClassMain {
	
	public static void main(String[] args) {
		OuterClass outerClass = new OuterClass();
		OuterClass.InnerClass innerClass = outerClass.getInnerClassInstance();
		System.out.println(innerClass.j);
		//System.out.println(innerClass.i);
		System.out.println(innerClass.k);
		System.out.println(innerClass.l);
        innerClass.privateMethod();
        innerClass.protectedMethod();
        innerClass.defaultMethod();
        innerClass.publicMethod();
	}

}
