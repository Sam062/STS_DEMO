package com.app.bean;

import java.util.Properties;

public class ProductProperty {
	private int pid;
	private Properties info;
	public ProductProperty() {
		super();
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public Properties getInfo() {
		return info;
	}
	public void setInfo(Properties info) {
		this.info = info;
	}
	@Override
	public String toString() {
		return "ProductProperty [pid=" + pid + ", info=" + info + "]";
	}
	
	

}
