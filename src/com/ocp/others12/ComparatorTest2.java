package com.ocp.others12;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorTest2  {
	public static void main(String[] args) {
		Comparator<Integer> c = (x, y)-> y-x; // y-x will sort collection in descending order
		List<Integer> ints = Arrays.asList(3, 1, 4);
		Collections.sort(ints, c);
		System.out.println(Collections.binarySearch(ints, 4)); // binarySearch srearch given element of collection sorted ascending order else returns -1.
		// Ans:The result is not defined.		
				
		Comparator<Integer> c1 = (x, y)-> x-y; // x-y will sort collection in ascending order
		List<Integer> ints1 = Arrays.asList(3, 1, 4);
		Collections.sort(ints1, c1);
		System.out.println(Collections.binarySearch(ints1, 4)); //2
		// binarySearch find the element and returs index of the element in the collection. 
	}
}




