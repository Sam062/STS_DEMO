package javaConfig.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.annotaionBean.Employee;
import com.javaConfig.EmpConfig;

public class EmpTest {
	public static void main(String[] args) {
		ApplicationContext ac=new AnnotationConfigApplicationContext(EmpConfig.class);
		Employee e=(Employee)ac.getBean("eobj");
		System.out.println(e);
	}

}
