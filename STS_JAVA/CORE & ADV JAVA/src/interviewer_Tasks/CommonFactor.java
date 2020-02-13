package interviewer_Tasks;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class CommonFactor {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Input First number :");
		int num=sc.nextInt();
		System.out.println("Input Second number :");
		int num1=sc.nextInt();
		sc.close();
		
		List<Integer> ls=new ArrayList<Integer>();
		for (int i = 1; i <= num/2; i++) {
			if(num%i==0)
				ls.add(i);
		}
		List<Integer> ls1=new ArrayList<Integer>();
		for (int i = 1; i <= num1/2; i++) {
			if(num1%i==0)
				ls1.add(i);
		}
		List<Integer> commonValues=new ArrayList<Integer>();
		Iterator<Integer> i=ls.iterator();
		while(i.hasNext()) {
			int val=i.next();
			Iterator<Integer> i1=ls1.iterator();
			while(i1.hasNext()) {
				if(val==i1.next()) {
					commonValues.add(val);
				}
			}
		}
		System.out.println("First No Factors :"+ls);
		System.out.println("Second No Factors :"+ls1);
		System.out.println("Common Factors :"+commonValues);
	}

}
