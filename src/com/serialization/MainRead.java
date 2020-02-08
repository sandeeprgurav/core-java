package com.serialization;

import java.io.FileInputStream ;
import java.io.IOException ;
import java.io.ObjectInputStream ;

public class MainRead
{

	
	public static void main ( String [ ] args )
	{
		 String filename = "time.ser"; 
		     if(args.length > 0)
		     {
		       filename = args[0];
		     }
		   Department dept = null;
		   FileInputStream fis = null;
		   ObjectInputStream in = null;
		   try
		   {
		     fis = new FileInputStream(filename);
		     in = new ObjectInputStream(fis);
		     dept = (Department)in.readObject();
		     in.close();
		   }
		   catch(IOException ex)
		   {
		     ex.printStackTrace();
		   }
		   catch(ClassNotFoundException ex)
		   {
		     ex.printStackTrace();
		   }
		   System.out.println("Flattened time: " + dept);
		   System.out.println();		 

	}
	
	public static void main ( String [ ] args ,String str)  //can override main method.
	{
		
	}
}
