package com.BLOB;

import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Insertion {
	public static void main(String[] args) {
		String driver="oracle.jdbc.driver.OracleDriver";
		String url="jdbc:oracle:thin:@localhost:1521:ORCl";
		String un="systema";
		String pwd="root";
		
		String sql="insert into images values(?,?)";
		
		try {
			Class.forName(driver);
			Connection con=DriverManager.getConnection(url,un,pwd);
			PreparedStatement ps=con.prepareStatement(sql);
			//file
			File f=new File("D:\\abc.png");
			FileInputStream fis=new FileInputStream(f);
			//end
			ps.setInt(1, 102);
			ps.setBinaryStream(2, fis,fis.available());
			
			int count=ps.executeUpdate();
			System.out.println("DONE "+count);
			con.close();		
			
		} catch (Exception e) {
			System.err.println(e);
		}
	}

}
