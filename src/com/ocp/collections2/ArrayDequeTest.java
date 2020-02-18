package com.ocp.collections2;

import java.util.ArrayDeque;

public class ArrayDequeTest {
	public static void main(String[] args) {
		ArrayDeque ad = new ArrayDeque<>();
		ad.add(6);
		ad.add(2);
		ad.offerLast(3);
		ad.offer(4);
		ad.poll();
		System.out.println(ad);
	}
}
//Ans: [2, 3, 4]