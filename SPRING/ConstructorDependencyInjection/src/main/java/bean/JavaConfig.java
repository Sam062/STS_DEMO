package bean;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {
	@Bean
	public Adddress addobj() {
		Map<String,String> hm=new LinkedHashMap<String, String>();
		hm.put("A", "A-Z");
		hm.put("a", "a-z");
		Adddress ad=new Adddress(101, "LKO", hm);
		return ad;
	}
	@Bean
	public Employee empobj() {
		Set<String> s=new LinkedHashSet<>();
		s.add("P1");
		s.add("P2");
		Employee e=new Employee(10001, s, addobj());
		
		return e;
	}
	

}
