package com.BLOB;

import java.io.FileOutputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Fetching {
	public static void main(String[] args) {
		String driver="oracle.jdbc.driver.OracleDriver";
		String url="jdbc:oracle:thin:@localhost:1521:ORCL";
		String un="systema";
		String pwd="root";
		
		String sql="select * from images where id=?";
		
		try {
			Class.forName(driver);
			Connection con=DriverManager.getConnection(url,un,pwd);
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setInt(1,101);
			ResultSet rs=ps.executeQuery();
			if(rs.next()) {
				Blob b=rs.getBlob(2);
				byte[] arr=b.getBytes(1, (int)b.length());
				//File
				FileOutputStream fos=new FileOutputStream("F:\\demo.png");
				fos.write(arr);
				fos.flush();
				fos.close();
				System.out.println("Done");
			}
			else
				System.out.println("no img found");
			con.close();						
			
		} catch (Exception e) {
			System.err.println(e);
		}
		
	}

}
