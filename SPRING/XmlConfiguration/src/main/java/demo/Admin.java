package demo;

public class Admin {
	private int aid;
	private String aname;
	public Admin() {
		super();
	}
	@Override
	public String toString() {
		return "Admin [aid=" + aid + ", aname=" + aname + "]";
	}
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	

}
