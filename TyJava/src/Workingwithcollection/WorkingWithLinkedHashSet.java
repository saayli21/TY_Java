package Workingwithcollection;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class WorkingWithLinkedHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet l1=new LinkedHashSet();
		l1.add(10);
		l1.add(20);
		l1.add("Hello");
		l1.add(10);
		l1.add(true);
		System.out.println(l1);
		Iterator i=l1.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}

	}

}
