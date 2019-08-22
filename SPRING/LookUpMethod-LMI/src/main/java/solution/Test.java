package solution;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext ac=new ClassPathXmlApplicationContext("SolConfig.xml");
		
		Employee e1=(Employee)ac.getBean("eobj");
		System.out.println("EMP "+e1.hashCode());
		System.out.println("ADDR "+e1.getAddr().hashCode());
		
		System.out.println();
		
		Employee e2=(Employee)ac.getBean("eobj");
		System.out.println("EMP "+e2.hashCode());
		System.out.println("ADDR "+e2.getAddr().hashCode());
		
		System.out.println();
		
		Employee e3=(Employee)ac.getBean("eobj");
		System.out.println("EMP "+e3.hashCode());
		System.out.println("ADDR "+e3.getAddr().hashCode());
	}

}
