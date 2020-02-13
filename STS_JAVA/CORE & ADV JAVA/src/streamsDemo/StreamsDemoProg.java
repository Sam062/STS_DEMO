package streamsDemo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsDemoProg {
	public static void main(String[] args) {
		List<Integer> li=new ArrayList<>();
		li.add(5);
		li.add(10);
		li.add(15);
		li.add(20);
		li.add(25);
		System.out.println(li);
		
		List<Integer> li2=li.stream().filter(i->i%2==0).collect(Collectors.toList());
		List<Integer> li3=li.stream().map(i->i<=15?i+1000:i+100).collect(Collectors.toList());
		System.out.println(li2);
		System.out.println(li3);
		
		//sorting of objects
		
		//internally using
		//List<Integer> abc=li.stream().sorted((i1,i2)->i1.compareTo(i2)).collect(Collectors.toList());
		List<Integer> abc=li.stream().sorted().collect(Collectors.toList());
		System.out.println(abc);
		
		//Sorting Descending
		List<Integer> xyz=li.stream().sorted((i1,i2)->i2.compareTo(i1)).collect(Collectors.toList());
		System.out.println(xyz);
		
		
		//sorting acc to String length and then alphabetical order
		List<String> list=new ArrayList<String>();
		list.add("shivam");
		list.add("Adarsh singh");
		list.add("adarsh pratap singh");
		list.add("utk");
		list.add("utkarsh shukla");
		System.out.println(list);
		
		//using lambda exp'n
		Comparator<String> c=(s1,s2)->{
			int s1l=s1.length();
			int s2l=s2.length();
			if(s1l<s2l)
				return -1;
			else if(s1l>s2l)
				return +1;
			else
				return s1.compareTo(s2);
		};
		List<String> listString=list.stream().sorted(c).collect(Collectors.toList());
		System.out.println(listString);
		
		
	}

}
