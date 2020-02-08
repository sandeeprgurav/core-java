package com.ocp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

class Wash<T extends Collection>
{
	   T item;

	public void clean(T items) {
		System.out.println("Cleaned " + items.size() + " items");
	}
}

public class LaundryTime {
	public static void main(String[] args) {
	      Wash<List> wash = new Wash<List>(); // not ArrayList ** 
	      wash.clean(Arrays.asList("sock", "tie"));   }
}
