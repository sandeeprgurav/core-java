package com.generic.example1;

import java.util.ArrayList ;
import java.util.Arrays ;
import java.util.HashSet ;
import java.util.List ;
import java.util.Set ;

public class Main
{

	public static void main ( String [ ] args )
	{
		List<Integer> intList=new ArrayList<Integer>();
		/*int [] intArray1=new int[10];
		List intList1=Arrays.asList ( intArray1 );*/
		intList.add(1);
		intList.add(2);
		intList.add(3);
		Dog dog=new Dog();
		dog.otherMethod ( intList );
		
		
		Set<Animal> animalSet=new HashSet<Animal>();
		animalSet.add ( new Cat("Cat1","10") );
		animalSet.add ( new Cat("Cat2","20") );
		Dog<Animal> dog1=new Dog<Animal>();
		dog1.otherMethod ( animalSet );
		
	}
	
	static Animal animal=new Animal(){
		
		public void doNothing(){
			System.out.println ( "In side doNothing") ;	
		}
		
	};
	
	static{
		System.out.println (System.getProperty("user.home"));

	}
	
	
	 
}
