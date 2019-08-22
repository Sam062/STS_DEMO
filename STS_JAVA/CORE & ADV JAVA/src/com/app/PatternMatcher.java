package com.app;

import java.util.Scanner;

public class PatternMatcher {
	public static void main(String[] args) {
		String s="";
		Scanner sc=new Scanner(System.in);
		System.out.println("Input String :");
		s=sc.nextLine();
		sc.close();
		char[] c=s.toCharArray();
		int charCount=0;
		int digCount=0;
		int spaceCount=0;
		
		/*for(char i:c) {
			System.out.println(i+" ");
		}
		System.out.println();*/
		for(int i:c) {
			if(i>=48 && i<=57) {
				digCount++;
			}
			else if(i==' ') {
				spaceCount++;
			}
			else
				charCount++;
		}
		System.out.println("No of digits="+digCount);
		System.out.println("No of char="+charCount);
		System.out.println("No of Spaces="+spaceCount);
		
	}

}
