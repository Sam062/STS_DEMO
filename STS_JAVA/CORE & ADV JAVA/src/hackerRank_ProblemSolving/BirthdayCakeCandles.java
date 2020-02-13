package hackerRank_ProblemSolving;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class BirthdayCakeCandles {
	static int birthdayCakeCandles(Integer[] arr) {
		int max=Collections.max(Arrays.asList(arr));
		int count=0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]==max)
				count++;
		}	
			return count;
    }
	private static final Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
	
		System.out.println("input size :");
		int size=scanner.nextInt();
		Integer[] arr=new Integer[size];
		System.out.println("input arr elements :");
		for (int i = 0; i < size; i++) {
			arr[i]=scanner.nextInt();
		}
		System.out.println(birthdayCakeCandles(arr));
	}
	

}
