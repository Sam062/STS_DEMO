package interviewer_Tasks;

import java.util.Scanner;
import java.util.StringTokenizer;


public class JavaStringTokens {
	
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("INPUT :");
        String s =scan.nextLine();
        
        char[] a=s.toCharArray();
        String last="";
        for (int i = 0; i < a.length; i++) {
			if(a[i]>=33 && a[i]<=64 || a[i]>=91 && a[i]<=96)
			{
				a[i]=' ';
				last+=a[i];
			}
			else
				last+=a[i];
		}
        
        StringTokenizer st=new StringTokenizer(last);
        System.out.println(st.countTokens());
        while(st.hasMoreTokens())
        {
        	System.out.println(st.nextToken());
        }
        scan.close();
    }

}
