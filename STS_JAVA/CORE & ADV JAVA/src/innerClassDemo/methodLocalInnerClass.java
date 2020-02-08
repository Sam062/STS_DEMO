package innerClassDemo;

public class methodLocalInnerClass {
	int x=10;
	static int y=100;

	// Case 1
	public static void m1() {
		class Addition{
			void sum(int x,int y) {
				System.out.println(x+y);
			}
		}
		Addition ad=new Addition();
		ad.sum(200, 100);
		ad.sum(200, 100);
		ad.sum(200, 100);
		ad.sum(200, 100);
		
	}

	// Case 2
	public void m2() {
		class Addition{
			void sum(int x,int y) {
				System.out.println(x+y);
			}
		}
		Addition ad=new Addition();
		ad.sum(x, y);
		ad.sum(x, y);
		ad.sum(x, y);
		ad.sum(x, y);
		
	}
	public static void main(String[] args) {
		m1();
		new methodLocalInnerClass().m2();
	}
}
