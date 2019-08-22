package com.javaConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.annotaionBean.Vendor;

@Configuration
public class VendConfig {
	@Bean
	public Vendor vobj() {
		Vendor v=new Vendor();
		v.setVid(101);
		v.setVcode("Z");
		return v;
	}

}
