package homework.solution;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("cobj")
@Scope("singleton")
//@PropertySource()
public class Companey {
	@Value("101")
	private int cid;
	@Value("LKO")
	private String cadd;
	
	@Autowired
	private Employee emp;
	
	public Employee getEmp() {
		emp=fun();
		return emp;
	}
	
	@Override
	public String toString() {
		return "Companey [cid=" + cid + ", cadd=" + cadd + ", emp=" + emp + "]";
	}
	
	@Lookup
	public Employee fun() {
		return null;
	}
	
	
}
