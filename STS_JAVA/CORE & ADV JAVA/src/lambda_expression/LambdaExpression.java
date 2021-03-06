package lambda_expression;

@FunctionalInterface
interface ABC{
	
	/**
	 * Functional Interface should contain only one abstract method
	 * Wherever functional interface is there lambda expression can be implemented..
	 * or
	 * To use Lambda expression interface must be Functional....
	 * or 
	 * Lambda expressions always associated with Function Interface only....
	 */
	public void add(int a,int b);
}
class LambdaExpression{
	public static void main(String[] args) {
		
		//Lambda Expn
		ABC a=(x,y)->System.out.println("Sum"+(x+y));
		a.add(10,20);
		
		ABC b=(x,y)->{
			System.out.println("SUB"+(x-y));
			System.out.println("HELLO HELO");
		};
		b.add(1500, 500);
	}
}