package com.ocp.collections2;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class HashMapTest2 {
	
	
	public static void main(String[] args) {		
		HashMap<String, Integer> map = new HashMap<>();
		// map.compute("1", (k,v) -> (v==null) ? k*k:0); // k is String type so that
		// multiplication operation will give compile error
		map.compute("1", (k, v) -> (v == null) ? 1 * 1 : 0);
		AtomicInteger a = new AtomicInteger(0);
		a.addAndGet(1);
		System.out.println(a.weakCompareAndSet(1, 2));
		System.out.println(a);
		
		
		map.compute("2", (k, v) -> (v == null) ? 2 * 2 : 0);
		//System.out.println(map.get("1") + "" + map.get("2"));
	}
}


// Ans : A compilation error occurs