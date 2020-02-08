package com.collections;

public class ArrayListMain {
	public static void main(String a[]) {
		ArrayList<Integer> customArrayList = new ArrayList<>();
		customArrayList.add(new Integer(21));
		customArrayList.add(new Integer(50));
		customArrayList.add(new Integer(11));
		customArrayList.add(new Integer(26));
		customArrayList.add(new Integer(41));
		System.out.println(customArrayList.toString());
		customArrayList.add(new Integer(29));
		System.out.println(customArrayList.toString());
		System.out.println("Item at Index 5:" + customArrayList.get(5));
		System.out.println("Custom List size: " + customArrayList.size());
		System.out.println("Removing item at index 3: " + customArrayList.remove(3));
		System.out.println(customArrayList.toString());
	}
}
