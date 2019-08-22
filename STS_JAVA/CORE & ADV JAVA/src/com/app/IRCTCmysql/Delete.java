package com.app.IRCTCmysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Delete {
	public static void main(String[] args) {
		String driver="com.mysql.jdbc.Driver";
		String url="jdbc:mysql://localhost:3306/shivam";
		String un="root";
		String pwd="root";
		
		String sql="delete from irctc_ticket where id=2";
		
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
