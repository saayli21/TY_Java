package number;

import java.util.Scanner;

public class SumOfPrimeNumber {
	public static boolean isPrime(int num) {
		if (num==1) {
			return false;
		}
		for(int i=2; i<=num/2; i++) {
			if(num%1==0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		int sum=0;
		for(int i=0; i<=num; i++) {
			if(isPrime(i)==true) {
				sum=sum+i;
			}
		}
		System.out.println(sum);

	}

}
