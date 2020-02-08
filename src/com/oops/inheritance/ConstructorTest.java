package com.oops.inheritance;

public class ConstructorTest
{
	public static void main ( String [ ] args )
	{
		A a=new B("B");	
		a.doMethod ( );
	}
	 
}


class A{
	A(){
		
	}
	A(String s){		
		//System.out.println ("A") ;
	}
	
	void doMethod(){	
		
		System.out.println ("A") ;
	}
}

class B extends A{
	
	B(String s){
		super(s);
		//System.out.println ("B") ;
	}
	
	void doMethod(){
		super.doMethod ();
		System.out.println ("B") ;
	}
}






