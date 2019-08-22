package com.annotaionBean;

public class Admin {
	private int aid;
	private String acode;
	public Admin() {
		super();
	}
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getAcode() {
		return acode;
	}
	public void setAcode(String acode) {
		this.acode = acode;
	}
	@Override
	public String toString() {
		return "Admin [aid=" + aid + ", acode=" + acode + "]";
	}
	

}
