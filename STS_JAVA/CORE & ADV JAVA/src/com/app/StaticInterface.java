package com.app;

interface X{
	public static void show() {
		System.out.println("A");		
	}
	
}
interface Y{
	public static void show() {
		System.out.println("B");		
	}
	
}
public interface StaticInterface{
	public static void main(String[] args) {
		X.show();
		Y.show();
	}
}
