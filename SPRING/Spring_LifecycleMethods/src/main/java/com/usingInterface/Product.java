package com.usingInterface;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Product implements InitializingBean,DisposableBean{
	private int pid;
	

	@Override
	public String toString() {
		return "Product [pid=" + pid + "]";
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public Product() {
		super();
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("Destroy");
		
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Init");
	}
	

}
