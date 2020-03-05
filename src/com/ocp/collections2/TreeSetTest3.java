
package com.ocp.collections2;

import java.util.Set;
import java.util.TreeSet;

class Magazine1 { // Comparable is not implemented
	private String name;

	public Magazine1(String name) {
		super();
		this.name = name;
	}
}

public class TreeSetTest3 {
	public static void main(String[] args) {
		Set<Magazine1> set = new TreeSet<>();
		set.add(new Magazine1("highlights"));

		System.out.println(set.iterator().next());
	}
}
//
