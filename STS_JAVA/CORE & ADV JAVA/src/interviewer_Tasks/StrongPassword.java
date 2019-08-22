package interviewer_Tasks;

import java.util.Scanner;

/**The web site considers a password to be strong if it satisfies the following criteria:

Its length is at least 5.
It contains at least one digit.
It contains at least one lowercase English character.
It contains at least one uppercase English character.
It contains at least one special character. The special characters are: !@#$%^&*()-+
--------------------------------------------------------------------------------------
Note: Here's the set of types of characters in a form you can paste in your solution:
numbers = "0123456789"
lower_case = "abcdefghijklmnopqrstuvwxyz"
upper_case = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
special_characters = "!@#$%^&*()-+"
*/
public class StrongPassword {
	public static void main(String[] args) {
		System.out.println("Password length must be 5 char and must contain\n"
				+ "numbers = \"0-9\"\n" + 
				"lower_case = \"a-z\"\n" + 
				"upper_case = \"A-Z\"\n" + 
				"special_characters = \"!@#$%^&*()-+\""
				+ "\nBut No Spaces allowed");
		System.out.println("\nInput Password :");
		Scanner sc= new Scanner(System.in);
		String pass=sc.nextLine();
		sc.close();
		boolean num=false;
		boolean aToZ=false;
		boolean ATOZ=false;
		boolean symbols=false;
		boolean space=false;
		
		char[] c=pass.toCharArray();
		if(pass.length()>=5) {
			for (char d : c) {
				if(d>32&&d<44 || d==64)
					symbols=true;
				else if(d>47 && d<58)
					num=true;
				else if(d>64 && d<91)
					ATOZ=true;
				else if(d>96 && d<123)
					aToZ=true;
				else if (d==' ') 			
					space=true;
			}
			if(num==true && aToZ==true && ATOZ==true && symbols==true && space==false)
				System.out.println("Valid and Strong Password");
			else if(space==true)
				System.out.println("No Spaces Are Allowed !!!");
			else
				System.out.println("Password Must Contain All combinations : [0-9][a-z][A-Z][!@#$%^&*()-+]");
		}
		else
			System.out.println("length must be more than Four Characters");
	}
}
