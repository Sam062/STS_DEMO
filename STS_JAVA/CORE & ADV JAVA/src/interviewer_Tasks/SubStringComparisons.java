package interviewer_Tasks;

import java.util.Scanner;

public class SubStringComparisons {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        
        if(s.length()>k) {
        	String[] arr=new String[(s.length()-k)+1];
            
            for (int i = 0; i < arr.length; i++) {
    			if(s.substring(i,i+k)!="")
    				arr[i]=s.substring(i, i+k);
    			//System.out.println(arr[i]);
    		}
            
           
        	// sorting logic using compareTo() 
        	for(int i = 0; i<arr.length-1; i++) {
                for (int j = i+1; j<arr.length; j++) {
                   if(arr[i].compareTo(arr[j])>0) {
                      String temp = arr[i];
                      arr[i] = arr[j];
                      arr[j] = temp;
                   }
                }
             }
//        	System.out.println("\nSorted ");
//            for (String string : arr) {
//    			System.out.println(string);
//    		}
//        
        smallest=arr[0];
        largest=arr[arr.length-1];
        }     
        System.out.println();
        return  smallest + "\n" + largest;
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
