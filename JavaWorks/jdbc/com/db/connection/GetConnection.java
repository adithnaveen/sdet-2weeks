package com.db.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class GetConnection {
	public static Connection conn; 
	public PreparedStatement ps1, ps2, ps3; 
	public ResultSet rs1, rs2, rs3; 
	
	
	public static Connection getOracleConnection() {
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver"); 
			conn = DriverManager.getConnection(
			        "jdbc:oracle:thin:@localhost:1521:orcl", 
					"naveen", "naveen");
			return conn;
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

		
		return null; 
	}
	
	public static Connection getMySQLConnection() {
		return null;
	}
	
	
	public static void main(String[] args) {
		System.out.println(getOracleConnection()!=null?"Connected":"Not Connected");
		
	}
}
