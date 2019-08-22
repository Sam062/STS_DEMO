package javaConfig.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.annotaionBean.Customer;
import com.javaConfig.CustConfig;

public class CustTest {
	public static void main(String[] args) {
		ApplicationContext ac=new AnnotationConfigApplicationContext(CustConfig.class);
		Customer c=(Customer)ac.getBean("cobj");
		System.out.println(c);
	}

}
