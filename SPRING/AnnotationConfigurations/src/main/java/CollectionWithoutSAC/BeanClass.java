package CollectionWithoutSAC;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
@Component("beanobj")
public class BeanClass {
	private int id;
	private List<String> ls;
	private Set<String> st;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public List<String> getLs() {
		return ls;
	}

	public void setLs(List<String> ls) {
		this.ls = ls;
	}

	public Set<String> getSt() {
		return st;
	}

	public void setSt(Set<String> st) {
		this.st = st;
	}

	@Override
	public String toString() {
		return "BeanClass [id=" + id + ", ls=" + ls + ", st=" + st + "]";
	}

	

}
