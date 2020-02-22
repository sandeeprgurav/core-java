
package com.ocp.collections2;

import java.util.Set;
import java.util.TreeSet;

class Magazine { // Comparable is not implemented
	private String name;

	public Magazine(String name) {
		this.name = name;
	}

	public int compareTo(Magazine m) {
		return name.compareTo(m.name);
	}

	public String toString() {
		return name;
	}
}

public class TreeSetTest2 {
	public static void main(String[] args) {
		Set<Magazine> set = new TreeSet<>();
		set.add(new Magazine("highlights"));
		set.add(new Magazine("Newsweek"));
		set.add(new Magazine("highlights"));
		System.out.println(set.iterator().next());
	}
}
// The code compiles but throws an exception at runtime.
// Exception in thread "main" java.lang.ClassCastException:
// com.ocp.collections2.Magazine cannot be cast to java.lang.Comparable
