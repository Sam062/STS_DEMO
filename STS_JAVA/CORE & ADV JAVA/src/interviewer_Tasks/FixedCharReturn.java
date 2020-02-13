package interviewer_Tasks;

import java.util.Scanner;

public class FixedCharReturn {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Input any num :");
		int num=sc.nextInt();
		sc.close();

		int dig=0,temp=num;
		while(temp>0) {
			dig++;
			temp/=10;
		}
		String s="";
		for(int i=0;i<10;i++) {
			if(i<10-dig)
				s+="0";
			else
				break;
		}
		s+=num;
		System.out.println(s);
	}

}
