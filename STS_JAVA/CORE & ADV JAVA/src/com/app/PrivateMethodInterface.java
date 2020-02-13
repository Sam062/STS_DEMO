package com.app;

interface PriMeth{
	default void show() {
		System.out.println("B");
		s1();
	}
	private void s1() {
		System.out.println("S1");
	}
	
}
public class PrivateMethodInterface implements PriMeth{
	public static void main(String[] args) {
		PrivateMethodInterface pm=new PrivateMethodInterface();
		pm.show();
		
		
	}

}
