package com.ocp.collections2;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest2 {
	
	
	public static void main(String[] args) {		
		Map<String, Integer> map = new HashMap<>();
		// map.compute("1", (k,v) -> (v==null) ? k*k:0); // k is String type so that
		// multiplication operation will give compile error
		map.compute("1", (k, v) -> (v == null) ? 1 * 1 : 0);
		map.compute("2", (k, v) -> (v == null) ? 2 * 2 : 0);
		System.out.println(map.get("1") + "" + map.get("2"));
	}
}


// Ans : A compilation error occurs