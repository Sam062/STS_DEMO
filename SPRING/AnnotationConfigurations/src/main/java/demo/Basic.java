package demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Basic {
	@Value("101")
	private int bid;
	
	@Value("SAM")
	private String name;

	@Override
	public String toString() {
		return "Basic [bid=" + bid + ", name=" + name + "]";
	}
	
	
	

}
