package interfaceMulImplAnnotation;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("jdbc")
public class JdbcContext implements DBContext {

	@Override
	public String getContextCode() {
		// TODO Auto-generated method stub
		return "JDBC-OBJ";
	}
	

}
