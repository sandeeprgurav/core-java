package com.ocp.generics9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class GenericsTest5<Object> {
	List<? super Object> s1 = new ArrayList<>();
	List<? super Object> s2 = new ArrayList<Object>();
	//List<? super Object> s3 = new ArrayList<?>(); Rejected
	//List<? super Object> s3 = new ArrayList<? super Object>(); Rejected
	List<?> s4 = new ArrayList<>();
	
	public static void main(String[] args) {
		List list = Arrays.asList("Sunny");
		method(list); // c1
	}

	private static void method(Collection<?> x) { // c2
		Collection<?> y = Arrays.asList("Sunny");
		
		x.forEach(a -> {
		}); // c3
	}
}
// Ans: Compile error at line 7