package hackerRank_ProblemSolving;

import java.util.Scanner;

public class Staircase {
static void staircase(int n) {
	
	for(int j=0;j<n;j++){
        for(int i=1;i<=n;i++){
            System.out.print(i<n-j?" ":"#");
        }
        System.out.println("");
    }
	
	System.out.println();
	//one more option
	for (int i = 1; i <= n; i++) {
		for (int k = n; k> i; k--)
			System.out.print(" ");
		for (int j = 1; j <= i; j++)
			System.out.print("*");
		System.out.println();
	}
}
    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
    	System.out.println("input size :");
    	int size=sc.nextInt();
    	staircase(size);
	
    }
}
