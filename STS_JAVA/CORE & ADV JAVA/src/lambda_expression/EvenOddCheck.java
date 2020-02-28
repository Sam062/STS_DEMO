package lambda_expression;

import java.util.function.Predicate;

public class EvenOddCheck {
	public static void main(String[] args) {
		Predicate<Integer> p=i->i%2==0;
		
		if(p.test(123))
			System.out.println("even");
		else
			System.out.println("Odd");
	}

}
