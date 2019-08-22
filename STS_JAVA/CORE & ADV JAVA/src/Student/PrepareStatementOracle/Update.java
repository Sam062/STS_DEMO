package Student.PrepareStatementOracle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Update {
	public static void main(String[] args) {
		String driver="oracle.jdbc.driver.OracleDriver";
		String url="jdbc:oracle:thin:@localhost:1521:ORCL";
		String un="system";
		String pwd="root";

		String sql="update Student set name=?,marks=? where sid=?";

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
			sc.close();
			//END
			
			ps.setInt(3,sid);
			ps.setString(1, sname);
			ps.setDouble(2, marks);
			
			int count=ps.executeUpdate();
			System.out.println("Updated :"+count);
			con.close();

		} catch (Exception e) {
			System.err.println(e);
		}
	}

}
