package javaConfig.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.annotaionBean.Admin;
import com.javaConfig.AdminConfig;

public class AdminTest {
	public static void main(String[] args) {
		ApplicationContext ac=new AnnotationConfigApplicationContext(AdminConfig.class);
		Admin a=(Admin)ac.getBean("aobj");
		System.out.println(a);
	}

}
