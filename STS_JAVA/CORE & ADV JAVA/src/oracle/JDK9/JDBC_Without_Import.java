package oracle.JDK9;


public class JDBC_Without_Import {
	public static void main(String[] args) throws java.sql.SQLException {
		String url="jdbc:oracle:thin:@localhost:1521:ORCL";
		String un="Systema";
		String pwd="root";
		
		String sql="insert into emptab values(?,?,?,?)";
		
		java.sql.Connection con=java.sql.DriverManager.getConnection(url,un,pwd);
		java.sql.PreparedStatement ps=con.prepareStatement(sql);
		int count=0;
		
		try(con;ps) {
			java.util.Scanner sc=new java.util.Scanner(System.in);
			System.out.println("input id :");
			int id=sc.nextInt();
			System.out.println("input name :");
			String name=sc.next();
			System.out.println("input salary :");
			double sal=sc.nextDouble();
			System.out.println("input department :");
			String dept=sc.next();
			sc.close();
			
			ps.setInt(1, id);
			ps.setString(2, name);
			ps.setDouble(3,sal);
			ps.setString(4,dept);
			
			count=ps.executeUpdate();
			
		} catch (java.sql.SQLException e) {
			e.printStackTrace();
		}
		
		if(count==0)
			System.out.println("Not executed");
		else
			System.out.println("success "+count);
	}
}
