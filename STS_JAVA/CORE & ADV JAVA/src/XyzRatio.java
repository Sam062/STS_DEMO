import java.util.Scanner;

public class XyzRatio {
	public static void main(String[] args) {
		int x=0,y=0;
		System.out.println("Enter string :");
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		char[] a=s.toCharArray();
		for(int i=0;i<s.length();i++) {
			if(a[i]=='z')
				x++;
			else if(a[i]=='o')
				y++;
		}
		if(2*x==y)
			System.out.println("Yes");
		else
			System.out.println("No");
		System.out.println(x+" "+y);
	}
}
