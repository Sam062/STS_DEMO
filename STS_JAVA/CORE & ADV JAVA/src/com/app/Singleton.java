package com.app;

public class Singleton {
	private static Singleton si=null;
	public String s;
	private Singleton() {
		System.out.println("si="+si);
		s="Inside Constructor";
	}
	public static Singleton getInstance() {
		if(si==null) {
			si=new Singleton();
			System.out.println("getInstance() Called :"+si);
		}
		return si;
	}
}

