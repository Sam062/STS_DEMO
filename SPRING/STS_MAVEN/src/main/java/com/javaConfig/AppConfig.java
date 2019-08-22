package com.javaConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.annotaionBean.Address;

@Configuration
public class AppConfig {
	
	@Bean
	public Address aobj() {
		Address ad=new Address();
		ad.setAid(5);
		ad.setLoc("HYD");
		return ad;		
	}
	

}
