package com.oracleCURD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestDbConnection {
	public static void main(String[] args) {
			//1-JDBC properties
		String driver="oracle.jdbc.driver.OracleDriver";
		String url="jdbc:oracle:thin:@localhost:1521:ORCL";
		String un="system";
		String pwd="root";
		
		
			//2-Loading Driver class
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			System.err.println("No Driver class Found");
		}
		
		//3-Creating connection
		try {
			Connection conn=DriverManager.getConnection(url,un,pwd);
			System.out.println("Connected\t"+conn);
		} catch (SQLException e) {
			System.err.println("Connection not created");
		}
		System.out.println("Done!");
	}
}
