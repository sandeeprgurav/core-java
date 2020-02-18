package com.ocp.others12;

import java.util.Iterator;
import java.util.LinkedList;

public interface IterationTest2 {
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<>();
		list.add("Grapes of Wrath");
		list.add("1984");

		list.stream().forEach(System.out::println);

		Iterator it = list.iterator();
		while (it.hasNext())
			System.out.println(it.next());
	}
}

//Ans:None of the above. The code does print each book title twice. 
