package solution;

public class Address {
	private int aid;

	public Address() {
		super();
	}

	public int getAid() {
		return aid;
	}

	public void setAid(int aid) {
		this.aid = aid;
	}

	@Override
	public String toString() {
		return "Address [aid=" + aid + "]";
	}

}
