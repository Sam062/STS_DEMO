package com.app.bean;

import java.util.Map;
import java.util.Set;

public class Purchase {
	private int pid;
	private String pcode;
	private Set<String> model;
	private Map<Integer,String> val;
	public Purchase() {
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
	public Set<String> getModel() {
		return model;
	}
	public void setModel(Set<String> model) {
		this.model = model;
	}
	public Map<Integer, String> getVal() {
		return val;
	}
	public void setVal(Map<Integer, String> val) {
		this.val = val;
	}
	@Override
	public String toString() {
		return "Purchase [pid=" + pid + ", pcode=" + pcode + ", model=" + model + ", val=" + val + "]";
	}
	
	
	

}
