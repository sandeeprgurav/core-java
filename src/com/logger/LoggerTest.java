package com.logger;

import org.apache.log4j.Logger ;

public class LoggerTest
{
  Logger test=Logger.getLogger ( LoggerTest.class );
  
  public void doSomething(){
	  test.info ( "Inside DoSomething" );
  }
}
