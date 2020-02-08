
package com.oops.polymorphism ;

import java.util.ArrayList ;
import java.util.List ;

public class OverridingMain
{
	static List < ? extends Number > o = new ArrayList < Integer > ( ) ;

	public static void main ( String [ ] args )
	{
		Overriding andThisTest = new SubClassSuperAndThisTest ( ) ;
		andThisTest.DoSo ( ) ;

		if ( o instanceof List )
		{
			System.out.println ( "Hi" ) ;
		}

		testInstanceOf ( new Object ( ) ) ;
		testInstanceOf ( null ) ;
	}

	public static void testInstanceOf ( Object test )
	{
		if ( test instanceof Object )
		{
			System.out.println ( "Inside testInstanceOf methid called" ) ;
		}
	}

}
