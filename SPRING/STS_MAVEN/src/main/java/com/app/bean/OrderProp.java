package com.app.bean;

import java.util.Map;
import java.util.Properties;

public class OrderProp {
	private int id;
	private Properties parts;
	private Map<Integer,String> codes;
	public OrderProp() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Properties getParts() {
		return parts;
	}
	public void setParts(Properties parts) {
		this.parts = parts;
	}
	public Map<Integer, String> getCodes() {
		return codes;
	}
	public void setCodes(Map<Integer, String> codes) {
		this.codes = codes;
	}
	@Override
	public String toString() {
		return "OrderProp [id=" + id + ", parts=" + parts + "]";
	}
	
	

}
