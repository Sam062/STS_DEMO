package interviewer_Tasks;

import java.util.Scanner;

public class CaesarCipher {
	
	static String caesarCipher(String s, int k) {
		char[] c=s.toCharArray();
		String fin="";
		for (char i = 0; i < c.length; i++) {
			//case k<=26
			if(k<=26) {
				//for small latter characters
				if(c[i]>=97&&c[i]<=122){
					int count=0;
					if((c[i]+k)>122) {
						while((c[i]<=122)) {
							c[i]+=1;
							count++;
						}
						c[i]=(char) (97+(k-count));
					}
					else {
						c[i]+=k;
					}
				}
				//for Capital latter characters
				else if(c[i]>=65&&c[i]<=90) {
					int count1=0;
					if((c[i]+k)>90) {
						while((c[i]<=90)) {
							c[i]+=1;
							count1++;
						}
						c[i]=(char) (65+(k-count1));
					}
					else {
						c[i]+=k;
					}
				}
			}
			//case k>26
			else {
				int val=k%26;
				//for small latter characters
				if(c[i]>=97&&c[i]<=122){
					int count1=0;
					if((c[i]+val)>122) {
						while((c[i]<=122)) {
							c[i]+=1;
							count1++;
						}
						c[i]=(char) (97+(val-count1));
					}
					else {
						c[i]+=val;
					}
				}
				//for Capital latter characters
				else if(c[i]>=65&&c[i]<=90) {
					int count1=0;
					if((c[i]+val)>90) {
						while((c[i]<=90)) {
							c[i]+=1;
							count1++;
						}
						c[i]=(char) (65+(val-count1));
					}
					else {
						c[i]+=val;
					}
				}
			}
		}
		for(int i=0;i<c.length;i++)
			fin+=c[i];
		return fin;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Input String to Encrypt :");
		String s=sc.nextLine();
		System.out.println("Input Encryption Number count :");
		int num=sc.nextInt();
		sc.close();
		String result = caesarCipher(s, num);
		System.out.println(result);

	}
}
