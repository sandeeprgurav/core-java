package com.sorting;

import java.util.List;
import java.util.Set;

public class EqualAndHascodeMain {

	public int cal(List i){
	return 0;	
	}
	 
	public int cal(Set i){
		return 0;	
		}
	/**
	 * @param args
	 */
	public static final void main ( String [ ] args )
	{
		EqualAndHascodeMain test=new EqualAndHascodeMain();
			
			int $sdv;
			
			String aQuote = "'";
			System.out.print("That" + aQuote + "s mine!");
				
			
		/*
		        // Make a Vector
		        Vector original = new Vector();

		        // Make a StringBuffer and add it to the Vector
		        StringBuffer text = new StringBuffer("The quick brown fox");
		        original.addElement(text);

		        // Clone the vector and print out the contents
		        Vector clone = (Vector) original.clone();
		        System.out.println("A. After cloning");
		        printVectorContents(original, "original");
		        printVectorContents(clone, "clone");
		        System.out.println(
		            "--------------------------------------------------------");
		        System.out.println();

		        // Add another object (an Integer) to the clone and
		        // print out the contents
		        clone.addElement(new Integer(5));
		        System.out.println("B. After adding an Integer to the clone");
		        printVectorContents(original, "original");
		        printVectorContents(clone, "clone");
		        System.out.println(
		            "--------------------------------------------------------");
		        System.out.println();

		        // Change the StringBuffer contents
		        text.append(" jumps over the lazy dog.");
		        System.out.println("C. After modifying one of original's elements");
		        printVectorContents(original, "original");
		        printVectorContents(clone, "clone");
		        System.out.println(
		            "--------------------------------------------------------");
		        System.out.println();
		    }

		    public static void printVectorContents(Vector v, String name) {
		        System.out.println("  Contents of \"" + name + "\":");

		        // For each element in the vector, print out the index, the
		        // class of the element, and the element itself
		        for (int i = 0; i < v.size(); i++) {
		            Object element = v.elementAt(i);
		            System.out.println("   " + i + " (" +
		                element.getClass().getName() + "): " +
		                element);
		        }
		        System.out.println();
		    
		*/

		/*
		 *  difference between & and &&........
		 *  
		 *  & make all checks and done for bitwise operator.
		 *  where && if 1st condition get false discards all rest
		 */

		//		int a = 5 , b = 6 , c = 2 , d = 5 , e = 5 ;
		//
		//		if ( a == b & b > c & d == e )
		//		{
		//			System.out.println ( "true" ) ;
		//		}
		//		else
		//			System.out.println ( "false" ) ;

		Pojo Pojo1 = new Pojo ( "",100 , "str1" ) ;
		Pojo Pojo12 = new Pojo ( "",100 , "str1" ) ;
		

		Pojo Pojo2 = new Pojo ( "",200 , "str2" ) ;
		Pojo Pojo3 = new Pojo ( "",300 , "str3" ) ;
		Pojo Pojo4 = Pojo3 ;

//		System.out.println ( Pojo1.equals ( Pojo2 ) ) ;

		System.out.println ( "equals " + Pojo1.equals ( Pojo12 ) ) ;
		System.out.println ( "==  " + ( Pojo1 == Pojo12 ) ) ;

		System.out.println ( Pojo1 == Pojo2 ) ;

		String x = "A" ;
		String y = "B" ;
		String z = x ;
		String p = "A" ;
		
		String s1Object=new String("Sandeep");
		String s2Object=new String("Sandeep");

		System.out.println ( x.equals ( z ) ) ;
		System.out.println ( x == z ) ;

		System.out.println ( x == p ) ;
		System.out.println ( x.equals ( p ) ) ;
		
		System.out.println ("String Object eqauls check==>>"+s1Object.equals ( s2Object )) ;
		System.out.println ("String Object eqauls check==>>"+s1Object== s2Object ) ;		
		
		//System.out.println (x==z) ;

	}

	
}
