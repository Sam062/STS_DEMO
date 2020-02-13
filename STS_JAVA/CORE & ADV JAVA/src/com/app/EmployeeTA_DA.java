package com.app;

import java.util.Scanner;

public class EmployeeTA_DA {
	private static double countSal(double sal) {
		final int proTax=200;
		double hra=sal*3/100;
		double ta=sal*2/100;
		double da=sal*6/100;
		System.out.println("HRA="+hra);
		System.out.println("TA="+ta);
		System.out.println("DA="+da);
		
		return sal+hra+ta+da-proTax;
	} 
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Input Salary :");
		double salary=sc.nextDouble();
		sc.close();
		System.out.println("Final Salary is :"+countSal(salary));
	}

}
