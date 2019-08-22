package completeJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import javax.sql.rowset.CachedRowSet;

import oracle.jdbc.rowset.OracleCachedRowSet;

public class OperationsJDBC {
	static Scanner sc=new Scanner(System.in);
	static String url="jdbc:oracle:thin:@localhost:1521:ORCL";
	static String user="systema";
	static String password="root";

	public static void main(String[] args) throws Exception {
		while(true) {
			System.out.println("\nFor Insert/Delete/Update/Select/Exit Press I/D/U/S/exit  :");
			String c=sc.next();
			if(c.equals("I"))
				insertion();
			else if(c.equals("D"))
				deletion();
			else if(c.equals("U"))
				updation();
			else if(c.equals("S"))
				selection();
			else if(c.equals("E")) {
				System.out.println("Exit !!");
				break;
			}
			else
				System.out.println("Invalid Choice Plz Choose in I/D/U/S/E !");
		}
	}
	private static void selection() throws SQLException {
		System.out.println("SELECTION");
		CachedRowSet jrs=new OracleCachedRowSet();
		jrs.setUrl("jdbc:oracle:thin:@localhost:1521:ORCL");
		jrs.setUsername("systema");
		jrs.setPassword("root");
		jrs.setCommand("select * from alloperation");
		jrs.execute();
		while(jrs.next()) {
			System.out.println("\t"+jrs.getInt(1)+"\t\t"+jrs.getString(2)+"\t\t"+jrs.getString(3));
		}
		jrs.close();
	}
	private static void updation() throws SQLException {
		System.out.println("UPDATION");
		Connection con=DriverManager.getConnection(url, user, password);
		PreparedStatement ps=con.prepareStatement("update alloperation set name=?,gender=? where (id=?)");

		System.out.println("Input name :");
		String name=sc.next();
		System.out.println("Input Gender :");
		String gender=sc.next();
		System.out.println("Input ID :");
		int id=sc.nextInt();

		ps.setString(1, name);
		ps.setString(2, gender);
		ps.setInt(3,id);
		int count=ps.executeUpdate();
		System.out.println(count+" Rows Updated !");
		con.close();

	}
	private static void deletion() throws SQLException {
		System.out.println("DELETION");
		Connection con=DriverManager.getConnection(url, user, password);
		PreparedStatement ps=con.prepareStatement("delete from alloperation where id=?");

		System.out.println("Input ID :");
		int id=sc.nextInt();

		ps.setInt(1, id);
		int count=ps.executeUpdate();
		System.out.println(count+" Rows Deleted");
		con.close();


	}
	private static void insertion() throws SQLException {
		System.out.println("INSERTION");
		Connection con=DriverManager.getConnection(url, user, password);
		PreparedStatement ps=con.prepareStatement("insert into alloperation values(?,?,?)");

		System.out.println("Input ID :");
		int id=sc.nextInt();
		System.out.println("Input name :");
		String name=sc.next();
		System.out.println("Input Gender :");
		String gender=sc.next();

		ps.setInt(1, id);
		ps.setString(2, name);
		ps.setString(3,gender);
		int count=ps.executeUpdate();
		System.out.println(count+" Rows Inserted");
		con.close();
	}
}
