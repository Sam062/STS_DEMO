package com.app.IRCTCmysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Insert {
	public static void main(String[] args) {
		String driver="com.mysql.jdbc.Driver";
		String url="jdbc:mysql://localhost:3306/Shivam";// DB name is Shivam
		String un="root";
		String pwd="root";
		
		String sql="insert into irctc_ticket values(2,\"ABCDD\",\"1997-12-03\",\"HYD\",\"LKO\",120.20,\"SL\");";
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
