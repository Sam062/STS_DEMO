package interviewer_Tasks;

import java.util.Scanner;

public class CheckArmstrong {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Input number :");
		int num=sc.nextInt();
		sc.close();
		check(num);
	}

	private static void check(int num) {
		int temp=num;
		int rem,sum=0;
		while(temp>0) {
			rem=temp%10;
			sum+=rem*rem*rem;
			temp/=10;
		}
		if(num==sum)
			System.out.println("Armstrong num "+sum);
		else
			System.out.println("Not Armstrong"+sum);
		
		
	}

}
