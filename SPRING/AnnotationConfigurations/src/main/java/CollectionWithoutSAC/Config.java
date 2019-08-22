package CollectionWithoutSAC;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
@ComponentScan("CollectionWithoutSAC")
@PropertySource("index.properties")
public class Config {
	
	@Autowired
	private Environment env;
	
	@Bean
	public BeanClass bobj() {
		BeanClass b=new BeanClass();
		b.setId(env.getProperty("id",Integer.class));
		List<String> ls=new ArrayList<>();
		ls.add("ABC");
		ls.add("XYZ");
		b.setLs(ls);

		b.setSt(myset());
		return b;
		
	}

	
	public Set<String> myset()
	{
		Set<String> s=new LinkedHashSet<>();
		s.add("DDD");
		s.add("AAA");
		return s;
	}
	
	
}
