package interviewer_Tasks;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class ArrayFreqCollection {
	public static void main(String[] args) {

		//reading array
		Scanner sc=new Scanner(System.in);
		int size;
		System.out.println("Input size of the array :");
		size=sc.nextInt();
		
		int[] a= new int[size];
		System.out.println("input Array :");
		for (int i = 0; i < size; i++) {
			a[i]=sc.nextInt();
		}
		sc.close();
		//reading end
		
		Map<Integer,Integer> m=new LinkedHashMap<>();
		for (int i = 0; i < size; i++) {
			int num=a[i];
			if(m.get(num)!=null)
			{
				m.put(num, m.get(num)+1);
			}
			else
				m.put(num,1);
		}
		System.out.println(m);
		Iterator<Integer> it=m.keySet().iterator();
		while(it.hasNext()) {
			int num=it.next();
			if(m.get(num)>=1)
				System.out.println(num+"="+m.get(num)+" times");
		}
		
		
	}
}
