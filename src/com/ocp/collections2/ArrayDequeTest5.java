package com.ocp.collections2;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;



public class ArrayDequeTest5 {
	public static void main(String[] args) {
		Queue<Integer> q = new LinkedList<>();
		q.add(10);
		 q.add(12);
		 q.remove(1);
		 System.out.print(q);
		 List<Integer> q1 = new LinkedList<>();
			q1.add(10);
			 q1.add(12);
			 q1.remove(1);
		System.out.print(q1);
		
		
	}
}

//If we fill in the blank with List, the output is [10].
//If we fill in the blank with Queue, the output is [10, 12].

