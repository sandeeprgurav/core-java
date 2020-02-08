package com.comparator ;
import java.util.Comparator ;

public class DepartmentComparator implements Comparator < Department >
{

	private ComparatorType compType ;

	public enum ComparatorType
	{
		NAME , AGE
	}

	public DepartmentComparator ( ComparatorType comparatorType )
	{
		this.compType = comparatorType ;
	}

	public int compare ( Department obj1 , Department obj2 )
	{
		switch ( compType )
		{
			case NAME :
				return compare ( obj1.getName ( ) , obj2.getName ( ) ) ;
			case AGE :
				return compare ( obj1.getAge ( ) , obj2.getAge ( ) ) ;
			default :
				return 0 ;
		}
	}

	public int compare ( String arg1 , String arg2 )
	{
		return arg1.compareTo ( arg2 ) ;
	}

	public int compare ( Integer arg1 , Integer arg2 )
	{
		return arg1.compareTo ( arg2 ) ;
	}
}
