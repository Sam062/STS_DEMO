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
public class ProdConfig2 {
	@Bean
	public Product pobj() {
		Product p=new Product();
		List<String> ls=new ArrayList<>();
		ls.add("P1");
		ls.add("P2");
		ls.add("P3");
		p.setData(ls);
		
		Set<String> s=new LinkedHashSet<>();
		s.add("s1");
		s.add("s2");
		s.add("s3");
		p.setModels(s);
		
		Map<Integer,String> m=new LinkedHashMap<>();
		m.put(10, "A");
		m.put(20, "B");
		p.setModes(m);
		
		Properties prop=new Properties();
		prop.put("a1", "b1");
		prop.put("a2", "b2");
		p.setContext(prop);
		
		return p;
	}
}
