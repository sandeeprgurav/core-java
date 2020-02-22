package com.ocp.db5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DbTest9 {
	public static void choices(String url) throws SQLException {
		try (Connection conn = DriverManager.getConnection(url);
			Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
			ResultSet rs = stmt.executeQuery("select count(*) from people")) {
			rs.next();
			rs.absolute(0); // q1
			System.out.print(rs.getInt(1)); // q2
		}
	}

	public static void main(String[] args) throws SQLException {
		choices("");
	}
}

// Ans: Line q2 throws a SQLException.
