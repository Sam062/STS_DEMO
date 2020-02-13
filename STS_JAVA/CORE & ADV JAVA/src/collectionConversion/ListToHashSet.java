package collectionConversion;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class ListToHashSet {
	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(10);
		al.add(10);
		al.add(100);
		al.add(100);
		al.add(500);
		System.out.println(al);
		HashSet<Integer> h=new HashSet<Integer>(al);
		Set<Integer> s=new LinkedHashSet<Integer>(al);
		
		System.out.println(s);
		System.out.println(h);
	}

}
