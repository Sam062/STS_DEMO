package collectionConcepts;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapBasics {
	public static void main(String[] args) {
		Map m=new HashMap();
		m.put(101, "SAM");
		m.put(102, "mak");
		m.put(103, "dak");
		m.put(104, "bak");
		m.put(105, "lan");
		System.out.println(m);
		Set s=m.entrySet();
		Iterator itr=s.iterator();
		while(itr.hasNext()) {
			Map.Entry m1=(Map.Entry)itr.next();
			System.out.println(m1.getKey()+"---"+m1.getValue());
			if(m1.getKey().equals(101))
				m1.setValue("SHIVAM");			
		}
		System.out.println(m);
	}

}
