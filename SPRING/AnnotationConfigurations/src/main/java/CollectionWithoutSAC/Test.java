package CollectionWithoutSAC;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	public static void main(String[] args) {
		System.out.println((BeanClass)new AnnotationConfigApplicationContext(Config.class).getBean("bobj"));
	}

}
