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
        for (int i = 0; i < arr.length; i++) {
        	for (int j = 1; j < arr.length; j++) {
				System.out.println(arr[i].compareTo(arr[j]));
				if(arr[i].compareTo(arr[j])>0)
				{
					String temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
        for (String string : arr) {
			System.out.println(string);
		}
                
        return  ""; //smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("INPUT :");
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        getSmallestAndLargest(s, k);
    }
}
