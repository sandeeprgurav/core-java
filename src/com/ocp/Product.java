package com.ocp;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Product {
	String name;
	Integer price;

	Product(String name, Integer price) {
		this.name = name;
		this.price = price;
	}

	public void printVal() {
		System.out.print(name + " price: " + price + " ");
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Integer getPrice() {
		return price;
	}

	public static void main(String[] args) {
		List<Product> li = Arrays.asList(new Product("TV", 1000), new Product("Refrigerator", 2000));
		Consumer<Product> raise = e -> e.setPrice(e.getPrice() + 100);
		li.forEach(raise);
		li.stream().forEach(Product::printVal);
	}
}
//Ans : TV Price :110 Refrigerator Price :2100