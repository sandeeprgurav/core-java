package com.innerClass;

public class OuterClass {
	
	public InnerClass getInnerClassInstance() {
		return new InnerClass();
	}
	
	public class InnerClass {
		private int i = 10;
		protected int j = 20;
		int k = 30;
		public int l = 40;

		
		void privateMethod() {
			System.out.println("Called InnerClass Private Method");
		}
		
		void protectedMethod() {
			System.out.println("Called InnerClass Protected Method");
		}
		
		void defaultMethod() {
			System.out.println("Called InnerClass Default Method");
		}
		
		void publicMethod() {
			System.out.println("Called InnerClass PublicMethod Method");
		}
		
	}

}
