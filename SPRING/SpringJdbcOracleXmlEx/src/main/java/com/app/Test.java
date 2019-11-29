package com.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ac=new ClassPathXmlApplicationContext("config.xml");
		
		JdbcTemplate jt=(JdbcTemplate)ac.getBean("jtObj");
		
		String sql="insert into emptab values(?,?,?,?)";
		
		int count=jt.update(sql,104,"SOMENAME",456.66,"DCS");
		System.out.println(count);
		
	}
}
