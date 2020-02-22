package com.ocp.collections2;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetTest {
public static void main(String[] args) {
	TreeSet<String> tree = new TreeSet<String>();
	tree.add("one");
	tree.add("One");
	tree.add("ONE");
	System.out.println(tree.ceiling("ONE")); // parameter work as search like
	//Ans: Output is ONE,  but Ans option is One	
	
	 //Set<String> set1 = new TreeSet<String>(); compile error
	 TreeSet<String> set1 = new TreeSet<String>();
	 set1.add("A");
	 set1.add("D");
	 set1.pollFirst();
	 System.out.println(set1.ceiling("C"));
	 //Compile error if used Set<String> set1 = new TreeSet<String>(); 
}
}


