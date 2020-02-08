package com.accessModifier.pkg2;

import com.accessModifier.pkg1.MySuper;

public class MySub extends MySuper{
	 
	   int i = 5;
	   //int x = 7;
	 
	   void method(){
	      MySuper mySuper = new MySuper();
	      System.out.print(mySuper.i);
	      //System.out.print(mySuper.x); cant access protected variable in extended class
	      
	      MySub mySub= new MySub();
	      System.out.print(mySub.x); //can access protected variable in extended class through inheritance.
	      
	   }
	   public static void main(String[] args){
	      MySub ms = new MySub();
	      ms.method();
	   }
}