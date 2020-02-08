package com.collections;

public class LinkedList<E> {

	private Node<E> head;

	public LinkedList(E item) {
		head = new Node<>();
		head.value = item;
		head.link = null;
	}

	public boolean insertItem(E item) {
	/*  Node<E> n = new Node<>();
		n.value = item;
		n.link = head;
		head = n;
		return true;*/
		
		//Insert node at the end
		Node<E> n = new Node<>();
		Node<E> new_node;
		new_node= head;
		while(new_node.link!=null) {
			new_node= new_node.link;			
		}
		n.value =item;
		n.link = null;
		new_node.link=n;		
		return true;		
		
	}

	public boolean deleteNode(E item) {
		if (head.value.equals(item)) {
			head = head.link;
			return true;
		} else {
			Node<E> x = head;
			Node<E> y = head.link;

			while (true) {
				if (y == null || y.value == item) {
					break;
				} else {
					x = y;
					y = y.link;
				}
			}
			 if(y!=null) {
				 x.link = y.link;
				 return true;
			 } else {
				 return false;
			 }
			 
		}		
	}
	
	/* Not supporting for E data type
	public void sortList() {
		E c=null;
		Node a = head.link;
		while(a.link!=null) {
			Node b = head.link;
			while(b.link!=null) {
				if(b.value. < b.link.value) {  //descending order
					c=b.value;
					b.value =b.link.value;
					b.link.value= c;
				}
				b=b.link;
			}
			a.a.link;
		}
	}*/

	public void printList() {
		Node<E> z = head;
		while (z != null) {
			System.out.println(z.value);
			z = z.link;
		}
	}

	class Node<E> {
		private E value;
		private Node link;

	}

}
