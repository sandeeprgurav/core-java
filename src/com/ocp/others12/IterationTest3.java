package com.ocp.others12;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class IterationTest3 {
	public static void main(String[] args) {
	 Set<Number> numbers = new HashSet<>();
	 numbers.add(new Integer(100));
	 numbers.add(175);
	 numbers.add(new Integer(100));
	 numbers.add(null);
	 numbers.add(309L);
	 Iterator iter = numbers.iterator();
	 while (iter.hasNext())
	 System.out.print(iter.next());
	}
}

//Ans: unordered output 
//1. The code compiles successfully. 2. The output is indeterminate.
