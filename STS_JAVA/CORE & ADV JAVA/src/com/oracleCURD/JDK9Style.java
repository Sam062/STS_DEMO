package com.oracleCURD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDK9Style {
		public static void main(String[] args) throws SQLException {
				//1-JDBC properties
			String url="jdbc:oracle:thin:@localhost:1521:ORCL";
			String un="system";
			String pwd="root";
			
			//2-Loading Driver class automatically done 
			
			//3-Creating connection
			Connection conn=DriverManager.getConnection(url,un,pwd);
			try(conn) {
				System.out.println("Connected\n"+conn);
			} catch (SQLException e) {
				System.err.println("Connection not created");
			}
			System.out.println("Done!");
		}
}
