package interviewer_Tasks;

import java.util.Scanner;
import java.util.StringTokenizer;

public class ReverseWords {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Input String :");
		String s=sc.nextLine();
		sc.close();
		StringTokenizer st=new StringTokenizer(s);
		String rev="";
		while(st.hasMoreTokens()) {
			String s1=st.nextToken();
			//char[] c=s1.toCharArray();
			for(int i=s1.length()-1;i>=0;i--) {
				rev+=s1.charAt(i);
			}
			rev+=" ";
		}
		System.out.println(rev);
		
		
		// using Split (API)
		String demo="SHIVAM MISHRA Domadeeh jagdish";
		String[] a=demo.split(" ");//breaks the String from space char
		for (String string : a) {
			System.out.print(new StringBuffer(string).reverse()+" ");
			
		}
	}

}
