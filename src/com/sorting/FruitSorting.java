package com.sorting;

import java.util.Arrays;

public class FruitSorting {

	public static void main(String[] args) {
		Fruit[] fruits = new Fruit[4];
		fruits[0] = new Fruit("Mango", "Pineapple description", 60);
		fruits[1] = new Fruit("Apple", "Apple description", 100);
		fruits[2] = new Fruit("Pineapple", "Orange description", 280);
		fruits[3] = new Fruit("Banana", "Banana description", 190);

		// Sort Fruit array based on its “quantity” property in ascending order.
		Arrays.sort(fruits);

		// Sort Fruit array based on its “fruitName” property in ascending order.
		Arrays.sort(fruits, Fruit.FruitNameComparator);
	}
}
