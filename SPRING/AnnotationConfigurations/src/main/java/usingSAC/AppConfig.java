package usingSAC;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("usingSAC")
public class AppConfig {
	@Bean
	public List<String> lsobj(){
		List<String> ls=new ArrayList<String>();
		ls.add("IDLY");
		ls.add("WADA");
		ls.add("DOSA");
		return ls;
	}
	@Bean
	public Map<String,Double> mobj(){
		Map<String,Double> m=new HashMap<>();
		m.put("IDLY", 10.00);
		m.put("WADA", 50.00);
		m.put("DOSA", 150.00);
		m.put("CGST", 12.35);
		m.put("SGST", 12.35);
		return m;
	}
}
