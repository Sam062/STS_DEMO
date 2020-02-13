package com.app.rechargeOracle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Update {
	public static void main(String[] args) {
		String driver="oracle.jdbc.driver.OracleDriver";
		String url="jdbc:oracle:thin:@localhost:1521:ORCL";
		String un="system";
		String pwd="root";
		
		String sql="update recharge set amt=45, status='FAILED' where txid=101";
		
		try {
			Class.forName(driver);
			Connection con=DriverManager.getConnection(url,un,pwd);
			Statement st=con.createStatement();
			int count=st.executeUpdate(sql);
			System.out.println("Updated "+count);
			
		} catch (Exception e) {
			System.err.println(e);
		}
	}

}
