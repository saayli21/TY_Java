package Workingwithcollection;

import java.util.ArrayList;

public class WorkingWithArrayList2 {
	public static void main(String[]args)
	{
	ArrayList a1=new ArrayList<>();
	a1.add(10);
	a1.add(true);
	a1.add(20);
	a1.add(30);
	a1.add(20);
	a1.add("Hie");
	System.out.println(a1);
	System.out.println(a1.indexOf(10));
	System.out.println(a1.indexOf(20));
	System.out.println(a1.lastIndexOf(20));
	System.out.println(a1.lastIndexOf("Hie"));
	System.out.println(a1.set(5, "Sayali"));
	
	for(Object o:a1)
	{
		System.out.println(o);
	}
	}
}
