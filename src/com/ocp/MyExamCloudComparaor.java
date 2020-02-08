package com.ocp;

import java.util.Comparator;

public class MyExamCloudComparaor {
public static void main(String[] args) {
	Comparator comp = Comparator.nullsLast(Integer::compare);
	System.out.println(comp.compare(null, 10));
}
}
// Ans: 1