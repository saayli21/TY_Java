package array;

import java.util.Scanner;

public class MaximumConsecutiveNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter size of array:");
		int size=sc.nextInt();
		int arr[]=new int[size];
		int ct1[]=new int[size];
		System.out.print("Enter elements in array:");
		for(int i=0;i<arr.length;i++)
			arr[i]=sc.nextInt();
		
		for(int i=0;i<arr.length;i++)
		{
			int ct=1;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					arr[j]=-1;
					ct++;
				}
				else
					break;
				ct1[i]=ct;
			}
		}
		int smallest=ct1[0];
		for(int i=0;i<arr.length;i++)
		{
			if(smallest>ct1[i] &&arr[i]==1)
			{
					int temp=ct1[i];
					smallest=temp;
			}
		}
		System.out.print("Minimum consecutive of 1:"+smallest);
	}
}
	