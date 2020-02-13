package com.app.IRCTCmysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Select {
	public static void main(String[] args) {
		String driver="com.mysql.jdbc.Driver";
		String url="jdbc:mysql://localhost:3306/shivam";
		String un="root";
		String pwd="root";
		
		String sql="select * from irctc_ticket";
		
		try {
			Class.forName(driver);
			
			Connection con=DriverManager.getConnection(url,un,pwd);
			
			Statement st=con.createStatement();
			
			ResultSet rs=st.executeQuery(sql);
			while(rs.next()) {
				int id=rs.getInt(1);
				String pname=rs.getString(2);
				String doj=rs.getString(3);
				String source=rs.getString(4);
				
				System.out.println(id+" "+pname+" "+doj+" "+source);
			}
			System.out.println("done!");
			
			con.close();
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
