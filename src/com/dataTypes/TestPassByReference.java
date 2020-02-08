package com.dataTypes;
import java.util.ArrayList ;
import java.util.List ;


public class TestPassByReference
{
	  public static void main(String[] args) {
          // declare and initialize variables and objects
          Integer i =new Integer( 25);
          String s = "Java is fun!";
          List<String> list=new ArrayList < String> ( );          
          list.add("sushi");
          list.add("sandeep");
          list.add("pritam");
          System.out.println ("List hashcode==>>"+list) ;
          
          
          sbMethod(list);
          System.out.println ("List in method==>>>"+list.toString ( )) ;
          
          StringBuffer sb = new StringBuffer("Hello, world");

          // print variable i and objects s and sb
          System.out.println(i);     // print it (1)
          System.out.println(s);    // print it (2)
          System.out.println(sb);  // print it (3)

          // attempt to change i, s, and sb using methods
          iMethod(i);
          sMethod(s);
          sbMethod(sb);

          System.out.println ("Integer main integer==>>"+i.hashCode ( ));
          System.out.println ("Intege main sb==>>"+sb.hashCode ( ));
          // print variable i and objects s and sb (again)
          i=new Integer( 100);
          System.out.println(i);    // print it (7)
          System.out.println ("Integer main integer==>>"+i.hashCode ( ));
          
          s="sandeep";
           System.out.println ("String main ==>>"+s.hashCode ( ));
           System.out.println(s);   // print it (8)
           System.out.println("last sb"+sb); // print it (9)

   }

   public static void iMethod(Integer iTest) {
          iTest = 9; 
          System.out.println ("Intege methodr integer==>>"+iTest.hashCode ( ));// change it          
          System.out.println(iTest); // print it (4)
          return;
   }

   public static void sMethod(String sTest) {
	   	 System.out.println ("String main ==>>"+sTest.hashCode ( ));
          sTest = sTest.substring(8, 11); // change it
          System.out.println(sTest);        // print it (5)
          return;
   }

   public static void sbMethod(StringBuffer sbTest) {
	   
	   	  System.out.println ("sb methodr ==>>"+sbTest.hashCode ( ));// change it
	   	  
          sbTest = sbTest.insert(7, "Java "); // change it
          
          sbTest=new StringBuffer();
          System.out.println("SB In Method");            // print it (6)
          return;
    }

   public static void sbMethod(List<String> sbTest) {
	   System.out.println ("List hashcode==>>"+sbTest) ;
	   //sbTest=new ArrayList < String > ( );
	   sbTest.add ( "dhgfgh" );
	   //sbTest.remove ( 0 );	   
       return;
 }
}
