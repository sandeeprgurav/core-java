package com.collections;

public class Queue<E> {

	private Object[] q;
	private int size;
	private int total;
	private int front;
	private int rear;

	public Queue() {
		this.size = 100;
		this.total = 0;
		this.front = 0;
		this.rear = 0;
		q = new Object[this.size];
	}

	public Queue(int size) {
		this.size = size;
		this.total = 0;
		this.front = 0;
		this.rear = 0;
		q = new Object[this.size];
	}

	public boolean enqueue(E item) {
		if (isFull()) {
			return false;
		} else {
			total++;
			q[rear] = item;
			rear = (rear + 1) % this.size;
			return true;
		}
	}

	@SuppressWarnings("unchecked")
	public E dequeue() {
		E item = (E) q[front];
		total--;
		front = (front + 1) % this.size;
		return item;
	}

	public boolean isFull() {
		if (size == total) {
			return true;
		} else {
			return false;
		}
	}

	public void showAll() {
		int f = front;
		if (total != 0) {
			for (int i = 0; i < total; i++) {
				System.out.print("  " + q[f]);
				f = (f + 1) % size;
			}
		}
	}

}
