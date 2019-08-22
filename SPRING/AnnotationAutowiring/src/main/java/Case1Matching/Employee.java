package Case1Matching;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {
	
	public Employee() {
		super();
	}

	@Autowired
	private Address addr;

	@Override
	public String toString() {
		return "Employee [addr=" + addr + "]";
	}
	
	

}
