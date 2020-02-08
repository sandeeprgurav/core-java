
package com.generic.example1 ;

import java.util.List ;
import java.util.Set ;

public class Dog < T extends Animal > 
{
	public void otherMethod ( List < ? extends Number > list )
	{
		for ( Number nm : list )
			System.out.println ( "Numver==>>>" + nm ) ;
	}

	public void otherMethod( Set < T > list )
	{
		for ( T nm : list )
			System.out.println ( "Numver==>>>" + nm ) ;
	}
	

}
