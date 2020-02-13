package interviewer_Tasks;

import java.util.Random;

public class RandomNumber {
	public static void main(String[] args) {
		
		//generate Random num
		Random r=new Random();
		int num=r.nextInt(100);
		System.out.println("Randon num="+num);
		
		//cos of num
		System.out.println("\ncos"+num+"="+Math.cos(num));
		
		//Squire of num
		System.out.println("\nSquire of "+num+"="+Math.pow(num, 2));
		
		//Cube of num
		System.out.println("\nPower of 3(CUBE) of "+num+"="+Math.pow(num, 3));
		
		
		
		//sqrt of num
		System.out.println("\nsquire root of "+num+"="+Math.sqrt(num));
		
		
		
	}

}
