package com.dataTypes;

public class StaticContentClass
{
	
	 public static int count;
	 public static int count1;
	 static 
	 {
		 count++;
		 System.out.println ("Inside StaticContentClass "+count1) ;
	 }
}
