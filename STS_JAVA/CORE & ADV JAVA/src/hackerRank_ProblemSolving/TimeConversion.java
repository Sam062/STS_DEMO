package hackerRank_ProblemSolving;

import java.util.Scanner;

public class TimeConversion {
	private static final Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("input string :");
		String[] time = scan.nextLine().split(":");
        
        String hours = time[0];
        String minutes = time[1];
        String seconds = time[2].substring(0,2);
        String dayEve = time[2].substring(2,4);
        
        if(dayEve.equals("AM")){
            System.out.println((hours.equals("12")?"00":hours) +":"+minutes+":"+seconds);
        }else if(dayEve.equals("PM")  && (Integer.parseInt(hours)<=12)){
            System.out.println((hours.equals("12")?hours:(Integer.parseInt(hours)+12))+":"+minutes+":"+seconds);
        }
        else
        	System.out.println((hours.equals("12")?"00":hours) +":"+minutes+":"+seconds);
        	
	}

}
