package pureAnnotationAutowiring;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class CodeGenerator {
	
	@Value("101")
	private int cid;
	@Value("SAM")
	private String cname;
	@Override
	public String toString() {
		return "CodeGenerator [cid=" + cid + ", cname=" + cname + "]";
	}
	
	

}
