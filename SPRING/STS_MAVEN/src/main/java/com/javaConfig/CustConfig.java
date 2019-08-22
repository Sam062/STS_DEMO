package com.javaConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.annotaionBean.Customer;

@Configuration
public class CustConfig {
	@Bean
	public Customer cobj() {
		Customer c=new Customer();
		c.setCid(101);
		c.setCustCode("ABC");
		return c;
	}
	

}
