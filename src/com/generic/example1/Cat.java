package com.generic.example1;

public class Cat implements Animal
{

	private String name;
	private String weight;
	/**
	 * Constructs an object of Cat
	 *
	 * @author: sandeepg
	 * @version: 1.0
	 * @Date: Jan 5, 2011 
	 * @param name
	 * @param weight
	 */
	public Cat ( String name , String weight )
	{
		super ( ) ;
		this.name = name ;
		this.weight = weight ;
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
	 * @return the weight
	 */
	public String getWeight ( )
	{
		return weight ;
	}
	/**
	 * @param weight the weight to set
	 */
	public void setWeight ( String weight )
	{
		this.weight = weight ;
	}
	/**
	 * @author: sandeepg
	 * @version: Jan 5, 2011
	 *
	 * @see java.lang.Object#hashCode()
	 */
	@ Override
	public int hashCode ( )
	{
		final int prime = 31 ;
		int result = 1 ;
		result = prime * result + ( ( name == null ) ? 0 : name.hashCode ( ) ) ;
		result = prime * result + ( ( weight == null ) ? 0 : weight.hashCode ( ) ) ;
		return result ;
	}
	/**
	 * @author: sandeepg
	 * @version: Jan 5, 2011
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
		Cat other = ( Cat ) obj ;
		if ( name == null )
		{
			if ( other.name != null )
				return false ;
		}
		else if ( ! name.equals ( other.name ) )
			return false ;
		if ( weight == null )
		{
			if ( other.weight != null )
				return false ;
		}
		else if ( ! weight.equals ( other.weight ) )
			return false ;
		return true ;
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
		return "Cat [name=" + name + ", weight=" + weight + "]" ;
	}
	
	
}
