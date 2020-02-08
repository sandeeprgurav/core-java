package com.staticScenarios;

public class StaticTest
{

	static String staticVaraible;
	String nonStaticVaraible;
	
	public static void main ( String [ ] args )
	{
		staticVaraible="Sandeep";
		
		StaticTest testObj = new StaticTest();
		testObj.nonStaticVaraible="Sandeep";
		
	}
		
	public void doSomething(){
		staticVaraible="Sandeep";
		nonStaticVaraible="Sandeep";
	}
}
