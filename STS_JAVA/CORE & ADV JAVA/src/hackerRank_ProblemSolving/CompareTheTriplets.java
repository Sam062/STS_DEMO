package hackerRank_ProblemSolving;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class CompareTheTriplets {

    // Complete the compareTriplets function below.
    static void compareTriplets(List<Integer> a, List<Integer> b) {
    	ListIterator<Integer> itr=a.listIterator();
    	ListIterator<Integer> itr1=b.listIterator();
    	int alice=0,bob=0;
    	while(itr.hasNext()&& itr1.hasNext()) {
    		int num=itr.next();
    		int num1=itr1.next();
    		if(num>num1)
    			alice++;
    		else if(num<num1)
    			bob++;
    	}
    	System.out.println(alice+" "+bob);        

    }

    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	List<Integer> li=new ArrayList<Integer>();
    	List<Integer> li1=new ArrayList<Integer>();
    	
    	System.out.println("Input 1 :");
    	for (int i = 0; i < 3; i++) {
    		int num=sc.nextInt();
    		li.add(num);
		}
    	
    	System.out.println("Input 2 :");
    	for (int i = 0; i < 3; i++) {
    		int num=sc.nextInt();
    		li1.add(num);
    	}
    	compareTriplets(li, li1);
    	
    	
        
    }
}
