package interviewer_Tasks;

import java.math.BigInteger;

public class PrimeNum {
	public static void main(String[] args) {
		String n="669483106578092405936560831017556154622901950048903016651285";
		
		if("1".equals(n))
			System.out.println("not prime");
		else {
			BigInteger bp=new BigInteger(n);
			if(bp.isProbablePrime(1))
				System.out.println("prime");
			else
				System.out.println("not prime");
		}
		
		
		
		
		
//		boolean flag=false;
//		if(num==1) {
//			System.out.println("not prime");
//		}
//		else {
//			for(int i=2;i<num/2;i++) {
//				if(num%2==0) {
//					flag=true;
//					break;
//				}
//			}
//			if(flag==false) {
//				System.out.println("Prime");
//			}
//		}
	}
}
