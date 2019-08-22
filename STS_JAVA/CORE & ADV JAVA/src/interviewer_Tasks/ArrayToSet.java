package interviewer_Tasks;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ArrayToSet {
	public static void main(String[] args) {
		Integer[] a= {1,1,2,3,35,4,8,7,8,9,6,1,10};
		
		List s1=Arrays.asList(a);

		Set<Integer> s=new TreeSet<>(s1);
		System.out.println(s);
		
	}

}
