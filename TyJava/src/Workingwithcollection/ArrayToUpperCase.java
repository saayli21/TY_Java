package Workingwithcollection;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayToUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <String> a1=new ArrayList();
//		a1.add("saloni");
//		a1.add("tanuja");
//		a1.add("roshani");
		
		//USING SCANNER CLASS
		   Scanner sc= new Scanner(System.in);
		   System.out.println("Enter the size of array");
		   int size=sc.nextInt();
		   System.out.println("Enter the elements in array");
		   for(int i=0; i<size; i++) 
		   {
			   a1.add(i,sc.next());
		   }
		   System.out.println("Input from user:"+a1);
		   
		for(int i=0; i<a1.size();i++) 
		{
			a1.set(i, a1.get(i).substring(0,1).toUpperCase()+a1.get(i).substring(1));
		}
		System.out.println("Output:"+a1);
		
		

	}

}
