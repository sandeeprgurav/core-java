package com.ocp.collections2;

import java.util.Map;
import java.util.Properties;
import java.util.TreeMap;

public class TreeMapTest {
	public static void main(String[] args) {
		Map<String, String> map = new TreeMap<>();
		map.put("tool", "hammer");
		map.put("problem", "nail");

		//Property props = new Property();   // The code does not compile due to line p1. 
		Properties props = new Properties(); // p1
		map.forEach((k, v)->props.put(k, v)); // p2

		//String t = props.get("tool"); // p3  compile error
		String t = (String)props.get("tool"); 
		String n = (String)props.get("problem");
		
		String t1 = props.getProperty("tool"); 
		String n1 = props.getProperty("problem");
		//String n1 = props.getProperty(1);1 is not valid param
		//String n2 = (String)props.get(1);1 is valid param 
		
		System.out.println(t1 + " " + n1);
		
		//System.out.println(props.get("veggies", "none")+ " " + props.get("omni", "none")); Compile fail no two arguments
		
		//System.out.print(props.getDefaultProperty("mystery", "?")); No such method getDefaultProperty

	}
}

//Ans : (String) cast was missing so compile error at p3