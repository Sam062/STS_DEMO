package rowSet;

import java.sql.SQLException;

import javax.sql.RowSet;

import oracle.jdbc.rowset.OracleJDBCRowSet;


public class JdbcRowSet {
	public static void main(String[] args) throws SQLException{
		RowSet js=new OracleJDBCRowSet();
		js.setUrl("jdbc:oracle:thin:@localhost:1521:ORCL");
		js.setUsername("systema");
		js.setPassword("root");
		js.setCommand("select * from emptab");
		js.execute();
		while(js.next()) {
			System.out.println(js.getInt(1)+" "+js.getString(2)+" "+js.getDouble(3)+" "+js.getString(4));
		}
		System.out.println(js.isAfterLast());
		
		js.next();
		js.previous();
		js.first();
		js.last();
		
		js.close();
	}

}
