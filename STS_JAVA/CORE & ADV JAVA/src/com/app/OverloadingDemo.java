package com.app;

public class OverloadingDemo {
	void show(int a) {
		System.out.println("int a");
	}
	void show(Object a) {
		System.out.println("Integer");
	}
	public static void main(String[] args) {
		OverloadingDemo ob=new OverloadingDemo();
		ob.show(10);
		ob.show((long)50.2);
	}
}
