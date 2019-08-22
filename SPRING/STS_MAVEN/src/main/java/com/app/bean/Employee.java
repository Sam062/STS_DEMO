package com.app.bean;

import java.util.List;

public class Employee {
	private int empId;
	private List<String> empPrjs;
	public Employee() {
		super();
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public List<String> getEmpPrjs() {
		return empPrjs;
	}
	public void setEmpPrjs(List<String> empPrjs) {
		this.empPrjs = empPrjs;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empPrjs=" + empPrjs + "]";
	}
	

}
