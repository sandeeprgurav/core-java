package com.ocp.db5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DbTest2 {
	public static void main(String[] args) throws SQLException {
		String url = "jdbc:derby:music";
		Connection conn = DriverManager.getConnection(url);
		Statement stmt = conn.createStatement();
		stmt.execute("update songs set name = 'The New Song'");
	}
}

//Ans: 1. The code runs without error. 2. The execute() method returns a boolean.