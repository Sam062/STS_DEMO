package com.oracleCURD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertIntoDB {
	public static void main(String[] args) {

		//jdbc properties
		String driver="oracle.jdbc.driver.OracleDriver";
		String url="jdbc:oracle:thin:@localhost:1521:ORCL";
		String un="system";
		String pwd="root";
		
		//sql query
		String sql="insert into javademo values(2,'ABC',123.12)";

		try {
			//loading driver class
			Class.forName(driver);

			//creating connection
			Connection con=DriverManager.getConnection(url,un,pwd);

			//creating statement
			Statement st=con.createStatement();

			//Execute sql and get result
			int count=st.executeUpdate(sql);
			System.out.println("Inserted :"+count);

			//closing connection
			con.close();

		} catch (Exception e) {
			System.err.println(e);
		}
	}

}
