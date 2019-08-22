package homework.problem;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan("homework")
public class Config {
	@Bean
	@Scope("prototype")
	public Employee eobj() {
		Employee e=new Employee();
		e.setEmpId(101);
		e.setEmpName("SAM");
		return e;
	} 
	@Bean
	@Scope("singleton")
	public Companey cobj() {
		Companey c=new Companey();
		c.setCid(1234);
		c.setCadd("LKO");
		c.setEmp(eobj());
		return c;
	}

}
