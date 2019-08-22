package javaConfig.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.annotaionBean.Project;
import com.javaConfig.ProjConfig;

public class ProjTest {
	public static void main(String[] args) {
		ApplicationContext ac=new AnnotationConfigApplicationContext(ProjConfig.class);
		Project p=(Project)ac.getBean("pobj");
		System.out.println(p);
	}

}
