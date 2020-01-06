package interviewer_Tasks;

import java.util.Scanner;

public class JavaAnagrams {
    static boolean isAnagram(String a, String b) {
		char[] arr1=a.toLowerCase().toCharArray();
		char[] arr2=b.toLowerCase().toCharArray();
		//sorting first array a
		for (int i = 0; i < arr1.length-1; i++) {
			for (int j = i+1; j < arr1.length; j++) {
				
				if(arr1[i]>arr1[j]) {
                    char temp = arr1[i];
                    arr1[i] = arr1[j];
                    arr1[j] = temp;
                 }
			}
		}
		String first="";
		for (int i = 0; i < arr1.length; i++) {
			first+=arr1[i];
		}
		
		//sorting second array b
		for (int i = 0; i < arr2.length-1; i++) {
			for (int j = i+1; j < arr2.length; j++) {
				
				if(arr2[i]>arr2[j]) {
                    char temp = arr2[i];
                    arr2[i] = arr2[j];
                    arr2[j] = temp;
                 }
			}
		}
		String last="";
		for (int i = 0; i < arr2.length; i++) {
			last+=arr2[i];
		}
		
//		System.out.println(first+" "+last);
		if(first.compareTo(last)==0)
			return true;
		else
			return false;
		
    }
    
    
    public static void main(String[] args) {
        System.out.println("INPUT ");
        Scanner scan=new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }

}
