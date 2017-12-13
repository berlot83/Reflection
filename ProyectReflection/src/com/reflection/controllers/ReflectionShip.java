package com.reflection.controllers;

import java.lang.reflect.Modifier;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.reflection.dao.IConnection;
import com.reflection.model.Ship;

public class ReflectionShip {

	public void getShip(int id) throws SQLException {
		Connection connection = null;
		PreparedStatement ps = null;
		
		
		try {
			connection = IConnection.getConnection();

			if (connection != null) {
				String sql = "SELECT * FROM ship WHERE id=" + id;
				ps = connection.prepareStatement(sql);
				ResultSet rs = ps.executeQuery();

				while (rs.next()) {
					int idDb = rs.getInt("int");
				}
			} else {
				System.out.println("Unable to realize query");
			}
		} catch (Exception error) {
			System.out.println("Cannot connect");
			System.out.println(error.getMessage());
		}finally{
			ps.close();
		}
	}

}
