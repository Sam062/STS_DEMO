package com.sqlCURD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DeleteFromDB {
	public static void main(String[] args) {
		String driver="com.mysql.jdbc.Driver";
		String url="jdbc:mysql://localhost:3306/shivam";
		String un="root";
		String pwd="root";
		
		String sql="delete from javademo where id=4";
		
		try {
			Class.forName(driver);
			
			Connection con=DriverManager.getConnection(url,un,pwd);
			
			Statement st=con.createStatement();
			
			int count=st.executeUpdate(sql);
			System.out.println("Deleted "+count);
			
			con.close();
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
