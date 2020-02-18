package lambda_expression;

import java.util.function.Supplier;

public class SupplierInterface {
	public static void main(String[] args) {
		Supplier<String> s=()->{
			String otp="";
			for(int i=0;i<6;i++)
				otp+=(int)(Math.random()*10); // Math.random returns 0>= x <1
			return otp;
		};
		
		System.out.println("OTP is :"+s.get());
	}

}
