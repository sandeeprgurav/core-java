package com.servlet;

import java.io.IOException ;

import javax.servlet.ServletException ;
import javax.servlet.http.HttpServlet ;
import javax.servlet.http.HttpServletRequest ;
import javax.servlet.http.HttpServletResponse ;

public class ServletTest extends HttpServlet
{

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = - 6644532729451683133L ;
	
	@ Override
	protected void doPost ( HttpServletRequest req , HttpServletResponse resp ) throws ServletException , IOException
	{
		// TODO Auto-generated method stub
		resp.sendRedirect ("");
		
		super.doPost ( req , resp ) ;
	}

}
