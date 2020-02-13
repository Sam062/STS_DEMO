package Student.PrepareStatementOracle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Delete {
	public static void main(String[] args) {
		String driver="oracle.jdbc.driver.OracleDriver";
		String url="jdbc:oracle:thin:@localhost:1521:ORCL";
		String un="system";
		String pwd="root";
		
		String sql="delete from Student where sid=?";
		
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
			
			int count=ps.executeUpdate();
			System.out.println("Deleted :"+count);
			con.close();

		} catch (Exception e) {
			System.err.println(e);
		}
	}

}
