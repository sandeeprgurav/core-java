package com.serialization ;

import java.io.FileOutputStream ;
import java.io.IOException ;
import java.io.ObjectOutputStream ;

public class MainWrite
{

	public static void main ( String [ ] args )
	{
		String filename = "time.ser" ;
		if ( args.length > 0 )
		{
			filename = args [ 0 ] ;
		}
		Department dept = new Department ( "Sandeep" , 24 ) ;
		FileOutputStream fos = null ;
		ObjectOutputStream out = null ;
		try
		{
			fos = new FileOutputStream ( filename ) ;
			out = new ObjectOutputStream ( fos ) ;
			out.writeObject ( dept ) ;
			dept.setAge ( 25 );
			dept.setName ( "Sandesh" );
			out.writeObject ( dept ) ;
			out.close ( ) ;
		}
		catch ( IOException ex )
		{
			ex.printStackTrace ( ) ;
		}
	}
}
