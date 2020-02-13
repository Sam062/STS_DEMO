package interviewer_Tasks;

import java.util.Scanner;

public class MaxRepeatedWordString {
	public static void main(String[] args) {
		System.out.println("Input String :");
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		sc.close();
		
		s=s.toLowerCase();
		String[] words=s.split(" ");
		int max=0;
		int pos=0;
		for(int i=0;i<words.length;i++) {
			int count=0;
			for(int j=0;j<words.length;j++) {
				if(words[i].equals(words[j]))
					count++;
			}
			if(count>max)
			{
				max=count;
				pos=i;
			}
		}
		System.out.println("Max rep word ="+words[pos]+" counts-"+max);
	}

}
