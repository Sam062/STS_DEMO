package com.app;
import java.util.Arrays;
import java.util.Scanner;

public class charcountDemo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("input String :");
		String s=sc.nextLine();
		sc.close();
		char[] a=s.toCharArray();
		
		Arrays.sort(a);
		int[] arr=new int[a.length];
		int count=0;
		
		for(int i=0;i<a.length;i++) {
			count=0;
			char x=a[i];
			for (int j = 0; j < a.length; j++) {
				if(x==a[j])
					count++;
				arr[i]=count;
			}
		}
		/*for(int i=0,j=0;i<a.length && j<a.length ;i++,j++)
        {
				System.out.println("'"+a[i]+"'"+" = "+arr[i]);
	            i=i+(arr[i]-1);
	            j=j+(arr[j]-1);
        }*/
		int max=0;
		// finds maximum value from the frequency array
		for(int i=0;i<a.length;i++) {
			max=0;
			for(int j=0;j<a.length;j++) {
				if(max<arr[j])
					max=arr[j];
			}
		}
		int max1=0;
		// Searches for the first max value then breaks the loop 
		//because the char array is already sorted and next array is corresponding to that.
		for(int i=0;i<arr.length;i++) {
			if(max==arr[i]) {
				max1=i;
				break;
			}
		}
		
		System.out.println();
		if(a[max1]==' ')
		{
			System.out.println("Max time character=space");
		}
		else
			System.out.println("Max time character="+"'"+a[max1]+"'");
		
	}
}
