package bean;

import java.util.Set;

public class Employee {
	private int eid;
	private Set<String> prj;
	private Adddress addr;
	public Employee(int eid, Set<String> prj, Adddress addr) {
		super();
		this.eid = eid;
		this.prj = prj;
		this.addr = addr;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", prj=" + prj + ", addr=" + addr + "]";
	}
	

}
