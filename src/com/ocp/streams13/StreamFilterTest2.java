package com.ocp.streams13;

import java.util.Arrays;
import java.util.List;

class Product1 {
	String name;
	int qty;

	public String toString() {
		return name;
	}

	public Product1(String name, int qty) {
		this.name = name;
		this.qty = qty;
	}

	static class ProductFilter {
		public static boolean isAvailable(Product1 p) {
			return p.qty >= 10;
		}
	}
}

public class StreamFilterTest2 {
	public static void main(String[] args) {
		List<Product1> products = Arrays.asList(new Product1("MotherBoard", 5), new Product1("Speaker", 20));
		products.stream().filter(Product1.ProductFilter::isAvailable).forEach(p -> System.out.println(p));
	}
}

// Ans: Replace line n1 with: public static booleanisAvailable (Product p) {
