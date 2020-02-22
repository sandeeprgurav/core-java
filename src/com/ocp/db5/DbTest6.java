package com.ocp.db5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DbTest6 {
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		/*String sql = "select * from animal";
		try (Connection conn = DriverManager.getConnection("jdbc:derby:zoo");
		Statement stmt = conn.createStatement(
		ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);

		ResultSet rs = stmt.executeQuery(sql));
		System.out.println(rs.beforeFirst());
		System.out.println(rs.absolute(5));
		System.out.println(rs.previous());
		System.out.println(rs.relative(-2));
		System.out.println(rs.afterLast());*/
	}
}
// Ans: 	The code does not compile. => rs.beforeFirst() and rs.afterLast() returns void
