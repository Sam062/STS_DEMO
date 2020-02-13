package com.app;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class DescList {
	public static void main(String[] args) {
		List<String> ls=Arrays.asList("a","b","c","f","e","d");
		System.out.println(ls);
		
		Collections.sort(ls);
		
		Collections.reverse(ls);
		
		Collections.replaceAll(ls, "b", "B");
		
		System.out.println(ls);
		
		
	}

}
