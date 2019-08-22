package homework.problem;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext ac=new AnnotationConfigApplicationContext(Config.class);
		Companey c=(Companey)ac.getBean("cobj");
		System.out.println(c.hashCode());
		System.out.println(c.getEmp().hashCode());
		
		Companey c1=(Companey)ac.getBean("cobj");
		System.out.println(c1.hashCode());
		System.out.println(c1.getEmp().hashCode());
		
		Companey c3=(Companey)ac.getBean("cobj");
		System.out.println(c3.hashCode());
		System.out.println(c3.getEmp().hashCode());
		
	}

}
