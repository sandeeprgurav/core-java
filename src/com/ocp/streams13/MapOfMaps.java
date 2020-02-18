package com.ocp.streams13;

import java.util.HashMap;
import java.util.Map;

public class MapOfMaps {
public static void main(String[] args) {
	 Map<Integer, Integer> map = new HashMap<>();
     map.put(9, 3);
     //Map<Integer, Integer> result = map.stream().map((k,v) > (v,k)); //map doesn't have stream method 
     //System.out.println(result.keySet().iterator().next());
}
}


//Ans: The code does not compile.