package interviewer_Tasks;

import java.util.Scanner;

public class StringPyramid {
	public static void main(String[] args) {
		//demo
		System.out.println("DEMO PATTERN :");
		String s = "string";
		int len = s.length();           
		String tmp = "";
		for (char c : s.toCharArray()) {
			tmp += tmp.length() > 0 ? " " + String.valueOf(c) : String.valueOf(c);
			System.out.printf("%" + (len + tmp.length() - 1) + "s\n", tmp);
			len--;
		}
		System.out.println();
		
		
		//mine
		Scanner sc=new Scanner(System.in);
		System.out.println("Input String :");
		String s1=sc.next();
		sc.close();
			char[] c1=s1.toCharArray();
			
			for(int i=0;i<c1.length;i++)
			{
				for(int j=i;j<c1.length-1;j++)
				{
					System.out.print(" ");
				}
				for(int k=0;k<=i;k++)
					System.out.print(c1[i]+" ");
				System.out.println();
			}

	}

}
