package com.ocp.generics9;

import java.util.ArrayList;
import java.util.List;

public class GenericsTest4<Object> {
public static void main(String[] args) {
	List list = new ArrayList();
	 list.add("one");
	 list.add("two");
	 list.add("7");
	 //for (String s: list) //line 7
	 //System.out.print(s);
}
}
// Ans: Compile error at line 7