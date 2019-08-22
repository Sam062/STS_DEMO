package Case1Matching;

import org.springframework.beans.factory.annotation.Value;

public class Address {
	@Value("101")
	private int aid;
	
	
	public Address() {
		super();
	}



	@Override
	public String toString() {
		return "Address [aid=" + aid + "]";
	}
	

}
