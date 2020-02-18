package com.ocp.db5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DbTest4 {
	public static void main(String[] args) throws SQLException {
		String sql = "delete from Student where id=103";
		Connection conn = DriverManager.getConnection("jdbc:derby:zoo");
		Statement stmt = conn.createStatement();
		 System.out.println(""+stmt.execute(sql));		
	}
}
//	Ans: The program prints Status: true and two records are deleted from the Student table.


