package javaConfig.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.annotaionBean.Address;
import com.javaConfig.AppConfig;

public class Test {
	public static void main(String[] args) {
		ApplicationContext ac=new AnnotationConfigApplicationContext(AppConfig.class);
		Address a=(Address)ac.getBean("aobj");
		System.out.println(a);
	}

}
