package exceptionHandling;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter the age");
         int age=sc.nextInt();
         if(age>18)
         {
        	 System.out.println("You can vote");
         }
         else
         {
        	 throw new UnderAgeException("You can't vote");
         }
	}

}
