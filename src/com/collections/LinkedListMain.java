package com.collections;

public class LinkedListMain {
	public static void main(String[] args) {

		LinkedList<String> list = new LinkedList<>("One");
		list.insertItem("Two");
		list.insertItem("Three");
		list.insertItem("Four");
				
		list.printList();
		
		list.deleteNode("Three");
		
		list.printList();		
		
	}
}
