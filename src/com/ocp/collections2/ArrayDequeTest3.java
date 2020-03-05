package com.ocp.collections2;

import java.util.ArrayDeque;

public class ArrayDequeTest3 {
	public static void main(String[] args) {		
		ArrayDeque<String> greetings = new ArrayDeque<String>();
		greetings.push("hello");
		greetings.push("hi");
		greetings.push("ola");
		greetings.pop();
		greetings.peek();
		while (greetings.peek() != null)
			System.out.print(greetings.pop());
		
		
	}
}
  
// ArrayDeque is store data first in last out / pop
// push and offerFirst set element at the top 
// offer and lastOffer set element at the end
// Ans: hihello