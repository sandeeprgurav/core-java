package com.ocp;

class Book {
	private String read(String bname) {
		return "Read" + bname;
	}
}

class EBook extends Book {
	public String read(String url) {
		return "View" + url;
	}
}

public class InheritanceTest {
	public static void main (String[] args) {
		Book b1 = new Book();
		//b1.read("Java Programing");  read method is not visible 
		Book b2 = new EBook();
		//b2.read("http://ebook.com/ebook"); read method is not visible 
	}
}

//The Test.java file fails to compile