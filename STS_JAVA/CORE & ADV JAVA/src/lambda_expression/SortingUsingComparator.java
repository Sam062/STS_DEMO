package lambda_expression;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingUsingComparator {
	public static void main(String[] args) {
		
		List<Integer> li=new ArrayList<>();
		li.add(5);
		li.add(10);
		li.add(4);
		li.add(15);
		System.out.println(li);
		
		Comparator<Integer> c=(a,b)->{			
			//return b.compareTo(a);
			return (a>b)?-1:(a<b)?1:0;
		};
		
		//Collections.sort(li,c);
		//Collections.sort(li,(a,b)->{return (a>b)?-1:(a<b)?1:0;});
		Collections.sort(li,(a,b)->{return b.compareTo(a);});
		
		/*
		 * for ascending order 
		 * Collections.sort(li);
		 */
		System.out.println(li);
		
	}

}
