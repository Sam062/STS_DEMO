package hackerRank_ProblemSolving;

import java.util.Scanner;

public class PlusMinus {
	static void plusMinus(int[] arr) {
		int positive=0,negative=0,zero=0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]>0)
				positive++;
			else if(arr[i]<0)
				negative++;
			else
				zero++;
		}
		System.out.println(positive+" "+negative+" "+zero);
		System.out.println(arr.length);
		System.out.println((float)positive/arr.length+"\n"+(float)negative/arr.length+"\n"+(float)zero/arr.length);

    }
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
     System.out.println("input size :");
     int size=scanner.nextInt();
     int[] arr=new int[size];
     System.out.println("Input arr elt :");
     for (int i = 0; i < size; i++) {
		arr[i]=scanner.nextInt();
	}
     plusMinus(arr);
    }
}
