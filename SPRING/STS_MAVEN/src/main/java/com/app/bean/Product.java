package com.app.bean;

public class Product {
	private int proId;
	private String proName;
	public Product() {
		super();
	}
	public int getProId() {
		return proId;
	}
	public void setProId(int proId) {
		this.proId = proId;
	}
	public String getProName() {
		return proName;
	}
	public void setProName(String proName) {
		this.proName = proName;
	}
	@Override
	public String toString() {
		return "Product [proId=" + proId + ", proName=" + proName + "]";
	}
	

}
