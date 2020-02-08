
package com.oops.polymorphism ;

public class Overriding
{

	public Overriding ( )
	{
		//this("Sandeep");
		System.out.println ( "In Side Super Default Constructor" ) ;
	}

	public Overriding ( String str )
	{
		this ( ) ;
		System.out.println ( "In Side Super Single arg Constructor"+str ) ;
	}
	
	public void DoSo(){
		System.out.println ("DoSo Super class method called ") ;
	}

}

class SubClassSuperAndThisTest extends Overriding
{

	SubClassSuperAndThisTest(){
		super("Sandeep");
	}
		
}
