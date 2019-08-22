package exception;

public class Demo {
	public static void main(String[] args) {
		try {
			doStuff();
			System.out.println("main");
		} catch (Exception e) {
			System.out.println("Exception");  // the only output 
		}
	}

	private static void doStuff() {
		doMoreStuff();
		System.out.println("doStuff");
	}

	private static void doMoreStuff() {
		System.out.println(10/0);
		System.out.println("doMoreStuff");
	}

}
