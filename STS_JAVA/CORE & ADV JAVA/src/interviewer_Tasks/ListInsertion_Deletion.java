package interviewer_Tasks;

import java.util.ArrayList;
import java.util.Scanner;

public class ListInsertion_Deletion {
	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Input length :");
			int size=sc.nextInt();
		ArrayList<Integer> l=new ArrayList<>(size);
		System.out.println("Input elements :");
		for (int i = 0; i < size; i++) {
			l.add(sc.nextInt());
		}
		System.out.println(l);
		System.out.println("input index and element to add  :");
		l.add(sc.nextInt(), sc.nextInt());
		System.out.println(l);
		System.out.println("input index and element to remove :");
		l.remove(sc.nextInt());
		System.out.println(l);
	}
	
//	public static void main(String[] args) {
//        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
//        Scanner sc=new Scanner(System.in);
//        //System.out.println("Input length :");
//        int size=sc.nextInt();
//    ArrayList<Object> l=new ArrayList<>(size);
//        //System.out.println("Input elements :");
//    for (int i = 0; i < size; i++) {
//        l.add(sc.nextInt());
//    }    
//    int Q=sc.nextInt();
//    for(int i=0;i<Q;i++){
//     String s1=sc.next();
//        if(s1.equals("Insert"))
//            l.add(sc.nextInt(), sc.nextInt());
//        else if(s1.equals("Delete"))
//            l.remove(sc.nextInt());
//    }
//    System.out.println(l);
//    }
}
