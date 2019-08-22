package pureAnnotationAutowiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ProductService {
	@Value("1001")
	private int pid;
	@Autowired
	private CodeGenerator cob;
	@Override
	public String toString() {
		return "ProductService [pid=" + pid + ", cob=" + cob + "]";
	}

	
}
