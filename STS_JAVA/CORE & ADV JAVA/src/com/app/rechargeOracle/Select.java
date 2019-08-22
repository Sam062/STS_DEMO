package com.app.rechargeOracle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Select {
	public static void main(String[] args) {
		String driver="oracle.jdbc.driver.OracleDriver";
		String url="jdbc:oracle:thin:@localhost:1521:ORCL";
		String un="system";
		String pwd="root";
		
		String sql="select * from recharge";
		
		try {
			Class.forName(driver);
			Connection con=DriverManager.getConnection(url,un,pwd);
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery(sql);
			while(rs.next()) {
				int txid=rs.getInt(1);
				double amt=rs.getDouble(2);
				String operator=rs.getString(3);
				String status=rs.getString(4);
				String Mobile=rs.getString(5);
				
				System.out.println(txid+"  "+amt+"  "+operator+" "+status+" "+Mobile);
			}
			
		} catch (Exception e) {
			System.err.println(e);
		}
	}


}
