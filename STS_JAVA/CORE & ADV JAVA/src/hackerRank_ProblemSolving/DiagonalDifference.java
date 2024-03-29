package hackerRank_ProblemSolving;

import java.util.Scanner;

class Result {

    /*
     * Complete the 'diagonalDifference' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */

    public static int diagonalDifference(int[][] arr) {
    // Write your code here
		int d1=0,d2=0;
    	for (int i = arr.length-1; i >=0 ; i--) {
    		d1+=arr[i][i];			
		}
    	for (int i = 0,j=arr.length-1; i < arr.length&&j>=0; i++,j--) {
    		d2+=arr[i][j];
		}
    	
    	//System.out.println(d1+" "+d2);
    	return Math.abs(d1-d2);

    }
}

public class DiagonalDifference {
    public static void main(String[] args){
    	System.out.println("Input size ");
    	Scanner sc=new Scanner(System.in);
    	int size=sc.nextInt();
    	int[][] arr=new int[size][size];
    	System.out.println("input array elt :");
    	for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				arr[i][j]=sc.nextInt();
			}
		}
    	System.out.println("2d array is :");
    	for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j]+"  ");
			}
			System.out.println();
		}

    	System.out.println(Result.diagonalDifference(arr));
        sc.close();
    }
}
