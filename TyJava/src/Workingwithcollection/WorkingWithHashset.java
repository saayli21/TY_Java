package Workingwithcollection;

import java.util.HashSet;
import java.util.Iterator;

public class WorkingWithHashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet h=new HashSet();
		h.add(10);
		h.add(20);
		h.add(true);
		h.add("Hello");
		h.add(10);
		h.add(20.5);
		System.out.println(h);
		Iterator i=h.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
		

	}

}
