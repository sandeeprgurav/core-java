package com.ocp.collections2;

import java.util.ArrayDeque;

public class ArrayDequeTest2 {
	public static void main(String[] args) {
		ArrayDeque<Integer> d = new ArrayDeque<>();
		d.offer(18);  //put element at the very end 
		//d.offerLast(11);
		//d.offerFirst(14);
		d.offer(5);//put element at the very end 
		d.push(13);//put element at the begining
		System.out.println(d.poll() + " " + d.poll());
	}
}


// Ans: 13 18 
