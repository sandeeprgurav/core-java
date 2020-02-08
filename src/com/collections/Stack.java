package com.collections;


public class Stack<T> {
  private Object[] stack;
  private int top;
  private int size;
  
  public Stack() {
	  this.top = -1;
	  this.size = 50;
	  stack = new Object[this.size];
  }
  
  public Stack(int size) {
	  this.top = -1;
	  this.size = size;
	  stack = new Object[this.size];
  }
	
  public boolean push(T item) {
	  if(!isFull()) {
		  top++;
		  stack[top] = item;
		  return true;
	  } else {
		  return false;
	  }	  	  
  }
  
  public boolean isFull() {
	  return (top==(stack.length -1));
  }
  
  public T pop() {	  
	  return (T) stack[top--];
  }
  
  public boolean isEmpty() {
	  return (top ==stack.length -1);
  }
    
	
}
