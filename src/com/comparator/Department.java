package com.comparator ;
import java.io.Serializable ;

public class Department implements Serializable , Comparable<Department>
{

	private String name ;
	private int age ;

	/**
	 * Constructs an object of Department
	 *
	 * @author: sandeepg
	 * @version: 1.0
	 * @Date: Dec 8, 2010 
	 * @param name
	 * @param age
	 */
	public Department ( String name , int age )
	{
		super ( ) ;
		this.name = name ;
		this.age = age ;
	}
	/**
	 * @author: sandeepg
	 * @version: Jan 5, 2011
	 *
	 * @see java.lang.Object#toString()
	 */
	@ Override
	public String toString ( )
	{
		return "Department [age=" + age + ", name=" + name + "]" ;
	}
	/**
	 * @return the name
	 */
	public String getName ( )
	{
		return name ;
	}
	/**
	 * @param name the name to set
	 */
	public void setName ( String name )
	{
		this.name = name ;
	}
	/**
	 * @return the age
	 */
	public int getAge ( )
	{
		return age ;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge ( int age )
	{
		this.age = age ;
	}

	@ Override
	public int compareTo ( Department dept )
	{
		// TODO Auto-generated method stub
		return this.age- dept.age;
	}

}
