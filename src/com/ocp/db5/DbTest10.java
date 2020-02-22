package com.ocp.db5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DbTest10 {
   
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = null;
		Statement stmt = null;
		String sql;

		conn = DriverManager.getConnection("jdbc:mysql://localhost/?" + "user=root&password=Admin123");
		stmt = conn.createStatement();
		sql = "create database db";
		System.out.println(stmt.executeQuery(sql));
		
	}
}

// Ans: An Exception.


