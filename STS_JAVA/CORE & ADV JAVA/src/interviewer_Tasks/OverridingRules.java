package interviewer_Tasks;
class A{
	public void one() {
		System.out.println("1");
	}
	public void two() 
	{
		System.out.println("2");
	}
	public void three() {
		System.out.println("3");
	}
}
public class OverridingRules extends A {
	@Override
	public void one() {
		System.out.println("Override 1");
	}
	
	@Override
	public void two() {
		System.out.println("Override 2");
	}
	
	public void four() {
		System.out.println("4");
	}
	public static void main(String[] args) {
		
		A a=new OverridingRules();
		a.one();
		a.two();
		a.three();
		//a.four();
		System.out.println();
		A a1=new A();
		a1.one();
		a1.two();
	}

}
