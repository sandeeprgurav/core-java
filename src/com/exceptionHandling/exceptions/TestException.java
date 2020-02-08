package com.exceptionHandling.exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;

public class TestException {

	public static void main(String[] args) throws Exception {
		try {
			testExceptions();
		} catch (IOException | RuntimeException e) {
			File logFile = new File("logFile.log");
			PrintWriter  pw= new PrintWriter(logFile);
			e.printStackTrace();			
			System.out.println(getStackTrace(e)); 
			//throw new Exception("Runtime or IO Exception Occured in TestException.main method!");
		} finally {
			//close resources line DB connection, Hibernate session etc 
		}
	}
	
	
	public static void testExceptions() throws IOException, FileNotFoundException{
		throw new IOException();
	}
	
	 public static String getStackTrace(Throwable aThrowable) {
		    final Writer result = new StringWriter();
		    final PrintWriter printWriter = new PrintWriter(result);
		    aThrowable.printStackTrace(printWriter);
		    return result.toString();
	}
}