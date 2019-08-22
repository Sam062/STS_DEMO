package solution;

public abstract class Employee {
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
		//step #3 call that func somewhere returns Address obj
		addr=func();
		return addr;
	}
	
	//step #2 create an abstract method which returns Child Type
	//and make Parent class abstract
	public abstract Address func();
	
	/* Step #1-Remove Set method of HAS_A
	public void setAddr(Address addr) {
		this.addr = addr;
	}*/
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", addr=" + addr + "]";
	}
	

}
