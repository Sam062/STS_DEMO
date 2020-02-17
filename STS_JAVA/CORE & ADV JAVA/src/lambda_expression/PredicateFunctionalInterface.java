package lambda_expression;

import java.util.function.Predicate;

public class PredicateFunctionalInterface {
	public static void main(String[] args) {
		
		//Implementation of test method present in Predicate FI
		Predicate<Integer> p=I->I%2==0;
		
		System.out.println(p.test(10));
		System.out.println(p.test(15));
		System.out.println(p.test(111));
	}

}
