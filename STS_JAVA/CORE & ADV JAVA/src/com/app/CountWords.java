package com.app;

import java.util.StringTokenizer;

public class CountWords {
	public static void main(String[] args) {
		String s="Hay i am String.";
		StringTokenizer st=new StringTokenizer(s);
		
		System.out.println(st.countTokens());
	}

}
