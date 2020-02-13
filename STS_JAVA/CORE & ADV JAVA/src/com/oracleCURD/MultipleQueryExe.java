package com.oracleCURD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class MultipleQueryExe {
	public static void main(String[] args) throws SQLException {
		String url="jdbc:oracle:thin:@localhost:1521:ORCL";
		String un="Systema";
		String pwd="root";
		
		String q1="update emptab set esal=esal-200 where eid=1";
		String q2="update emptab set esal=esal+200 where eid=3";
		
		int count=0;
		int count1=0;
		
		
		
		Connection con=DriverManager.getConnection(url, un, pwd);
		con.setAutoCommit(false);
		Statement s=con.createStatement();
		
		try(con;s) {
			count=s.executeUpdate(q1);
			count1=s.executeUpdate(q2);
			
			if(count==1 && count1==1){
				System.out.println("success");
				con.commit();
			}
			else {
				System.out.println("Fail");
				con.rollback();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
