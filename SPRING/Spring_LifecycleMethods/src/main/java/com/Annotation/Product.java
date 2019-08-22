package com.Annotation;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Product {
	private int pid;

	public Product() {
		super();
	}

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


	@PostConstruct
	public void setup() {
		System.out.println("init");
	}

	
	@PreDestroy
	public void destroy() {
		System.out.println("destroy");
	}


}
