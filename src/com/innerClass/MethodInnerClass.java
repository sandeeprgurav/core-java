package com.innerClass;

public class MethodInnerClass {
	void outerMethod() { 
		int x=10;
		final int y=10;
        System.out.println("inside outerMethod");    
        class Inner { 
            void innerMethod() { 
                System.out.println("inside innerMethod x="+x+" y="+y); 
            } 
        } 
        Inner inner = new Inner(); 
        inner.innerMethod(); 
    }
	
	public static void main(String[] args) {
		MethodInnerClass methodInnerClass = new MethodInnerClass();
		methodInnerClass.outerMethod();
	}
	
}
