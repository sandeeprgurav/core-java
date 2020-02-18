package com.ocp.collections2;

import java.util.Map;
import java.util.Properties;
import java.util.TreeMap;

public class TreeMapTest {
	public static void main(String[] args) {
		Map<String, String> map = new TreeMap<>();
		map.put("tool", "hammer");
		map.put("problem", "nail");

		Properties props = new Properties(); // p1
		map.forEach((k, v)->props.put(k, v)); // p2

		//String t = props.get("tool"); // p3
		String t = (String)props.get("tool"); 
		String n = (String)props.get("nail");
		System.out.println(t + " " + n);
	}
}

//Ans : (String) cast was missing so compile error at p3