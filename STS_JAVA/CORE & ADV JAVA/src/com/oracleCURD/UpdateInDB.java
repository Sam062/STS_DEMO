package com.oracleCURD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class UpdateInDB {
	public static void main(String[] args) {
		
		String driver="oracle.jdbc.driver.OracleDriver";
		String url="jdbc:oracle:thin:@localhost:1521:ORCL";
		String un="system";
		String pwd="root";
		
		String sql="update javademo set name='B',sal=153.20 where id=1";
		
		try {
			Class.forName(driver);
			
			Connection con=DriverManager.getConnection(url,un,pwd);
			
			Statement st=con.createStatement();
			
			int count=st.executeUpdate(sql);
			
			System.out.println("Updated :"+count);
			
			con.close();
			
		} catch (Exception e) {
			System.err.println(e);
		}
		
	}

}
