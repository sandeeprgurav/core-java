package com.ocp.streams13;

import java.util.Arrays;
import java.util.List;

public class SteramAllMatchTest {
public static void main(String[] args) {
	List<String> list = Arrays.asList("Java","Java SE", "Java ME");
	
	boolean b1 = list.stream() .findAny() .get() .equals("Java");
	boolean b2 = list.stream() .allMatch(w -> w.equals("Java"));
	System.out.println(b1); // true always
	System.out.println(b2); // false always 
}
}
