package com.ocp.collections2;

import java.util.ArrayDeque;

public class ArrayDequeTest2 {
	public static void main(String[] args) {
		ArrayDeque<Integer> d = new ArrayDeque<>();
		d.offer(18);
		//d.offerLast(11);
		//d.offerFirst(14);
		d.offer(5);
		d.push(13);
		System.out.println(d.poll() + " " + d.poll());
	}
}

// Ans: 13 18 