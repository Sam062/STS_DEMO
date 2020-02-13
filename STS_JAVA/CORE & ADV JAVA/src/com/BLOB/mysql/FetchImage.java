package com.BLOB.mysql;

import java.io.FileOutputStream;
import java.sql.Blob;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class FetchImage {
	public static void main(String[] args) {
		String driver="com.mysql.jdbc.Driver";
		String url="jdbc:mysql://localhost:3306/Shivam";// DB name is Shivam
		String un="root";
		String pwd="root";
		
		String sql="select * from imgtab where fid=?";
		
		try {
			Class.forName(driver);
			java.sql.Connection con=DriverManager.getConnection(url,un,pwd);
			java.sql.PreparedStatement ps=con.prepareStatement(sql);
			ps.setInt(1, 101);
			ResultSet rs=ps.executeQuery();
			if(rs.next()) {
				Blob b=(Blob) rs.getBlob(2);
				byte[] arr=b.getBytes(1,(int) b.length());
				FileOutputStream fos=new FileOutputStream("F:\\zzz.docx");
				fos.write(arr);
				fos.flush();
				fos.close();
				System.out.println("done!");
			}
			else
				System.out.println("No file found");
			con.close();
			
		} catch (Exception e) {
			System.err.println(e);
		}

	}
}
