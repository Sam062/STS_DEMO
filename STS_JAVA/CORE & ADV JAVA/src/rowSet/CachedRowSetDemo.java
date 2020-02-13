package rowSet;

import java.util.Collection;

import javax.sql.rowset.CachedRowSet;

import oracle.jdbc.rowset.OracleCachedRowSet;

public class CachedRowSetDemo {
	public static void main(String[] args) throws Exception {
		CachedRowSet cs=new OracleCachedRowSet();
		cs.setUrl("jdbc:oracle:thin:@localhost:1521:ORCL");
		cs.setUsername("systema");
		cs.setPassword("root");
		cs.setCommand("select * from emptab");
		
		cs.execute();
		
		while(cs.next()) {
			System.out.println(cs.getInt(1)+"  "+cs.getString(2)+"  "+cs.getDouble(3)+" "+cs.getString(4));
		}
		Collection c=cs.toCollection();
		System.out.println();
		System.out.println(c);
		cs.close();
	}

}
