package ConstructorAutowiring;

public class Address {
	private int aid;

	public Address(int aid) {
		super();
		this.aid = aid;
	}

	@Override
	public String toString() {
		return "Address [aid=" + aid + "]";
	}
	

}
