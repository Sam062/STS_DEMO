package com.annotaionBean;

public class Project {
	private int pid;
	private String pcode;
	private String mob;
	public Project() {
		super();
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPcode() {
		return pcode;
	}
	public void setPcode(String pcode) {
		this.pcode = pcode;
	}
	public String getMob() {
		return mob;
	}
	public void setMob(String mob) {
		this.mob = mob;
	}
	@Override
	public String toString() {
		return "Project [pid=" + pid + ", pcode=" + pcode + ", mob=" + mob + "]";
	}
	

}
