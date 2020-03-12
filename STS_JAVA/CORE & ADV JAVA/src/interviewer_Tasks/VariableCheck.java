package interviewer_Tasks;

public class VariableCheck extends ExtraClass {

	public void A()
	{
		System.out.println("A");
	}
	public void B()
	{
		System.out.println("B");
	}
	public void C()
	{
		System.out.println("C");
	}
	public static void main(String[] args) {
		
		ExtraClass a=new VariableCheck();
		new VariableCheck().clone();
		a.A();
	}

}
