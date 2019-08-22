package com.app.bean;

import java.util.List;

public class Customer {
	private int cid;
	private String code;
	private List<String> ords;
	public Customer() {
		super();
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public List<String> getOrds() {
		return ords;
	}
	public void setOrds(List<String> ords) {
		this.ords = ords;
	}
	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", code=" + code + ", ords=" + ords + "]";
	}
	

}
