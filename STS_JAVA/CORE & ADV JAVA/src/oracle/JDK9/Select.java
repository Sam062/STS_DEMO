package oracle.JDK9;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Select {
	public static void main(String[] args) throws SQLException {
		String url="jdbc:oracle:thin:@localhost:1521:ORCL";
		String un="systema";
		String pwd="root";
		
		String sql="select * from emptab where eid=?";
		
		Connection con=DriverManager.getConnection(url, un, pwd);
		PreparedStatement ps=con.prepareStatement(sql);
		try(con;ps){
			ps.setInt(1, 1);
			ResultSet rs=ps.executeQuery();
			if(rs.next()) {
				int eid=rs.getInt(1);
				String ename=rs.getString(2);
				double esal=rs.getDouble(3);
				String dept=rs.getString(4);
				
				System.out.println(eid+" "+ename+" "+esal+" "+dept);
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}
