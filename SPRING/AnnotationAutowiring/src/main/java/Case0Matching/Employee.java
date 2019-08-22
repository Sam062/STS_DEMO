package Case0Matching;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {
	//used for null value when bean is not found
	//@Autowired(required = false)
	
	//internally required is true here but gives an exception when bean not found
	@Autowired
	private Address addr;

	@Override
	public String toString() {
		return "Employee [addr=" + addr + "]";
	}
	

}
