package homework.problem;

public class Companey {
	private int cid;
	private String cadd;
	private Employee emp;
	public Companey() {
		super();
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCadd() {
		return cadd;
	}
	public void setCadd(String cadd) {
		this.cadd = cadd;
	}
	public Employee getEmp() {
		return emp;
	}
	public void setEmp(Employee emp) {
		this.emp = emp;
	}
	@Override
	public String toString() {
		return "Companey [cid=" + cid + ", cadd=" + cadd + ", emp=" + emp + "]";
	}
	
	
	
	

}
