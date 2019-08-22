package com.bean;

public class B {
	private A oaa;

	public B() {
		System.out.println("B constructor");
	}

	public A getOaa() {
		return oaa;
	}

	public void setOaa(A oaa) {
		System.out.println("B setOaa");
		this.oaa = oaa;
	}
	

}
