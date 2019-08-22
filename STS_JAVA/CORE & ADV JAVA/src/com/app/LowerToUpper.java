package com.app;

public class LowerToUpper {
	public static void main(String[] args) {
		String s="Lower CASE Demo";
		char[] c=s.toCharArray();
		for(int i=0;i<c.length;i++) {
			if(c[i]>=65 && c[i]<=90)
				c[i]=(char) (c[i]+32);
			else if(c[i]>=97 && c[i]<=127)
				c[i]=(char) (c[i]-32);	
		}
		String a="";
		for(char x:c)
			a=a+x;
		System.out.println(a);
	}

}
