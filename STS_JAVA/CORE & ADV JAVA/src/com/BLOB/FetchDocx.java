package com.BLOB;

import java.io.FileOutputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class FetchDocx {
	public static void main(String[] args) {
		String driver="oracle.jdbc.driver.OracleDriver";
		String url="jdbc:oracle:thin:@localhost:1521:ORCL";
		String un="system";
		String pwd="root";
		
		String sql="select * from imgtab where fid=?";
		try {
			Class.forName(driver);
			Connection con=DriverManager.getConnection(url,un,pwd); 
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setInt(1, 103);
			ResultSet rs=ps.executeQuery();
			if(rs.next()) {
				Blob b=rs.getBlob(2);
				byte[] arr=b.getBytes(1, (int)b.length());
				FileOutputStream fos=new FileOutputStream("F:\\A.docx");
				fos.write(arr);
				fos.flush();
				fos.close();
				System.out.println("Done !");
			}
			else
				System.out.println("NO doc found");
			con.close();
			
		} catch (Exception e) {
			System.err.println(e);
		}
	}

}
