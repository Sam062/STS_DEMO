package interviewer_Tasks;

import java.util.Scanner;

public class StringOutputFormat {
	public static void main(String[] args) {
//		String s="JavavavaASDFG";
//		int num=1231;
		Scanner sc=new Scanner(System.in);
		System.out.println("Input String :");
		String string=sc.nextLine();
		System.out.println("input 3 digit number :");
		int number=sc.nextInt();
		

		int s1=string.length();
		int numdig=0;
		int temp=number;
		while(temp>0) {
			numdig++;
			temp=temp/10;
		}
		String fin="";
		fin+=string;
		if(fin.length()>12) {
			fin=fin.substring(0, 12);
		}

		for (int i = 1; i <= 12-s1; i++) {
			fin+=' ';
		}
		for (int i = 0; i < 3 && numdig<3; i++) {
			if(number==0)
			{
				fin+="00";
				break;
			}
			else
			{
				fin+="0";
				numdig++;
			}
		}

		fin+=number;
		System.out.println(fin+" "+fin.length());
	}
}
