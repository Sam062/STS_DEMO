package hackerRank_ProblemSolving;

import java.util.Scanner;
public class AveryBigSum {
    // Complete the aVeryBigSum function below.
    static long aVeryBigSum(long[] ar) {
    	long sum=0;
    	for (long l : ar) {
    		sum+=l;
			
		}
		return sum;
    }
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){
    	System.out.println("Input size :");
    	int size=scanner.nextInt();
    	long[] arr=new long[size];
    	System.out.println("Input arr elements :");
    	for (int i = 0; i < size; i++) {
			arr[i]=scanner.nextLong();
		}
    	System.out.println(aVeryBigSum(arr));
    }
}

