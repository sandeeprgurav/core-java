package com.ocp.exceptions6;

import java.sql.SQLException;

class MissingMoneyException extends Exception {}
class MissingFoodException extends Exception {}
public class ExceptionTest20 {
	 public void doIHaveAProblem() throws MissingMoneyException,          MissingFoodException {
	      System.out.println("No problems");
	   }
	   public static void main(String[] lots) throws MissingMoneyException,          MissingFoodException {
	      try {
	         final ExceptionTest20 p = new ExceptionTest20();
	         p.doIHaveAProblem();
	      } catch (Exception e) {
	         throw e;
	      }
	   }
}

//Ans: 