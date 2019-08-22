package homework.solution;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext ac=new AnnotationConfigApplicationContext(Config.class);
		
		Companey c=(Companey)ac.getBean("cobj");
		System.out.println(c);
		System.out.println("COMP-"+c.hashCode());
		System.out.println("ADDR-"+c.getEmp().hashCode());
			System.out.println();
		
		Companey c1=(Companey)ac.getBean("cobj");
		System.out.println("COMP-"+c1.hashCode());
		System.out.println("ADDR-"+c1.getEmp().hashCode());
		System.out.println();
		
		Companey c3=(Companey)ac.getBean("cobj");
		System.out.println("COMP-"+c3.hashCode());
		System.out.println("ADDR-"+c3.getEmp().hashCode());
		
	}
}
