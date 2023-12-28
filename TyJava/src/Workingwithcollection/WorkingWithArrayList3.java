package Workingwithcollection;

import java.util.ArrayList;
import java.util.Iterator;

public class WorkingWithArrayList3 {

	public static void main(String[] args) {
//		ArrayList a1=new ArrayList<>();
//		a1.add(10);
//		a1.add(20);
//		a1.add(10);
//		a1.add(true);
//		a1.add('S');
//		System.out.println(a1);
//		Iterator i=a1.iterator();
//		while(i.hasNext());
//		{
//			System.out.println(i.next());
//		}
//	
//		
		int num=2552;
		int sum=0;
		while(num!=0)
		{
			int rem=num%10;
			sum=sum+rem;
			num=num/10;
			
		}
		System.out.println("Sum of numbers:"+sum);

	}

}
