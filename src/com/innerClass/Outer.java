package com.innerClass;

public class Outer {
	class Inner {
		private int i =10;
	      private void show() { 
	           System.out.println("In a nested class method"); 
	      }
		public int getI() {
			return i;
		}
		public void setI(int i) {
			this.i = i;
		} 
	      
	   } 
	
	public static void main(String[] args) { 
	       Outer.Inner in = new Outer().new Inner(); 
	       in.show();
	       //in.i; //not accessible
	   } 
}
