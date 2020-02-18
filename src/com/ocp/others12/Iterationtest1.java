package com.ocp.others12;

import java.util.Iterator;
import java.util.LinkedList;

public class Iterationtest1 {
public static void main(String[] args) {
	LinkedList<String> list = new LinkedList<>();
	list.add("Grapes of Wrath");
	list.add("1984");
	list.forEach(System.out::println);
	Iterator it = list.iterator();
	//while (it.hasMore()) there is no method hasMore()
	while (it.hasNext())
	System.out.println(it.next());
}
}
//Ans: The hasMore() method should be changed to hasNext().