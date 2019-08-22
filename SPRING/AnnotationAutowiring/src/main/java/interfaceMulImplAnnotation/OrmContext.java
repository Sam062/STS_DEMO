package interfaceMulImplAnnotation;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class OrmContext implements DBContext {
	@Override
	public String getContextCode() {
		// TODO Auto-generated method stub
		return "ORM-OBJ";
	}

}
