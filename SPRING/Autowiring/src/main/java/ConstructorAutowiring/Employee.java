package ConstructorAutowiring;

public class Employee {
	private Address addr;

	public Employee(Address addr) {
		super();
		this.addr = addr;
	}

	@Override
	public String toString() {
		return "Employee [addr=" + addr + "]";
	}
	

}
