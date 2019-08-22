package com.bean;

public class Account {
	private int aid;
	private String acode;
	private User uob;
	@Override
	public String toString() {
		return "Account [aid=" + aid + ", acode=" + acode + ", uob=" + uob + "]";
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
	public User getUob() {
		return uob;
	}
	public void setUob(User uob) {
		this.uob = uob;
	}
	public Account() {
		super();
	}
	

}
