package javaConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
	@Bean
	public Employee eobj() {
		Employee e=new Employee();
		e.setEid(101);
		e.setEname("ABC");
		return e;
	}
	

}
