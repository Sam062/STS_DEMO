package com.app.rechargeOracle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Insert {
	public static void main(String[] args) {
		String driver="oracle.jdbc.driver.OracleDriver";
		String url="jdbc:oracle:thin:@localhost:1521:ORCL";
		String un="system";
		String pwd="root";
		
		String sql="insert into recharge values(110,50.22,'IDEA','SUCCEED','+91-98754')";
		
		try {
			Class.forName(driver);
			Connection con=DriverManager.getConnection(url,un,pwd);
			Statement st=con.createStatement();
			int count=st.executeUpdate(sql);
			System.out.println("Inserted "+count);
			
		} catch (Exception e) {
			System.err.println(e);
		}
	}

}
