package com.dbconnection.jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/** 
 * Title: Main.java<p>
 * Description: <p>
 * @author      sandeepg
 * @version     1.0
 * Updation History:
 * <ul>
 * <li>sandeepg Dec 1, 2010 Initial</li>	
 * </ul>
 * Copyright (c) 2010 Global Travel Solutions, 
 * Unit No. C6, WICEL, Opp. MIDC, SEEPZ, Andheri (East), Mumbai -400 093, India.
 * All rights reserved.<p>
 *
 * This software is the confidential and proprietary information of
 * Global Travel Solutions ("Confidential Information").  You shall
 * not disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered
 * with Global Travel Solutions.
 *
 **/

/**
 * {@code Main}
 * <p><b>Description : </b>
 * 
 * @author sandeepg
 * @version 1.0
 * @Date Dec 1, 2010
 * 
 */
public class JDBCConnection
{

	private JDBCConnection()
	{
		super();

	}

	public static void main( String[] args ) throws ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException
	{
		
		

		getConnection( "" );
		/*
		IbeUserDTO a = new IbeUserDTO();
		a.setLoginId( "Sandeep" );
		a.setPassword( "Sandeep1" );
		IbeUserDTO a1 = new IbeUserDTO();
		a1.setLoginId( "Sandeep" );
		a1.setPassword( "Sandeep1" );

		String s1 = "AA";
		String s2 = "AA";
		System.out.println( s1.equals( s2 ) );
		System.out.println( s1 == s2 );
		*/		

		/*System.out.println(a.hashCode());
		System.out.println(a1.hashCode());*/

		/*System.out.println(a.equals( a1 ));
		System.out.println(a==a1 );*/

	}

	public static Connection getConnection( final String str ) throws ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException
	{
		String str2 = str;

		//Class cl = Class.forName( "oracle.jdbc.driver.OracleDriver" );

	/*	for ( Method method : cl.getMethods() )
		{
			System.out.println( method.getName() );
		}*/

		Connection c = DriverManager.getConnection( "jdbc:oracle:thin:@172.16.0.18:1521:GTSORCL", "IBE_DEV", "IBE_DEV" );
		System.out.println( c.getMetaData() );		
		
		return null;
	}
	
}

