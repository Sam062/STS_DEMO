package bean;

import java.util.Map;

public class Adddress {
	private int aid;
	private String loc;
	private Map<String,String> cost;
	public Adddress(int aid, String loc, Map<String, String> cost) {
		super();
		this.aid = aid;
		this.loc = loc;
		this.cost = cost;
	}
	@Override
	public String toString() {
		return "Adddress [aid=" + aid + ", loc=" + loc + ", cost=" + cost + "]";
	}
	
	
	

}
