package com.app;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class StreamProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> s=Stream.of(1,2*2).collect(Collectors.toList());
		s.forEach(a->System.out.print(a));

	}

}
