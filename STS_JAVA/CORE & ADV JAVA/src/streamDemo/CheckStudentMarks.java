package streamDemo;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class CheckStudentMarks {
	public static void main(String[] args) {
		List<Integer> marks=new ArrayList<Integer>();
		marks.add(50);
		marks.add(60);
		marks.add(90);
		marks.add(40);
		marks.add(85);
		
		System.out.println(marks);
		
		Predicate<Integer> p=i->i>40;
		
		//List<Integer> l1=marks.stream().filter(p).collect(Collectors.toList());
		//or
		List<Integer> l1=marks.stream().filter(i->i>40).collect(Collectors.toList());
		
		System.out.println("pass Students :");
		System.out.println(l1);

		System.out.println("no of pass Students");

		System.out.println(l1.stream().count());
		
		Integer min=marks.stream().min((i1,i2)->-i1.compareTo(i2)).get();
		System.out.println(min);
		
		marks.forEach(System.out::println);
		
	}

}
