package com.app;

import java.util.Scanner;

public class CountGST {
	private static double countGst(double val) {
		double gst = 0;
		double disc=0;

		if(val>=0 && val<=1000)
			gst=0;
		else if(val>1000 && val<=10000)
			gst=(val*4/100);
		else if(val>10000 && val<=100000)
			gst=(val*12/100);
		else if(val>1000000)
			gst=(val*18/100);
		
		disc=val*3/100;
		System.out.println("GST="+gst);
		System.out.println("discount="+disc);
		return val+gst-disc;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Input Cost :");
		double cost=sc.nextDouble();
		sc.close();
		System.out.println("Final Cost is :"+countGst(cost));
	}

}
