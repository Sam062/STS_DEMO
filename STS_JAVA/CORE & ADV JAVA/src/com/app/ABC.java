package com.app;

interface A {
	default void m1() {
		System.out.println("A inter");
	}
}
interface B {
	default void m1() {
		System.out.println("B inter");
	}
}

public class ABC implements A,B{
	@Override
	public void m1() {
		A.super.m1();
	}
	
	public static void main(String[] args) {
		
	}

	
}
