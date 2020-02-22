package com.ocp.exceptions6;

import java.sql.SQLException;

public class ExceptionTest19 {
	public void read() throws SQLException {
		try {
		//readFromDatabase(); 
			int x = 1/0;
		//} catch (Exception | SQLException e) { SQLException is not thrown in tray lock so unreachable exception
		} catch (ArithmeticException e) {			
			//throw e; //This will work
			//throw new Exception(); This will not work need to change throws to Exception			
		}
		}

	private void readFromDatabase() throws SQLException {
	}
}

//Ans: SQL Exception | IO Exception
/*
Options:
1. RuntimeException
2. SQL Exception | Runtime Exception
3. SQLException
4. SQL Exception | IO Exception
5. Exception*/




