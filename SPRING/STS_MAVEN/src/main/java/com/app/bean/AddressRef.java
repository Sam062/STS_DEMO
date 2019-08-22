package com.app.bean;

public class AddressRef {
	private int addId;
	private String loc;
	public AddressRef() {
		super();
	}
	public int getAddId() {
		return addId;
	}
	public void setAddId(int addId) {
		this.addId = addId;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	@Override
	public String toString() {
		return "ModelRef [addId=" + addId + ", loc=" + loc + "]";
	}
	
	

}
