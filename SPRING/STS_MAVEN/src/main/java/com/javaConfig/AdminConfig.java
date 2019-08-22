package com.javaConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.annotaionBean.Admin;

@Configuration
public class AdminConfig {
	
	@Bean
	public Admin aobj() {
		Admin ad=new Admin();
		ad.setAid(101);
		ad.setAcode("A");
		return ad;
	}

}
