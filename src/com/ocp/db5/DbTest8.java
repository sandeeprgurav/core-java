package com.ocp.db5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DbTest8 {
	public static void choices(Connection conn, String sql) throws SQLException {
		try (Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(sql)) {
			System.out.println(rs.getInt(1));			
		}
	}
}
// Ans: ResultSet cursor is initially positioned before the first row; So it is
// needed to perform rs.next() to move cursor to first row of table.
/*Incorrect Option: 1. System.out.println(rs.getInt(1));*/
/* Correct options: 2. rs.next(); System.out.println(rs.getInt(1));
3. if (rs.next()) System.out.println(rs.getInt(1));*/