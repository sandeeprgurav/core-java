package com.sorting;
import java.io.Serializable ;

@SuppressWarnings("serial")
public class Pojo implements Serializable,Comparable<String>
{

	private String name ;
	private int age ;
	private String lastName ;

	/**
	 * Constructs an object of Pojo
	 *
	 * @author: sandeepg
	 * @version: 1.0
	 * @Date: Dec 6, 2010 
	 */
	public Pojo ( )
	{
		super ( ) ;
		// TODO Auto-generated constructor stub
	}
	/**
	 * Constructs an object of Pojo
	 *
	 * @author: sandeepg
	 * @version: 1.0
	 * @Date: Dec 6, 2010 
	 * @param name
	 * @param age
	 * @param lastName
	 */
	public Pojo ( String name , int age , String lastName )
	{
		super ( ) ;
		this.name = name ;
		this.age = age ;
		this.lastName = lastName ;
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
	/**
	 * @return the lastName
	 */
	public String getLastName ( )
	{
		return lastName ;
	}
	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName ( String lastName )
	{
		this.lastName = lastName ;
	}
	/**
	 * @author: sandeepg
	 * @version: Dec 6, 2010
	 *
	 * @see java.lang.Object#hashCode()
	 */
	@ Override
	public int hashCode ( )
	{
		final int prime = 31 ;
		int result = 1 ;
		result = prime * result + age ;
		result = prime * result + ( ( lastName == null ) ? 0 : lastName.hashCode ( ) ) ;
		result = prime * result + ( ( name == null ) ? 0 : name.hashCode ( ) ) ;
		return result ;
	}
	/**
	 * @author: sandeepg
	 * @version: Dec 6, 2010
	 *
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@ Override
	public boolean equals ( Object obj )
	{
		if ( this == obj )
			return true ;
		if ( obj == null )
			return false ;
		if ( getClass ( ) != obj.getClass ( ) )
			return false ;
		Pojo other = ( Pojo ) obj ;
		if ( age != other.age )
			return false ;
		if ( lastName == null )
		{
			if ( other.lastName != null )
				return false ;
		}
		else if ( ! lastName.equals ( other.lastName ) )
			return false ;
		if ( name == null )
		{
			if ( other.name != null )
				return false ;
		}
		else if ( ! name.equals ( other.name ) )
			return false ;
		return true ;
	}
	/**
	 * @author: sandeepg
	 * @version: Dec 6, 2010
	 *
	 * @see java.lang.Object#toString()
	 */
	@ Override
	public String toString ( )
	{
		return "Pojo [age=" + age + ", lastName=" + lastName + ", name=" + name + "]" ;
	}
	@ Override
	public int compareTo ( String o )
	{
		
		// TODO Auto-generated method stub
		return 0 ;
	}

}
