
package com.thread.example2 ;

public class DisplayMessage implements Runnable
{
	private String message ;

	public DisplayMessage ( String message )
	{
		this.message = message ;
	}
	public void run ( )
	{

		System.out.println ( message ) ;

	}

}
