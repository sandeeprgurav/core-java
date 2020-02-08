package com.collections;

public class QueueMain {

	public static void main(String[] args) {
		Queue<String> q = new Queue<>();
		  q.enqueue("Sandeep");
		  q.enqueue("Gurav");
		  q.enqueue("34");
		  		  
		  System.out.println(q.dequeue()); //Sandeep
		  System.out.println(q.dequeue()); //Gurav
		  System.out.println(q.dequeue()); //34
		  
		  //q.showAll(); //Sandeep Gurav 34
	}		 	
}
