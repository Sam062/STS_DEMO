package com.sqlCURD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertIntoDB {

	public static void main(String[] args) {
		String driver="com.mysql.jdbc.Driver";
		String url="jdbc:mysql://localhost:3306/sam";// DB name is sam
		String un="root";
		String pwd="root";
		
		String sql="insert into javademo values(5,\"ZZTDD\",2545.25);";
		try {
			Class.forName(driver);
			
			Connection con=DriverManager.getConnection(url,un,pwd);
			
			Statement st=con.createStatement();
			
			int count=st.executeUpdate(sql);
			
			System.out.println("Inserted :"+count);
			
			con.close();
			
		} catch (Exception e) {
			System.err.println(e);
		}
	}
	
}
