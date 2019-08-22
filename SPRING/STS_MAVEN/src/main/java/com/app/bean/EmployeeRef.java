package com.app.bean;

public class EmployeeRef {
	private int empId;
	private AddressRef addr;
	public EmployeeRef() {
		super();
	}
	public int getEmpId() {
		return empId;
	}
	@Override
	public String toString() {
		return "EmployeeRef [empId=" + empId + ", addr=" + addr + "]";
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public AddressRef getAddr() {
		return addr;
	}
	public void setAddr(AddressRef addr) {
		this.addr = addr;
	}
	
	
	

}
