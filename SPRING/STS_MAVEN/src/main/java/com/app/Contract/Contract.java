package com.app.Contract;

public class Contract {
	private int cid;
	private String code;
	private Bond bo;
	@Override
	public String toString() {
		return "Contract [cid=" + cid + ", code=" + code + ", bo=" + bo + "]";
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
	public Bond getBo() {
		return bo;
	}
	public void setBo(Bond bo) {
		this.bo = bo;
	}
	public Contract() {
		super();
	}
	

}
