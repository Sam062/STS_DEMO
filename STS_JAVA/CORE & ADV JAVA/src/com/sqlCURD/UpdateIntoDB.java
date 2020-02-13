package com.sqlCURD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class UpdateIntoDB {
	public static void main(String[] args) {
		String driver="com.mysql.jdbc.Driver";
		String url="jdbc:mysql://localhost:3306/shivam";
		String un="root";
		String pwd="root";
		
		String sql="update javademo set name=\"SHIVAM\", sal=5000.00 where id=1";
		
		try {
			Class.forName(driver);
			
			Connection con=DriverManager.getConnection(url,un,pwd);
			
			Statement st=con.createStatement();
			
			int count=st.executeUpdate(sql);
			System.out.println("Updated "+count);
			
			con.close();
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
