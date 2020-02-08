package com.ocp;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetTest {
public static void main(String[] args) {
	TreeSet<String> tree = new TreeSet<String>();
	tree.add("one");
	tree.add("One");
	tree.add("ONE");
	System.out.println(tree.ceiling("ONE")); // parameter work as search like 
}
}

//Ans: One
