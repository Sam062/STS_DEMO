package com.BLOB.mysql;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.DriverManager;


public class InsertImage {
	public static void main(String[] args) {
		String driver="com.mysql.jdbc.Driver";
		String url="jdbc:mysql://localhost:3306/Shivam";// DB name is Shivam
		String un="root";
		String pwd="root";
		
		String sql="insert into imgtab values(?,?)";
		
		try {
			Class.forName(driver);
			java.sql.Connection con=DriverManager.getConnection(url,un,pwd);
			java.sql.PreparedStatement ps=con.prepareStatement(sql);
			//file loading
			File f=new File("D:\\Demo.docx");
			FileInputStream fis=new FileInputStream(f);
			//ends
			
			ps.setInt(1, 101);
			ps.setBinaryStream(2, (InputStream)fis,f.length());
			
			int count=ps.executeUpdate();
			System.out.println("inserted :"+count);
			con.close();
			
		} catch (Exception e) {
			System.err.println(e);
		}
	}

}
