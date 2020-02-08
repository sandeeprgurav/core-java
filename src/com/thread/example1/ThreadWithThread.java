
package com.thread.example1 ;

public class ThreadWithThread
{
	public static void main ( String [ ] args )
	{
		new NewThreadExThread ( ) ;

		try
		{
			for ( int i = 0 ; i < 5 ; i ++ )
			{
				System.out.println ( "Main Thread " + i ) ;
				Thread.sleep ( 500 ) ;
			}
		}
		catch ( InterruptedException e )
		{
			// TODO Auto-generated catch block
			e.printStackTrace ( ) ;
			System.out.println ( "Main Thread Intrrupted" ) ;
		}
		System.out.println ( "Main Thread Terminated" ) ;
	}

}

class NewThreadExThread extends Thread
{
	NewThreadExThread ( )
	{
		super ( "Demo Thread" ) ;
		start ( ) ;
	}

	public void run ( )
	{
		try
		{
			for ( int i = 0 ; i < 5 ; i ++ )
			{
				System.out.println ( "Child Thread " + i ) ;
				Thread.sleep ( 500 ) ;
			}
		}
		catch ( InterruptedException e )
		{
			// TODO Auto-generated catch block
			e.printStackTrace ( ) ;
			System.out.println ( "Child Thread Intrrupted" ) ;
		}
		System.out.println ( "Child Thread Terminated" ) ;
	}
}
