package com.comparator ;
import java.util.ArrayList ;
import java.util.Collections ;
import java.util.List ;

public class ComparatorTest
{
	public static void main ( String [ ] args )
	{
          
		List<Department> list=new ArrayList<Department>();
		list.add ( new Department ( "Aaaa" , 10 ) );
		list.add ( new Department ( "Dddd" , 40) );
		list.add ( new Department ( "Cccc" , 30 ) );
		list.add ( new Department ( "Bbbb" , 20 ) );
			
		DepartmentComparator comparator=new DepartmentComparator ( DepartmentComparator.ComparatorType.NAME );
		Collections.sort ( list,comparator );
		System.out.println (list) ;
		
		
	}
}
