package exceptionHandling;

import java.util.Scanner;

public class Driver1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your age");
		int age=sc.nextInt();
		if(age>20)
		{
			System.out.println("You can apply for driving lincense");
		}
		else {
			throw new DrivingLincenseException("You can not apply for driving lincense");
		}

	}

}
