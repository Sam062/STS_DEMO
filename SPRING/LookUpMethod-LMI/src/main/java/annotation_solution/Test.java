package annotation_solution;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext ac=new AnnotationConfigApplicationContext(AnnotConfig.class);
		Employee e1=(Employee)ac.getBean("empobj");
		System.out.println("EMP "+e1.hashCode());
		System.out.println("ADDR "+e1.getAddr().hashCode());
		
		Employee e2=(Employee)ac.getBean("empobj");
		System.out.println("EMP "+e2.hashCode());
		System.out.println("ADDR "+e2.getAddr().hashCode());
		
		Employee e3=(Employee)ac.getBean("empobj");
		System.out.println("EMP "+e3.hashCode());
		System.out.println("ADDR "+e3.getAddr().hashCode());
		
		
	}

}
