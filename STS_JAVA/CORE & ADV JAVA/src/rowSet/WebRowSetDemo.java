package rowSet;

import javax.sql.rowset.WebRowSet;

import oracle.jdbc.rowset.OracleWebRowSet;

public class WebRowSetDemo {
	public static void main(String[] args) throws Exception {
		WebRowSet w=new OracleWebRowSet();
		w.setUrl("jdbc:oracle:thin:@localhost:1521:ORCL");
		w.setUsername("systema");
		w.setPassword("root");
		w.setCommand("select * from emptab");
		
		w.execute();
		
		while(w.next()) {
			System.out.println(w.getInt(1)+"  "+w.getString(2)+"  "+w.getDouble(3)+" "+w.getString(4));
		}
		
		w.writeXml(System.out);
		
		w.close();
	}

}
