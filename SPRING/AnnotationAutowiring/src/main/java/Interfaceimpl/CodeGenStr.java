package Interfaceimpl;

import org.springframework.stereotype.Component;

@Component
public class CodeGenStr implements ICodeGen {
	public String getCode() {
		return "from String Gen";
	}

	
}
