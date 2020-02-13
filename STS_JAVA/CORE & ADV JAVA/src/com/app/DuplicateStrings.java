package com.app;

public class DuplicateStrings {
	public static void main(String[] args) {
		String s="Hello Hi Hello Hi You";
		int count;
		s.toLowerCase();
		String[] words=s.split(" ");
		for(int i=0;i<words.length;i++) {
			count=1;
			for(int j=i+1;j<words.length;j++) {
				if(words[i].equals(words[j]))
				{
					count++;
					words[j]="0";
				}
			}
			if(count>1&&words[i]!="0")
				System.out.println(words[i]);
		}
		
	}

}
