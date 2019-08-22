package com.bean;

public class A {
	private B obb;

	public A() {
		System.out.println("A constructor");
	}

	public B getObb() {
		return obb;
	}

	public void setObb(B obb) {
		System.out.println("A setObb");
		this.obb = obb;
	}
	@Override
	public String toString() {
		return "A [obb=" + obb + "]";
	}
	

}
