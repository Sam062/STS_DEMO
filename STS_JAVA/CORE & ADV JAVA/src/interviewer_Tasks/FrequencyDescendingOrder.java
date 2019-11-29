package interviewer_Tasks;

import java.util.Scanner;

public class FrequencyDescendingOrder {
	int[] arr;
	public static void main(String[] args) {
		int i, j, count;
		FrequencyDescendingOrder ob = new FrequencyDescendingOrder();
		Scanner sc=new Scanner(System.in);
		System.out.println("INPUT Size Of ARRAY :");
		int size=sc.nextInt();
		ob.arr=new int[size];

		System.out.print("INPUT ARRAY :");
		for(i=0;i<size;i++)
			ob.arr[i]=sc.nextInt();

		System.out.println("Given Array :");
		for (int x : ob.arr)
			System.out.print(x + " ");
		System.out.println();

		//Sorting the array in Ascending Order
		for(i=0;i<size;i++)
		{
			for(j=0;j<size-i-1;j++)
			{
				if(ob.arr[j]>ob.arr[j+1])
				{
					int temp=ob.arr[j];
					ob.arr[j]=ob.arr[j+1];
					ob.arr[j+1]=temp;
				}
			}
		}
		/*System.out.println("Sorted Array :");
        for (int x : ob.arr)
            System.out.print(x + " ");*/

		// arr1 contains how many times each elements of arr is there.
		int[] arr1 = new int[ob.arr.length];
		for (i = 0; i < ob.arr.length; i++)
		{
			count = 0;
			int x = ob.arr[i];
			for (j = 0; j < ob.arr.length; j++) {
				if (x == ob.arr[j]) {
					count++;
				}
				//Frequency of arr elements is stored in arr1.
				arr1[i] = count;
			}
		}

		System.out.println("\n\nArray Frequency :");
		for(i=0,j=0;i<size && j<size ;i++,j++)
		{
			System.out.println(ob.arr[i]+" = "+arr1[i]+" times");
			// after printing arr1[i] and arr[i] i and j variables are skipping the duplicate elements of both the arrays.
			i=i+(arr1[i]-1);
			j=j+(arr1[j]-1);
		}
		for (int k : arr1) {
			System.out.print(k+" ");
			
		}
	}

}
