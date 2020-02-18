package com.ocp.collections2;

import java.util.ArrayList;
import java.util.List;

public class ListRemoveIf {
public static void main(String[] args) {
	List<String> list = new ArrayList<>();
	list.add("Austin");
	list.add("Boston");
	list.add("San Francisco");

	list.removeIf(a -> a.length() > 10);
	System.out.println(list.size());
}
}


// Ans : 2 