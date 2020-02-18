package com.ocp.db5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DbTest {
	public static void main(String[] args) throws SQLException {
		String url = "jdbc:derby:blue";
		try (Connection conn = DriverManager.getConnection(url);
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery("select count(*) from sky")) {
			System.out.println(rs.getInt(1));
		}
	}
}

//It throws a SQLException.