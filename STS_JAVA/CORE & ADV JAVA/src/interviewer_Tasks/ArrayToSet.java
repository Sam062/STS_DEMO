package interviewer_Tasks;

import java.util.Arrays;
import java.util.List;

public class ArrayToSet {
	public static void main(String[] args) {
		Integer[] a= {1,1,2,3,4,5};
		
		List s1=Arrays.asList(a);
		List s2=Arrays.asList(a);
		
		System.out.println(s1.containsAll(s2));
		s1.retainAll(s2);
		System.out.println("retainAll");
		System.out.println(s1);
		

//		Set<Integer> s=new LinkedHashSet<>(s1);
//		System.out.println(s);
	}
}
