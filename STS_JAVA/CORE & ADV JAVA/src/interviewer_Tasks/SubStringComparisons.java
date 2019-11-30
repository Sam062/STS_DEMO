package interviewer_Tasks;

import java.util.Scanner;

public class SubStringComparisons {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        String[] arr=new String[s.length()-2];
        for (int i = 0; i < (arr.length-k)+1; i++) {
			if(s.substring(i,i+k)!="")
				arr[i]=s.substring(i, i+k);
			System.out.println(arr[i]);
		}
                
        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("INPUT :");
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}
