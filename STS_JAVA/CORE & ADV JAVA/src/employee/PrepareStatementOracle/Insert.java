package employee.PrepareStatementOracle;

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
		
		String sql="insert into emptab values(?,?,?,?)";
		
		try {
			Class.forName(driver);
			
			Connection con=DriverManager.getConnection(url,un,pwd);
			PreparedStatement ps=con.prepareStatement(sql);
			// CORE JAVA
			Scanner sc=new Scanner(System.in);
			System.out.println("input EMP_ID");
			int empId=sc.nextInt();
			System.out.println("input EMP_NAME");
			String empName=sc.next();
			System.out.println("input GENDER");
			String gender=sc.next();
			System.out.println("input EMP_SAL");
			double empSal=sc.nextDouble();
			sc.close();
			//END
			
			ps.setInt(1,empId);
			ps.setString(2, empName);
			ps.setString(3, gender);
			ps.setDouble(4, empSal);
			
			
			int count=ps.executeUpdate();
			System.out.println("Inserted :"+count);
			con.close();
			
		} catch (Exception e) {
			System.err.println(e);
		}
	}

}
