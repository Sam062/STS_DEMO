package interviewer_Tasks;

public class ImmutableClass {
	static Integer i=new Integer(20);
	public static int operate(Integer x) {
		x=x+100;
		return x;
		
	}
	public static void main(String[] args) {

		//Mutable
		StringBuilder w=new StringBuilder("Hello");
		w.append('A');
		System.out.println(w);
		//end mutable
		
		//immutable
		String w1=new String("HelloString");
		String w2=new String("HelloString");
		System.out.println(w1==w2);//false
		
		String w3="HelloString";
		String w4="Hello"+"String";
		System.out.println(w3==w4);//true
		
		String w5="Hello";
		String w6=w5+"String";
		System.out.println(w6==w4);//false because value assign to w6 at RT 
		//end Immutable
		
		
		System.out.println(i);
		i+=50;
		System.out.println(i);
		int x=operate(i);
		System.out.println(i);
	
		
		
		
		
	}

}
