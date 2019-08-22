package CaseMultipleMatch;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {
	//in case of @Qualifier it searches for particular object otherwise gives NoUniqueBeanDefException
	@Autowired
	@Qualifier("addrobj")
	private Address addr;

	public Employee() {
		super();
	}

	@Override
	public String toString() {
		return "Employee [addr=" + addr + "]";
	}
	
	

}
