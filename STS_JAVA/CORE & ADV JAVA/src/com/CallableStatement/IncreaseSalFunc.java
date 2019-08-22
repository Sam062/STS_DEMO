package com.CallableStatement;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;
import java.util.Scanner;

public class IncreaseSalFunc {
	public static void main(String[] args) {
		String url="jdbc:oracle:thin:@localhost:1521:ORCL";
		String un="Systema";
		String pwd="root";

		String sql="{?=call IncreaseSal(?,?)}";

		Connection con=null;
		CallableStatement cs=null;

		try {
			con=DriverManager.getConnection(url,un,pwd);
			cs=con.prepareCall(sql);
			cs.registerOutParameter(1, Types.DOUBLE);

			//reading input
			Scanner sc=new Scanner(System.in);
			System.out.println("Input hike sal :");
			double hike=sc.nextDouble();
			System.out.println("Input emp id :");
			int id=sc.nextInt();
			sc.close();
			//end

			//passing input to sql
			cs.setDouble(2, hike);
			cs.setInt(3, id);
			cs.execute();
			//end

			//reading output
			double finSal=cs.getDouble(1);
			System.out.println("Done final sal="+finSal);

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
