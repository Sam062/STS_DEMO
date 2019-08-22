package javaConfig.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.annotaionBean.Vendor;
import com.javaConfig.VendConfig;

public class VendTest {
	public static void main(String[] args) {
		ApplicationContext ac=new AnnotationConfigApplicationContext(VendConfig.class);
		Vendor v=(Vendor)ac.getBean("vobj");
		System.out.println(v);
	}

}
