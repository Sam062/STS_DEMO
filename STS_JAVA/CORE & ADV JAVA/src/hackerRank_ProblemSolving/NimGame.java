package hackerRank_ProblemSolving;

import java.util.Scanner;

public class NimGame {
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("input no of games to be played :");
        int t = input.nextInt();
        for(int i=0; i<t; i++){
        	System.out.println("input no of pile :");
            int n = input.nextInt();
            
            System.out.println("input pile values :");
            int k = input.nextInt();
            int p = k;
            for(int j=1; j<n; j++){
                int q = input.nextInt();
                p = p^q;
            }
            if(p==0)
                System.out.println("Winner : Second");
            else
                System.out.println("Winner : First");
        }
        input.close();
    }
}
