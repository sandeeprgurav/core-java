package com.innerClass;

public class StaticInnerClass {
	private int j = 20;
	private static void staticOuterMethod() {
		System.out.println("inside staticOuterMethod");
	}
	
	private void outerMethod() {
		System.out.println("inside outerMethod");
	}
	
	public static void main(String[] args) {
		System.out.println("inside StaticInnerClass main");
		Inner inner = new Inner();
		inner.innerMethod();
		//inner.i; //not accessible  
	}
	

	static class Inner {
		private static int i=10; 
		private void innerMethod() {
			System.out.println("inside innerMethod");	
		}
		
		static void staticInnerMethod() {
			System.out.println("inside staticInnerMethod");	
		}
		
		public static void main(String[] args) {
			System.out.println("inside inner class Method");
			StaticInnerClass staticInnerClass = new StaticInnerClass(); 
			staticInnerClass.outerMethod();
			//staticInnerClass.j; //not accessible
			staticOuterMethod();
			staticInnerMethod();
			Inner inner = new Inner();			
			inner.innerMethod();
		}
	}
}
