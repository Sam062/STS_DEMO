package annotation_solution;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("adobj")
@Scope("prototype")
public class Address {
	@Value("101")
	private int aid;

	@Override
	public String toString() {
		return "Address [aid=" + aid + "]";
	}

	
}
