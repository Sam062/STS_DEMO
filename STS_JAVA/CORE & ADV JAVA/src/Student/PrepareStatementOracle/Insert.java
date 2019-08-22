package Student.PrepareStatementOracle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;


public class Insert {
	public static void main(String[] args) {
		String driver="oracle.jdbc.driver.OracleDriver";
		String url="jdbc:oracle:thin:@localhost:1521:ORCL";
		String un="system";
		String pwd="root";
		
		String sql="insert into student values(?,?,?,?)";
		try {
			Class.forName(driver);
			
			Connection con=DriverManager.getConnection(url,un,pwd);
			PreparedStatement ps=con.prepareStatement(sql);
			// CORE JAVA
			Scanner sc=new Scanner(System.in);
			System.out.println("input SID");
			int sid=sc.nextInt();
			System.out.println("input SNAME");
			String sname=sc.next();
			System.out.println("input MARKS");
			double marks=sc.nextDouble();
			System.out.println("input GENDER");
			String gender=sc.next();
			sc.close();
			//END
			
			ps.setInt(1,sid);
			ps.setString(2, sname);
			ps.setDouble(3, marks);
			ps.setString(4, gender);
			
			int count=ps.executeUpdate();
			System.out.println("Inserted :"+count);
			con.close();
			
			
		} catch (Exception e) {
			System.err.println(e);
		}
	}

}
