package hackerRank_ProblemSolving;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class GradingStudents {
	
	 public static void gradingStudents(List<Integer> grades) {
		 ListIterator<Integer> itr=grades.listIterator();
		 while(itr.hasNext()) {
			 int num=itr.next();
			 if(num<38)
				 itr.set(num);
			 else if(((num/5)*5+5)-num<3)
				 itr.set((num/5)*5+5);			 
		 }
		 itr=grades.listIterator();
		 while(itr.hasNext()) {
			 System.out.println(itr.next());		 
		 }
		 
    }
	
    public static void main(String[] args){
    	int size;
    	System.out.println("Input no of subjects :");
    	Scanner sc=new Scanner(System.in);
    	size=sc.nextInt();
    	List<Integer> li=new ArrayList<Integer>();
    	System.out.println("Input marks obtained :");
    	for (int i = 0; i < size; i++) {
			li.add(sc.nextInt());
		}
    	System.out.println(li);
    	gradingStudents(li);
    	
    }
}
