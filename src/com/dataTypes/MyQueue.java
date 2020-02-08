package com.dataTypes;

public class MyQueue
{
  
	int array[]=new int[100];
	int maxSize=101;
	int lastAccessIndex;
	
	public void push(int k) throws Exception{
		if(lastAccessIndex<maxSize){			
			array[lastAccessIndex]=k;
			lastAccessIndex++;
			System.out.println (lastAccessIndex) ;
		}
		else
			throw new Exception("Ques reached its maximum size");
	}
	
	public int pop(){
		return array[lastAccessIndex-1];
	}
		
}
