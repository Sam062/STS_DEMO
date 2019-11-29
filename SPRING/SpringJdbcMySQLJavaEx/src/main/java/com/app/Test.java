package com.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ac=new AnnotationConfigApplicationContext(AppConfig.class);
		
		JdbcTemplate jt=(JdbcTemplate) ac.getBean("jtObj");
		
		
		//---Insert data---
		/*
		String sql="insert into emptab values(?,?,?)";
		int count=jt.update(sql,2,"B",6.6);
		System.out.println(count);
		*/
		
		//----delete data based on id
		/*
		String sql="delete from emptab where eid=?";
		int count=jt.update(sql,333);
		System.out.println(count);
		*/
		
		//modify data---pass data in order
		String sql="update emptab set ename=?,esal=? where eid=?";
		int count=jt.update(sql,"RR",2.3,2);
		System.out.println(count);
	}
}




