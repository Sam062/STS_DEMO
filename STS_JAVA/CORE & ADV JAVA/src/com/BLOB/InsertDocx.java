package com.BLOB;

import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertDocx {
	public static void main(String[] args) {
		String driver="oracle.jdbc.driver.OracleDriver";
		String url="jdbc:oracle:thin:@localhost:1521:ORCL";
		String un="system";
		String pwd="root";
		
		String sql="insert into imgtab values(?,?)";
		try {
			Class.forName(driver);
			Connection con=DriverManager.getConnection(url, un, pwd);
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setInt(1, 103);
			//load file
			File f=new File("D:\\Demo.docx");
			FileInputStream fis=new FileInputStream(f);
			//ends
			ps.setBinaryStream(2, fis,fis.available());
			int count=ps.executeUpdate();
			System.out.println("Done"+count);
			con.close();
			
		} catch (Exception e) {
			System.err.println(e);
		}
	}

}
