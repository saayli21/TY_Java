package Encapsulation;

import java.util.Scanner;

public class Driver1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        Bank1 b1=new Bank1(80000,1234);
        System.out.println("Enter the pin");
        int pin=sc.nextInt();
        System.out.println(b1.getbalance(pin));
        
        
	}

}
