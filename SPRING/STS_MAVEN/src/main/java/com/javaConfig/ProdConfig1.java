package com.javaConfig;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.annotaionBean.Product;

@Configuration
public class ProdConfig1 {
	@Bean
	public List<String> lsobj(){
		List<String> ls=new ArrayList<>();
		ls.add("P1");
		ls.add("P2");
		ls.add("P3");
		return ls;		
	}
	@Bean
	public Set<String> sobj(){
		Set<String> s=new LinkedHashSet<>();
		s.add("S1");
		s.add("S2");
		s.add("S3");
		return s;
	}
	@Bean
	public Map<Integer,String> mobj(){
		Map<Integer,String> m=new LinkedHashMap<>();
		m.put(10, "A");
		m.put(20, "B");
		return m;
	}
	@Bean
	public Properties propobj() {
		Properties prp=new Properties();
		prp.put("a1", "b1");
		prp.put("a2", "b2");
		return prp;
	}
	@Bean
	public Product pobj() {
		Product p=new Product();
		p.setData(lsobj());
		p.setModels(sobj());
		p.setModes(mobj());
		p.setContext(propobj());
		return p;
	}

}
