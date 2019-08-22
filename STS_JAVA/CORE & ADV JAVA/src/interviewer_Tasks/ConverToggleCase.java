package interviewer_Tasks;

import java.util.Scanner;

public class ConverToggleCase {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Input String :");
		String s=sc.nextLine();
		sc.close();
		char[] c=s.toCharArray();
		for(int i=0;i<c.length;i++) {
			if(c[i]>=65 && c[i]<=90)
				c[i]=(char) (c[i]+32);
			else if(c[i]>=97 && c[i]<=127)
				c[i]=(char) (c[i]-32);
		}
		String s1="";
		for(char x:c)
			s1+=x;
		System.out.println(s1);
	}

}
