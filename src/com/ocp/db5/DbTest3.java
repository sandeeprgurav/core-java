package com.ocp.db5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DbTest3 {
	public static void main(String[] args) throws SQLException {
		String sql = "select name from animal";
		try (Connection conn = DriverManager.getConnection("jdbc:derby:zoo");
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery(sql)) {
		rs.next();
		rs.previous();
		rs.previous();
		rs.next();
		rs.next();
		rs.absolute(2);
		
		System.out.println(rs.getString(1));
		}
	}
}
//	Ans: A SQLException is thrown.

