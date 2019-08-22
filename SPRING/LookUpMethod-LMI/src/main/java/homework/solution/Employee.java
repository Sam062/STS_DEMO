package homework.solution;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("eobj")
@Scope("prototype")
public class Employee {
	@Value("123")
	private int empId;
	@Value("SAM")
	private String empName;
	
	public Employee() {
		super();
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + "]";
	}
	

}
