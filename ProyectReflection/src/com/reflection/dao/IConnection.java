package com.reflection.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public interface IConnection {
	public static Connection getConnection() throws SQLException {
		Connection conn = null;
		String user = "root";
		String password = "";

		try {
			Class.forName("com.jdbc.mysql.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost/utnavanzado", user, password);
			System.out.println("Connection Estableshied");
		} catch (Exception error) {
			System.out.println("Cannot even connect");
			error.printStackTrace();
		}finally{
			conn.close();
		}
		return conn;
	}
}
