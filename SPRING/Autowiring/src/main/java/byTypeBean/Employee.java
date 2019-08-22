package byTypeBean;

public class Employee {
	private Address addr;

	public Employee() {
		super();
	}

	public Address getAddr() {
		return addr;
	}

	public void setAddr(Address addr) {
		this.addr = addr;
	}

	@Override
	public String toString() {
		return "Employee [addr=" + addr + "]";
	}
	
	

}
