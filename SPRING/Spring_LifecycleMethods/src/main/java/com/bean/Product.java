package com.bean;

public class Product {
	private int pid;

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	@Override
	public String toString() {
		return "Product [pid=" + pid + "]";
	}

	public Product() {
		super();
	}
	public void setup() {
		System.out.println("From Init");
	}
	public void destroy() {
		System.out.println("From Destroy");
	}

}
