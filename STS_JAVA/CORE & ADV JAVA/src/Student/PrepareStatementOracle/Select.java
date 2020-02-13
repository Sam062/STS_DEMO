package Student.PrepareStatementOracle;

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
		
		String sql="select * from student where sid=?";
		try {
			Class.forName(driver);
			Connection con=DriverManager.getConnection(url,un,pwd);
			PreparedStatement ps=con.prepareStatement(sql);

			// CORE JAVA
			Scanner sc=new Scanner(System.in);
			System.out.println("input SID");
			int sid=sc.nextInt();
			sc.close();
			//END
			
			ps.setInt(1,sid);
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				sid=rs.getInt(1);
				String name=rs.getString(2);
				double marks=rs.getDouble(3);
				String gender=rs.getString(4);
				
				System.out.println(sid+" "+name+" "+marks+" "+gender);
			}
			con.close();

		} catch (Exception e) {
			System.err.println(e);
		}


	}
}
