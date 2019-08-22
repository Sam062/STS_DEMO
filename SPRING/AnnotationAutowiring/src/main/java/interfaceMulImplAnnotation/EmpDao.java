package interfaceMulImplAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Component("empObj")
public class EmpDao {

	@Autowired
	@Qualifier("jdbc")
	private DBContext db;
	
	public String findContext() {
		return db.getContextCode();
	}
}
