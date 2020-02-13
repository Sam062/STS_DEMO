package com.app;

public class SingletonMain {
	public static void main(String[] args) {
		
		Singleton x=Singleton.getInstance();
		Singleton y=Singleton.getInstance();
		Singleton z=Singleton.getInstance();
		
		System.out.println();
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		
		System.out.println();
		x.s=(x.s).toUpperCase();
		System.out.println(x.s);
		System.out.println(y.s);
		System.out.println(z.s);
		System.out.println();
		
		z.s=(z.s).toLowerCase();
		System.out.println(x.s);
		System.out.println(y.s);
		System.out.println(z.s);
		
		
	}
}
