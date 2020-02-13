package employee.PrepareStatementOracle;

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

		String sql="update emptab set empname=?,empsal=? where empid=?";

		try {
			Class.forName(driver);
			Connection con=DriverManager.getConnection(url,un,pwd);
			PreparedStatement ps=con.prepareStatement(sql);

			// CORE JAVA
			Scanner sc=new Scanner(System.in);
			System.out.println("input emp_ID");
			int empid=sc.nextInt();
			System.out.println("input emp_NAME");
			String empname=sc.next();
			System.out.println("input emp_SAL");
			double empsal=sc.nextDouble();
			sc.close();
			//END

			ps.setInt(3,empid);
			ps.setString(1, empname);
			ps.setDouble(2, empsal);

			int count=ps.executeUpdate();
			System.out.println("Updated :"+count);
			con.close();

		} catch (Exception e) {
			System.err.println(e);
		}
	}

}
