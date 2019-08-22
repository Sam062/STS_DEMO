package usingCollections;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("mainobj")
public class Main {
	@Value("101")
	private int mid;
	@Value("#{lsobj}")
	private List<String> ls;
	@Value("#{sobj}")
	private Set<String> st;
	@Value("#{mobj}")
	private Map<String,String> mp;
	//private Properties prps;
	
	@Override
	public String toString() {
		return "Main [mid=" + mid + ", ls=" + ls + ", st=" + st + ", mp=" + mp + "]";
	}
	
	
	

}
