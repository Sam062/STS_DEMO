package hackerRank_ProblemSolving;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

	public class MinMaxSum {
		static void miniMaxSum(Integer[] arr) {
			int min=Collections.min(Arrays.asList(arr));
	    	int max=Collections.max(Arrays.asList(arr));
	    	int sumExceptMin=0;
	    	int sumExceptMax=0;
	    	for (int i = 0; i < arr.length; i++) {
				int num=arr[i];
				if(min==max) {
					if(i==arr.length-1)
						break;
					else {
						sumExceptMax+=num;
						sumExceptMin+=num;
					}
				}
				if(num!=min)
					sumExceptMin+=num;
				if(num!=max)
					sumExceptMax+=num;
			}
	    	System.out.println(sumExceptMax+" "+sumExceptMin);
    }
	 private static final Scanner sc = new Scanner(System.in);

	    public static void main(String[] args) {
	    	Integer[] arr=new Integer[5];
	    	System.out.println("Input arr elt :");
	    	for (int i = 0; i < 5; i++) {
				arr[i]=sc.nextInt();
			}
	    	miniMaxSum(arr);
	    }

}
