package com.annotaionBean;

public class Vendor {
	private int vid;
	private String vcode;
	public Vendor() {
		super();
	}
	public int getVid() {
		return vid;
	}
	public void setVid(int vid) {
		this.vid = vid;
	}
	public String getVcode() {
		return vcode;
	}
	public void setVcode(String vcode) {
		this.vcode = vcode;
	}
	@Override
	public String toString() {
		return "Vendor [vid=" + vid + ", vcode=" + vcode + "]";
	}
	

}
