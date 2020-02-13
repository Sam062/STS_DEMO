package oracle.JDK9;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Insert {
	public static void main(String[] args) throws SQLException {
		String url="jdbc:oracle:thin:@localhost:1521:ORCL";
		String un="Systema";
		String pwd="root";
		
		String sql="insert into emptab values(?,?,?,?)";
		
		Connection con=DriverManager.getConnection(url,un,pwd);
		PreparedStatement ps=con.prepareStatement(sql);
		int count=0;
		
		try(con;ps) {
			ps.setInt(1, 505);
			ps.setString(2, "XYZ");
			ps.setDouble(3,503.151);
			ps.setString(4, "IT");
			
			count=ps.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		if(count==0)
			System.out.println("Not executed");
		else
			System.out.println("success "+count);
	}
}
