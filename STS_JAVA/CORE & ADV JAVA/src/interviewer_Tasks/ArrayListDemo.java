package interviewer_Tasks;

import java.util.ArrayList;

public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(10);
		al.add(15);
		al.add(20);
		al.add(25);
		StringBuilder s=new StringBuilder("select * from database in(");
		for (Integer integer : al) {
			s.append(integer).append(",");
		}
		s.deleteCharAt(s.length()-1);
		s.append(")");
		System.out.println(s);
	}

}
