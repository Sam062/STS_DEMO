package usingCollections;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("usingCollections")
public class Config {
	@Bean
	public List<String> lsobj() {
		List<String> l=new ArrayList<String>();
		l.add("A");
		l.add("B");
		return l;
	}
	@Bean
	public Set<String> sobj() {
		Set<String> s=new LinkedHashSet<String>();
		s.add("A");
		s.add("B");
		return s;
	}
	@Bean
	public Map<String,Integer> mobj() {
		Map<String,Integer> m=new LinkedHashMap<>();
		m.put("A1", 101);
		m.put("A2", 102);
		return m;
	}

}
