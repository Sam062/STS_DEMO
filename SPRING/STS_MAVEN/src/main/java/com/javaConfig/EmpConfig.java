package com.javaConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.annotaionBean.Employee;

@Configuration
public class EmpConfig {
	@Bean
	public Employee eobj() {
		Employee e=new Employee();
		e.setEmpId(101);
		e.setEmpName("ABC");
		return e;
		
	}
	

}
