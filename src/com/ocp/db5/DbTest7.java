package com.ocp.db5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DbTest7 {
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		/*String url = "jdbc:derby:precipitation";
		try (Connection conn = DriverManager.getConnection(url);
		Statement stmt = conn.createStatement(
		ResultSet.CONCUR_READ_ONLY,
		ResultSet.TYPE_SCROLL_INSENSITIVE);
		//boolean x = stmt.execute("select total from precip where type = 'rain'")){};
		ResultSet rs = stmt.execute(       "select total from precip where type = 'rain'")) {
		System.out.println(rs.getString("total"));
		}*/
	}
}
// Ans: 	There is a compiler error on the line of code that creates the ResultSet.
