package com.BLOB;

import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertPdf {
	public static void main(String[] args) {
		String driver="oracle.jdbc.driver.OracleDriver";
		String url="jdbc:oracle:thin:@localhost:1521:ORCL";
		String un="system";
		String pwd="root";
		
		String sql="insert into imgtab values(?,?)";
		
		try {
			Class.forName(driver);
			Connection con=DriverManager.getConnection(url,un,pwd);
			PreparedStatement ps=con.prepareStatement(sql);
			//file loading
			File f=new File("D:\\sample.pdf");
			FileInputStream fis=new FileInputStream(f);
			//ends
			
			ps.setInt(1, 102);
			ps.setBinaryStream(2, fis,fis.available());
			
			int count=ps.executeUpdate();
			System.out.println("inserted :"+count);
			con.close();
			
		} catch (Exception e) {
			System.err.println(e);
		}
	}

}
