package com.collections;

public class StackMain {

	public static void main(String[] args) {
		Stack<String> stack = new Stack<>();
		if(!stack.isFull() ) {
			stack.push("Sandeep");
			stack.push("Gurav");
			stack.push("33");
		}
		
		System.out.println(stack.pop()); //33
		System.out.println(stack.pop()); //Gurav
		System.out.println(stack.pop()); //Sandeep
		
	}
	
}
