package solution1;

import solution.Address;

public class Employee {
	private int eid;
	private Address addr;
	public Employee() {
		super();
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public Address getAddr() {
		return addr;
	}
	
	//step #2 create  method which returns Child Type and returns null
	public Address func() {
		return null;
	}
	/* Step #1-Remove Set method of HAS_A
	public void setAddr(Address addr) {
		this.addr = addr;
	}*/
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", addr=" + addr + "]";
	}
	

}
