package com.dataTypes;

public class TestQueue
{

	public static void main ( String [ ] args ) throws Exception
	{
		MyQueue myQueue = new MyQueue ( ) ;
		myQueue.push ( 100 ) ;
		myQueue.push ( 200 ) ;
		myQueue.push ( 300 ) ;
			
		System.out.println ( myQueue.pop ( ) ) ;

		//Class.forName ( "StaticContentClass");
		System.out.println (StaticContentClass.count1);
	}

}
