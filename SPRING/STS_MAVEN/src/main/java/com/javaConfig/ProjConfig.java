package com.javaConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.annotaionBean.Project;

@Configuration
public class ProjConfig {
	@Bean
	public Project pobj() {
		Project p=new Project();
		p.setPid(101);
		p.setPcode("CODE");
		p.setMob("12345");
		return p;
	}

}
