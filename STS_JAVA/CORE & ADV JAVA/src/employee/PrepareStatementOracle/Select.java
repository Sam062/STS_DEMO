package employee.PrepareStatementOracle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Select {
	public static void main(String[] args) {
		String driver="oracle.jdbc.driver.OracleDriver";
		String url="jdbc:oracle:thin:@localhost:1521:ORCL";
		String un="system";
		String pwd="root";
		
		String sql="select * from emptab where empid=?";
		try {
			Class.forName(driver);
			Connection con=DriverManager.getConnection(url,un,pwd);
			PreparedStatement ps=con.prepareStatement(sql);

			// CORE JAVA
			Scanner sc=new Scanner(System.in);
			System.out.println("input emp_ID");
			int empid=sc.nextInt();
			sc.close();
			//END
			
			ps.setInt(1,empid);
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				empid=rs.getInt(1);
				String empname=rs.getString(2);
				String gender=rs.getString(3);
				double empsal=rs.getDouble(4);
				
				System.out.println(empid+" "+empname+" "+gender+" "+empsal);
			}
			con.close();

		} catch (Exception e) {
			System.err.println(e);
		}
	}

}
