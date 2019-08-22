package com.annotaionBean;

public class Customer {
	private int cid;
	private String custCode;
	public Customer() {
		super();
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCustCode() {
		return custCode;
	}
	public void setCustCode(String custCode) {
		this.custCode = custCode;
	}
	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", custCode=" + custCode + "]";
	}
	

}
