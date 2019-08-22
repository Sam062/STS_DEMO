package annotation_solution;

import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Scope("singleton")
@Component("empobj")
public class Employee {
	@Value("999")
	private int empId;
	/*@Autowired*/
	  
	private Address addr;
	
	public Address getAddr() {
		return addr;
	}

	@Lookup
	public Address addr() {
		return null;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", addr=" + addr + "]";
	}
	
}
