package com.ocp.db5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DbTest11 {
	public static void main(String[] args) throws SQLException {
		//In a table animal with 10 rows, how many times does true get output by the following?

		String sql = "select * from animal";
		try (Connection conn = DriverManager.getConnection("jdbc:derby:zoo");
		Statement stmt = conn.createStatement(
		ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);

		ResultSet rs = stmt.executeQuery(sql)) {
		System.out.println(rs.absolute(0)); //True //Calling relative(0) is valid, but doesnot change the cursor position. 
		System.out.println(rs.absolute(5)); //True
		System.out.println(rs.previous()); //True
		System.out.println(rs.relative(-2));
		System.out.println(rs.relative(-100));
}	
}
}
// Ans: Three

/*Options: 
Five
The code does not compile.
One
Four
Two
A SQLException is thrown.
Three

*/