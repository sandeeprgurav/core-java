package com.ocp.concurrency3;

import java.util.ArrayList;
import java.util.List;

public class ThreadingTest3 {
	private List<Integer> data = new ArrayList<>();
	   public synchronized void addValue(int value) {
	      data.add(value);
	   }
	   public int getValue(int index) {
	      return data.get(index);
	   }
	   public int size() {
	      synchronized(ThreadingTest3.class) {
	         return data.size();
	      }
	   }
}

// Ans: The code compiles and is not thread-safe.
